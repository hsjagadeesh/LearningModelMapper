package com.learning.modelmapper.model;

public class Request {

    private Long requestId;
    private String title;
    private ProblemClassification classification;
    private ProblemReproducible reproducible;

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

    public ProblemClassification getClassification() {
        return classification;
    }

    public void setClassification(ProblemClassification classification) {
        this.classification = classification;
    }

    public ProblemReproducible getReproducible() {
        return reproducible;
    }

    public void setReproducible(ProblemReproducible reproducible) {
        this.reproducible = reproducible;
    }
}
