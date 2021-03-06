package com.example.journal.model;

public enum Reason {

    SICK(true),
    HOOKY(false),
    VISITED(true);

    private Boolean good;

    Reason(Boolean good) {
        this.good = good;
    }

    public Boolean getGood() {
        return good;
    }
}
