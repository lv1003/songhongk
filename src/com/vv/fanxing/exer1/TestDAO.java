package com.vv.fanxing.exer1;

import java.util.HashMap;
import java.util.List;

/**
 * Created by vv on 2018/9/12.
 */
public class TestDAO {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<User>();
        dao.map = new HashMap<String, User>();
        dao.save("1001", new User(1, 32, "刘嘉玲"));
        dao.save("1002", new User(2, 25, "汤唯"));
        dao.save("1003", new User(3, 36, "梁朝伟"));
        User user=dao.get("1002");
        System.out.println(user);
        dao.update("1002",new User(4,33,"张曼玉"));
        dao.delete("1003");
        List<User> list=dao.list();
        System.out.println(list);

    }
}
