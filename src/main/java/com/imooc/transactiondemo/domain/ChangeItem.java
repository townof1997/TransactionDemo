package com.imooc.transactiondemo.domain;

/**
 * @program: com.imooc.transactiondemo.domain
 * @description:
 * @author: 86138_town
 * @create date: 2022/4/4 20 34
 */

public class ChangeItem {
    private String field;
    private String fieldShowName;
    private String oldValue;
    private String newValue;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getFieldShowName() {
        return fieldShowName;
    }

    public void setFieldShowName(String fieldShowName) {
        this.fieldShowName = fieldShowName;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }
}
