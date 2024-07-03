package com.libary.services;

import com.libary.models.Book;
import com.libary.models.Member;

public class Library implements Borrowable{
    private Book[] books = {
        new Book(1, "The Adventures of Tom Sawyer", "Mark Twain"),
        new Book(2, "Animal Farm", "George Orwell"),
        new Book(3,"Tresure Island", "Julio Verne"),
        new Book(4, "The Great Gatsby", "F. Scott Fitzgerald")
    };
    private Member[] members = {
        new Member(1, "Brian Griffin"),
        new Member(2, "Benson the Park Manager")
    };

    public Library() {

    }

    public void searchBooks(String title, String author) {
        //System.out.println("|\tTitle\t|\tAuthor\t|\tBorrowed\t|");
        //System.out.println("+");
        if (title == "" && author == "") {
            for (Book book : books) {
                System.out.println(book.getTitle() + "," + book.getAuthor() + "," + book.getStatus());
            }

        } else {
            if (title != "" && author != "") {
                for (Book book : books) {
                    if (book.getTitle() == title || book.getAuthor() == author) {
                        System.out.println(book.getTitle() + "," + book.getAuthor() + "," + book.getStatus());
                    }
                }
            } else {
                if (title != "" && author == "") {
                    for (Book book : books) {
                        if (book.getTitle() == title) {
                            System.out.println(book.getTitle() + "," + book.getAuthor() + "," + book.getStatus());
                        }
                    }
                } else {
                    for (Book book : books) {
                        if (book.getAuthor() == author) {
                            System.out.println(book.getTitle() + "," + book.getAuthor() + "," + book.getStatus());
                        }
                    }
                }
            }

        }
    }

    public void searchMembers(String name) {

        if (name == "") {
            for (Member mem : members) {
                System.out.println(mem.getName());
            }
        } else {
            for (Member mem : members) {
                if (mem.getName() == name) {
                    System.out.println(mem.getName());
                    break;
                } else {
                    System.out.println("Member does not exist");
                    break;
                }
            }
        }
    }
    
    @Override
    public void borrowBook(int bookID, int memberID) {
        //boolean memberStatus = memberExists(memberID);
    }

    @Override
    public void returnBook(int bookID, int memberID) {

    }

}
