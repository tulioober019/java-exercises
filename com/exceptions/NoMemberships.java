package com.exceptions;

public class NoMemberships extends Exception {

    public NoMemberships() {
        super();
    }

    @Override
    public String getMessage() {
        return "There are no members registerd to this libary!";
    }
}
