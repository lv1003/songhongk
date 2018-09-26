package com.vv.duoxiancheng;

/**
 * Created by vv on 2018/9/25.
 * 模拟火车站售票窗口 开启三个窗口售票  总票数:100张
 */

class Window extends Thread {
  static int ticket = 100;//类变量 共用 100张

    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "售票，票号为:" + ticket--);
            } else {
                break;
            }
        }
    }
}

public class TestWindow {
    public static void main(String[] args) {
        Window window = new Window();
        Window window1 = new Window();
        Window window2 = new Window();
        window.setName("窗口1");
        window1.setName("窗口2");
        window2.setName("窗口3");
        window.start();
        window1.start();
        window2.start();
    }
}
