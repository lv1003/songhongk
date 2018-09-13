package com.vv.bank.banking8.domain;

/**
 * Created by vv on 2018/9/13.
 * 自定义异常类
 */
public class OverdraftException extends Exception{
    static final long serialVersionUID = -3387516993146456248L;
  private double deficit;  //表示所取得钱和余额的差额

    public double getDeficit() {
        return deficit;
    }

    public OverdraftException(String msg, double deficit) {
        super(msg);
        this.deficit = deficit;
    }

}
