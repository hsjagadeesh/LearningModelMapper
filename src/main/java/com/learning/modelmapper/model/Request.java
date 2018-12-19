package com.learning.modelmapper.model;

public class Request {

    private Long requestId;
    private String title;
    private String classification;
    private String reproducible;

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

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getReproducible() {
        return reproducible;
    }

    public void setReproducible(String reproducible) {
        this.reproducible = reproducible;
    }
}
