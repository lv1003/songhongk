package com.vv.baozhaunglei;

import com.sun.jmx.remote.util.OrderClassLoaders;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

/**
 * Created by vv on 2018/8/29.
 * 包装类:  8种基本类型对应
 * 基本数据类型包装类 及 字符串 及String之间的相互转换
 */
public class TestWrapper {
    //基本数据类型 与包装类之间的转换
    @Test
    public void test1() {
        int i = 10;
        boolean b = false;
        Integer i1 = new Integer(i);
        System.out.println(i1.toString());
        Float f = new Float("12.3F");
        System.out.println(f);
        i1 = new Integer("12");
        System.out.println(i1);
        Boolean b1 = new Boolean(true);
        System.out.println(b1);
        b1 = new Boolean("true");
        System.out.println(b1);
        Order order = new Order();
        System.out.println("$" + order.b);//引用类型   默认null
        //包装类-->基本数据类型
        int i2 = i1.intValue();
        System.out.println(i2);
        float f1 = f.floatValue();
        System.out.println(f1);

    }
}

class Order {
    Boolean b;
}