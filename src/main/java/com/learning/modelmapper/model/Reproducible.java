package com.learning.modelmapper.model;

import java.util.Arrays;
import java.util.Optional;

public enum Reproducible {

    ALWAYS(1, "Always"),
    SOMETIMES(2, "Sometimes"),
    RARELY(3, "Rarely"),
    UNABLE(4, "Unable"),
    I_DIDNT_TRY(5, "I Didn't Try"),
    NOT_APPLICABLE(6, "Not Applicable");

    private final Integer code;
    private final String  name;

    Reproducible(final int code, final String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static Reproducible getProblemReproducibleByName(String name) {
        Optional<Reproducible> problemReproducible = Arrays.asList(Reproducible.values()).stream()
                .filter(item -> item.getName().equalsIgnoreCase(name))
                .findFirst();
        return problemReproducible.isPresent() ? problemReproducible.get() : null;
    }
}
