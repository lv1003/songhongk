package com.vv.enmu;

import javax.sound.midi.MidiDevice;

/**
 * Created by vv on 2018/9/7.
 */
public class TestSeason1 {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        System.out.println(spring);
        spring.show();
        System.out.println(spring.getSeasonName() + "===" + spring.getSeasonDesc());
        System.out.println();
        //1.常用的方法 : values()
        Season1[] season1s = Season1.values();
        for (int i = 0; i < season1s.length; i++) {
            System.out.println(season1s[i]);
        }
        //2.valueOf(String name)
        String str = "WINTER";
        // String str="SPRING1";//No enum constant
        Season1 season1 = Season1.valueOf(str);
        System.out.println(season1);

        season1.show();


        System.out.println("线程生命周期");
        Thread.State[] states = Thread.State.values();
        for (int i = 0; i < states.length; i++) {
            System.out.println(states[i]);
        }
    }

}

interface Info {
    void show();

}

//枚举类
enum Season1 implements Info {
    SPRING("spring", "春暖花开") {
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUMMER("summer", "夏日炎炎") {
        public void show() {
            System.out.println("生如夏花");
        }
    },
    AUTUMN("autumn", "秋高气爽") {
        public void show() {
            System.out.println("秋天是用来分手的季节");
        }
    },
    WINTER("winter", "白雪皑皑") {
        public void show() {
            System.out.println("冬天里的一把火");
        }
    };

    private final String seasonName;
    private final String seasonDesc;

    //2.声明为final的属性,在构造器中初始化.一旦初始化 ,不可被修改
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //3.通过公共的方法来调用属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    //4.创建枚举类的对象

    public void show() {
        System.out.println("这是一个季节");
    }
}

