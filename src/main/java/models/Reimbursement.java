package models;

import java.util.Date;

public class Reimbursement {
    private Integer reimbId;
    private Integer status;
    private Integer amount;
    private Integer type;
    private Integer userId;
    private Date dateCreated;
    private Integer roleId;
    private Date dateResolved;

    public Reimbursement() {
    }

    public Reimbursement(Integer reimbId, Date dateCreated, Date dateResolved){
        this.reimbId = reimbId;
        this.dateCreated = dateCreated;
        this.dateResolved = dateResolved;
    }

    public Reimbursement(Integer status, Integer amount, Integer type, Integer userId, Integer roleId) {
        this.reimbId = null;
        this.status = status;
        this.amount = amount;
        this.type = type;
        this.userId = userId;
        this.dateCreated = null;
        this.roleId = roleId;
        this.dateResolved = null;
    }

    public Reimbursement(Integer reimbId, Integer status, Integer amount, Integer type, Integer userId, Date dateCreated, Integer roleId, Date dateResolved){
        this.reimbId = reimbId;
        this.status = status;
        this.amount = amount;
        this.type = type;
        this.userId = userId;
        this.dateCreated = dateCreated;
        this.roleId = roleId;
        this.dateResolved = dateResolved;
    }

    public Reimbursement(int anInt, int anInt1, int anInt2) {
    }

    public Integer getReimbId() {
        return reimbId;
    }

    public void setReimbId(Integer reimbId) {
        this.reimbId = reimbId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getDateCreated() {return dateCreated;}

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Date getDateResolved() {return dateResolved;}

    public void setDateResolved(Date dateResolved) {
        this.dateResolved = dateResolved;
    }

    @Override
    public String toString() {
        return "Reimbursement{" +
                "reimbId=" + reimbId +
                ", status=" + status +
                ", amount=" + amount +
                ", type=" + type +
                ", userId=" + userId +
                ", dateCreated=" + dateCreated +
                ", roleId=" + roleId +
                ", dateResolved=" + dateResolved +
                '}';
    }
}