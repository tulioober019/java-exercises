package com.libary.models;

public class Book {
    private int bookID; // Book ID
    private String title, author; // Book title and author.
    private boolean isBorrowed = false; // Book borrowed status. By default it is set to false. 

    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }

    public Book(int bookID, String title) {
        this.bookID = bookID;
        this.title = title;
    }

    public void setBookToBorrowed() {
        this.isBorrowed = true;
    }

    public void setBookToReturned() {
        this.isBorrowed = false;
    }

    public int getbookID() {
        return this.bookID;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean getStatus() {
        return this.isBorrowed;
    }
    
}
