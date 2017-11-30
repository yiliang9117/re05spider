package cn.rootadmin;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
public class ThreadTest {

    public static void main(String[] args) {
        for (int i = 0; i < 999999999; i++) {
            Thread myThread1 = new MyThread();     // 创建一个新的线程  myThread1  此线程进入新建状态
            myThread1.start();                     // 调用start()方法使得线程进入就绪状态
            Thread myThread2 = new MyThread();     // 创建一个新的线程 myThread2 此线程进入新建状态
            myThread2.start();                     // 调用start()方法使得线程进入就绪状态
            Thread myThread3 = new MyThread();     // 创建一个新的线程 myThread2 此线程进入新建状态
            myThread3.start();                     // 调用start()方法使得线程进入就绪状态
            Thread myThread4 = new MyThread();     // 创建一个新的线程 myThread2 此线程进入新建状态
            myThread4.start();                     // 调用start()方法使得线程进入就绪状态
            Thread myThread5 = new MyThread();     // 创建一个新的线程 myThread2 此线程进入新建状态
            myThread5.start();                     // 调用start()方法使得线程进入就绪状态
            Thread myThread6 = new MyThread();     // 创建一个新的线程 myThread2 此线程进入新建状态
            myThread6.start();                     // 调用start()方法使得线程进入就绪状态
            Thread myThread7 = new MyThread();     // 创建一个新的线程 myThread2 此线程进入新建状态
            myThread7.start();                     // 调用start()方法使得线程进入就绪状态
            Thread myThread8 = new MyThread();     // 创建一个新的线程 myThread2 此线程进入新建状态
            myThread8.start();                     // 调用start()方法使得线程进入就绪状态
            Thread myThread9 = new MyThread();     // 创建一个新的线程 myThread2 此线程进入新建状态
            myThread9.start();                     // 调用start()方法使得线程进入就绪状态
        }
    }
}
