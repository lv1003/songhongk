package com.vv.stringexer;

/**
 * Created by vv on 2018/8/29.
 */
public class TestOrder {
    public static void main(String[] args) {
        Order order1 = new Order(1001, "AA");
        Order order2 = new Order(1001, "AA");
        System.out.println(order1 == order2);
        System.out.println(order1.equals(order2));//false --> true   调用了重写的 equals 方法
    }
}


class Order {
    private int orderId;
    private String orderName;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    //比较两个Order对象的属性 是否完全相同,相同的话返回true
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object instanceof Order) {
            Order order = (Order) object;
            return this.getOrderId() == order.orderId && this.orderName.equals(order.orderName);
        } else {
            return false;
        }
    }
}

