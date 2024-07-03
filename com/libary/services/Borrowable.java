package com.libary.services;

public interface Borrowable {

    public void borrowBook(int bookID, int memberID);

    public void returnBook(int bookID, int memberID);
}
