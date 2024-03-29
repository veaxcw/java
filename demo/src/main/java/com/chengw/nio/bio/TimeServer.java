package com.chengw.nio.bio;

import com.chengw.nio.fakeasynblockio.TimerServerHandlerExcutePool;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 伪异步阻塞模型
 * @author chengw
 */
public class TimeServer {

    public static void main(String[] args) {
        int port = 8080;
        if(args != null && args.length != 0){
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        ServerSocket server = null;

        try {
            server = new ServerSocket(port);
            System.out.println("服务端已启动,端口号：" + port);
            Socket socket = null;


            while (true) {
                socket = server.accept();
                if(socket != null){
                    new Thread(new TimeServerHandler(socket)).start();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(server != null){
                try {
                    server.close();
                    System.out.println("服务端已关闭");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

}
