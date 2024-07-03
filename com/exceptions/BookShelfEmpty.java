package com.exceptions;

public class BookShelfEmpty extends Exception{

    public BookShelfEmpty() {
        super();
    }

    @Override
    public String getMessage() {
        return "The bookshelf is currently empty!";
    }
}
