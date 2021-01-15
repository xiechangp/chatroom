package cn.edu.hcnu.client;

public class Client {
    public static void main(String[] args) throws Exception{//主方法:启动登录线程
        Thread login = new LoginThread();
        login.start();
    }
}
