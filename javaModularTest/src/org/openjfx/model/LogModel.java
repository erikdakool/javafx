package org.openjfx.model;

public class LogModel {
    private String from;
    private String to;
    private String description;
    private String actID;
    private String costCode;

    public LogModel(String f, String t, String d, String a, String c){
        this.from = f;
        this.to = t;
        this.description = d;
        this.actID = a;
        this.costCode = c;
    }

    public LogModel(){}

    //GETTERS AND SETTERS
    //From
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    //To
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    //Description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //ActID
    public String getActID() {
        return actID;
    }

    public void setActID(String actID) {
        this.actID = actID;
    }

    //Cost code
    public String getCostCode() {
        return costCode;
    }

    public void setCostCode(String costCode) {
        this.costCode = costCode;
    }
}
