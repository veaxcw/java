package com.chengw.thread.lock.volatiledemo;

/**
 * volatile �ɼ��Ա�֤
 * @author chengw
 */
public class VolatileViableDemo {
    /**
     * volatile ��֤�� �����̶߳Ա����Ŀɼ���
     * Ҳ���� ��ǰ�߳��ڲ�����������뽫������ֵ�������ڴ��,
     * �����߳��ٲ���֮ǰ��������ڴ��ж�ȡ������ֵ
     * **/

    private static volatile int finished = 0;

    //private static int finished = 0;

    private static void check(){
        while (finished == 0){
            System.out.println("���ɼ��� ��������");
        }
        System.out.println("�ұ��һ�� ��������");
    }

    private static void finish(){
        finished = 1;
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->check()).start();
        Thread.sleep(100);
        finish();
    }

}
