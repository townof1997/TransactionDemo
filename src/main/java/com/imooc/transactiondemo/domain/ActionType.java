package com.imooc.transactiondemo.domain;

public enum ActionType {
    INSERT("添加", 1),
    UPDATE("更新", 2),
    DELETE("删除", 3);

    private String name;
    private int index;

    ActionType(String name, int index) {
        this.name = name;
        this.index = index;
    }

//    public static String getName(int index) {
//        for (ActionType a:ActionType.values()) {
//
//        }
//    }
}
