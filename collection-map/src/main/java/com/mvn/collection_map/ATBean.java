package com.mvn.collection_map;

import java.util.Map;

public class ATBean {
    private Map<String, String> studentdetails;

    public ATBean(Map<String, String> studentdetails) {
        this.studentdetails = studentdetails;
    }

    public ATBean() {
    }

    public void setStudentdetails(Map<String, String> studentdetails) {
        this.studentdetails = studentdetails;
    }

    public Map<String, String> getStudentdetails() {
        return this.studentdetails;
    }

    public void print() {
        for (Map.Entry<String, String> entry : studentdetails.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
