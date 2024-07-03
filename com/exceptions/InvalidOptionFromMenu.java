package com.exceptions;

import java.lang.Exception;

public class InvalidOptionFromMenu extends Exception {
    private int min = 0;
    private int max = 0;

    public InvalidOptionFromMenu(int min, int max) {
        super();
        this.min = min;
        this.max = max;
    }

    @Override
    public String getMessage() {
        return "The option you have chossen is invalid. The integer must be between " + min + " and " + max;
    }
}
