package com.learning.modelmapper.model;

import java.util.Arrays;
import java.util.Optional;

public enum Classification {

    SECURITY(1, "Security"),
    CRASH_HANG_DATA_LOSS(2, "Crash/Hang/Data Loss"),
    POWER(3, "Power"),
    PERFORMANCE(4, "Performance"),
    UI_USABILITY(5, "UI/Usability"),
    SERIOUS_BUG(7, "Serious Bug"),
    OTHER_BUG(8, "Other Bug"),
    FEATURE_NEW(10, "Feature (New)"),
    ENHANCEMENT(11, "Enhancement"),
    TASK(13, "Task");

    private final Integer code;
    private final String  name;

    Classification(final int code, final String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static Classification getProblemClassificationByName(String name) {
        Optional<Classification> problemClassification = Arrays.asList(Classification.values()).stream()
                .filter(item -> item.getName().equalsIgnoreCase(name))
                .findFirst();
        return problemClassification.isPresent() ? problemClassification.get() : null;
    }

}
