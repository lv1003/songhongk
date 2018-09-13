package com.vv.yichang2;

import com.vv.yichang1.MyException;

import java.security.PublicKey;

/**
 * Created by vv on 2018/9/4.
 */
public class EcmDef {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);//被除数
            int j = Integer.parseInt(args[1]);//除数
            ecm(i,j);
        } catch (EcDef ecDef) {
            System.out.println(ecDef.getMessage());
        }catch (NumberFormatException e){
            System.out.println("输入的数据类型不一致");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e){
            System.out.println("分母为零");
        }
    }

    public static void ecm(int i, int j) throws EcDef {
      if (i<0||j<0){
          throw new EcDef("您输入的数值存在负数!");
      }
        System.out.println(i/j);
    }
}

// 自定义异常类
class EcDef extends Exception {
    static final long serialVersionUID = -3387522993124229948L;

    public EcDef() {

    }

    public EcDef(String msg) {
        super(msg);
    }
}
