package com.learning.modelmapper.model;

public class Request {

    private Long requestId;
    private String title;
    private Classification classification;
    private Reproducible reproducible;

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

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public Reproducible getReproducible() {
        return reproducible;
    }

    public void setReproducible(Reproducible reproducible) {
        this.reproducible = reproducible;
    }
}
