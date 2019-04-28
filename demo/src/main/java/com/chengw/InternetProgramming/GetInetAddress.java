package com.chengw.InternetProgramming;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class GetInetAddress {//InetAddress������Ӧ��
    public GetInetAddress() {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Name:" + address.getHostName());
            System.out.println("IP:" + address.getHostAddress());
            byte[] bytes = address.getAddress();
            System.out.println("bytemode-IP:" + Arrays.toString(bytes));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
