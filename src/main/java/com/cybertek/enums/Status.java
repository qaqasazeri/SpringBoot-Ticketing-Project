package com.cybertek.enums;

public enum Status {
    OPEN("Open"),IN_PROGRESS("In_Progress"),UAT_TEST("UAT_Testing"),COMPLETE("Completed");

    private final String value;
    private Status(String value) {
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
