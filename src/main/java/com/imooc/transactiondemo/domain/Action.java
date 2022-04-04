package com.imooc.transactiondemo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: com.imooc.transactiondemo.domain
 * @description:
 * @author: 86138_town
 * @create date: 2022/4/4 20 28
 */

public class Action {
    private String id;
    private Long objectId;
    private String objectClass;
    private String operator;
    private Date operatorTime;
    private ActionType actionType;
    private List<ChangeItem> changs = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public String getObjectClass() {
        return objectClass;
    }

    public void setObjectClass(String objectClass) {
        this.objectClass = objectClass;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public List<ChangeItem> getChangs() {
        return changs;
    }

    public void setChangs(List<ChangeItem> changs) {
        this.changs = changs;
    }
}
