package com.learning.modelmapper.model;

import java.io.Serializable;

public class RequestDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long requestId;
    private String title;
    private Integer classification;
    private Integer reproducibleCode;

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public Integer getReproducibleCode() {
        return reproducibleCode;
    }

    public void setReproducibleCode(Integer reproducibleCode) {
        this.reproducibleCode = reproducibleCode;
    }

    @Override
    public String toString() {
        return "RequestDTO{" +
                "requestId=" + requestId +
                ", title='" + title + '\'' +
                ", classification=" + classification +
                ", reproducibleCode=" + reproducibleCode +
                '}';
    }
}