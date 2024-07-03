package com.libary.models;

//import com.exceptions.BookShelfEmpty;

public class Member {
    private int memberID;
    private String name;
    private Book[] borrowedBooks;

    public Member(int memberID, String name) {
        this.memberID = memberID;
        this.name = name;
    }

    public int getMemberID() {
        return this.memberID;
    }

    public String getName() {
        return this.name;
    }
}
