package com.vv.fanxing;

import org.junit.Test;

import java.util.*;

/**
 * Created by vv on 2018/9/7.
 * 1.在集合中使用泛型(掌握)
 * 2.自定义泛型类、泛型接口、泛型方法（理解--->使用）
 * 3.泛型与继承的关系
 * 4.通配符
 */
public class TestGeneric {
    /**
     * 通配符的使用
     */
    @Test
    public void test7() {
        List<String> list = new ArrayList<String>();
        list.add("AA");
        list.add("BB");
        List<?> list1 = list;
        //可以读取声明为通配符的集合类的对象
        Iterator<?> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //不容许向 声明为通配符的集合类中写入对象 唯一例外的null  只可以读
        //list1.add("CC");
        //list1.add(123);
        list1.add(null);
    }


    /**
     * List<A> List<B>   都是List<?>的子类
     * ? extends A:可以存放A及其子类
     * ? super A：可以存放A及其父类
     */
    @Test
    public void test6() {
        List<?> list = null;
        List<Object> list1 = new ArrayList<Object>();
        List<String> list2 = new ArrayList<String>();
        list = list1;
        list = list2;
        show(list1);
        show(list2);
        show1(list1);
        // show1(list2);
        List<? extends Number> list3 = null;
        List<Integer> list4 = null;
        list3 = list4;
        //  list3=list1;    list1是Object类型
    }

    public void show(List<?> list) {

    }

    public void show1(List<Object> list) {

    }

    //泛型与继承的关系
    //若类A是类B的子类,那么List<A>就不是List<B>的子接口
    @Test
    public void test5() {

        Object object = null;
        String string = "AA";
        object = string;
        Object[] obj1 = null;
        String[] str1 = new String[]{"AA", "BB", "CC"};
        obj1 = str1;
        //并列关系的父类
        List<Object> list = null;
        List<String> list1 = new ArrayList<String>();
        // list=list1;
        //假设list=list1 满足


    }


    //自定义泛型类的使用
    @Test
    public void test4() {
        //1.当实例化泛型类对象时，指明泛型的类型。
        // 指明以后，对应的类中所有使用泛型的位置，都变为实例化中指定的泛型的类型
        //2.如果我们自定义了泛型类，但是在实例化时没有使用，那么默认类型是Object类型
        Order<Boolean> order = new Order<Boolean>();
        order.setT(true);
        System.out.println(order.getT());
        order.add();  //t 的属性添加到List 当中了
        List<Boolean> list = order.list;
        System.out.println(list);
        //
        SubOrder subOrder = new SubOrder();
        List<Integer> list1 = subOrder.list;
        System.out.println(list1);
        //当通过对象调用泛型方法时 指明泛型方法的类型     当通过对象调泛型方法时 指明泛型方法的类型
        Integer i = order.getE(34);
        Double d = order.getE(2.3);
        Integer[] in = new Integer[]{1, 2, 3};
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = order.fromArrayToCollection(in, list2);
        System.out.println(list3);
    }

    @Test
    public void test3() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("AA", 78);
        map.put("BB", 78);
        map.put("DD", 78);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> o : set) {
            System.out.println(o.getKey() + "----->" + o.getValue());

        }
    }

    //2.在集合中使用泛型
    @Test
    public void test2() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(89);
        list.add(87);
        list.add(67);
        //指定数据类型
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    //1.没有使用泛型的情况下
    @Test
    public void test1() {
        List list = new ArrayList();
        list.add(89);
        list.add(87);
        list.add(67);
        //1.没有使用泛型，任何Object及其子类的对象都可以添加进来
        list.add(new String("AA"));
        for (int i = 0; i < list.size(); i++) {
            //2.强转为int型时 出现类型转换异常java.lang.ClassCastException
            int score = (Integer) list.get(i);
            System.out.println(score);
        }

    }

}
