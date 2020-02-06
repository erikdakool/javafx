package org.openjfx.model;

public class EquipmentModel {
    private String description;
    private String quantity;
    private String owner;
    private String dateOn;
    private String dateOff;
    private String rate;
    private String taskNumber;

    public EquipmentModel(String d, String q, String o, String on, String off, String r, String t){
        this.description = d;
        this.quantity = q;
        this.owner = o;
        this.dateOn = on;
        this.dateOff = off;
        this.rate = r;
        this.taskNumber = t;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDateOn() {
        return dateOn;
    }

    public void setDateOn(String dateOn) {
        this.dateOn = dateOn;
    }

    public String getDateOff() {
        return dateOff;
    }

    public void setDateOff(String dateOff) {
        this.dateOff = dateOff;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(String taskNumber) {
        this.taskNumber = taskNumber;
    }


}
