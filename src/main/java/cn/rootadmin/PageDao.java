package cn.rootadmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PageDao {
    
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        }
    }

    public Connection getConn()  {
        try {
            return DriverManager.getConnection("jdbc:mysql://rm-uf654gsgzvn4y12a7o.mysql.rds.aliyuncs.com:3306/spider","root","Wyl15223217981");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null ;
    }
    


    public void insert(String movieName,String movieUrl , String dowloadUrlDetaStr){
        try {
            Connection conn = this.getConn();
            PreparedStatement ppst = conn.prepareStatement("insert into movies(movie_name,movie_url,deta_str) values(?,?,?) ");
            ppst.setString(1,movieName);
            ppst.setString(2,movieUrl);
            ppst.setString(3,dowloadUrlDetaStr);
            ppst.executeUpdate();
            ppst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
