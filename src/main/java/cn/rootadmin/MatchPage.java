package cn.rootadmin;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 匹配页面信息
 * 
 * @author 王宜亮
 * @version 2017年8月26日 下午2:46:17
 */
public class MatchPage {

	// 请求地址验证器
	UrlVerify urlVerify = new UrlVerify();

	private PageDao dao = new PageDao();

	/**
	 * 传进来列表页面 获取子页面地址
	 * 
	 * @param page
	 *            列表页
	 * @return 子页面Url列表
	 */
	public ArrayList<String> getItemList(String page) {

		Matcher m = Pattern.compile("blank\" href=\"([^\"]+)\"><img class=\"pure-img").matcher(page);
		ArrayList<String> itemPageList = new ArrayList<String>();
		while (m.find()) {
			if (urlVerify.testUrlRepeat(m.group(1))) {
				itemPageList.add(m.group(1));
			}
		}
		return itemPageList;
	}

	/**
	 * 获取的单个电影的详细信息
	 * 
	 * @param page
	 */
	public void getMovieItemInfo(String page, String itemUrl) {

		// String movieTxt = new String();

		String movieName = null;
		String dowloadUrlDetaStr = null;

		// 获取电影名称
		Matcher movieNameMatcher = Pattern.compile("<h1>([^<]+)</h1").matcher(page);
		while (movieNameMatcher.find()) {
			movieName = movieNameMatcher.group(1).trim();
			System.out.println("电影名称：" + movieName);
			// movieTxt += movieName + "\n";
		}

		// movieTxt += itemUrl + "\n";

		// 获取下载链接列表
		Matcher dowloadUrlDetaMatcher = Pattern.compile("<div class=\"movie-txt\">([\\s\\S]*?)</div>").matcher(page);
		while (dowloadUrlDetaMatcher.find()) {
			String dowloadUrlDeta = dowloadUrlDetaMatcher.group(1).trim();
			// System.out.println("下载地址信息："+dowloadUrlDeta);
			dowloadUrlDetaStr = dowloadUrlDeta.trim();

			// movieTxt += dowloadUrlDetaStr + "\n\n";
		}

		// 存储到数据库
		dao.insert(movieName, itemUrl, dowloadUrlDetaStr);

		/*
		 * try { String data = movieTxt;
		 * 
		 * File file = new File("movie.txt");
		 * 
		 * if (!file.exists()) { file.createNewFile(); }
		 * 
		 * // true = append file FileWriter fileWritter = new
		 * FileWriter(file.getName(), true); BufferedWriter bufferWritter = new
		 * BufferedWriter(fileWritter); bufferWritter.write(data);
		 * bufferWritter.close();
		 * 
		 * } catch (IOException e) { e.printStackTrace(); }
		 */

	}
}
