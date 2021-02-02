package com.company;

public class Library {
    int totalBooks, signUpDays, bookID;
    boolean isSignedUp;
    Library(int totalBooks, int signUpDays){
        this.totalBooks = totalBooks;
        this.signUpDays = signUpDays;
        //this.bookID = bookID;
        this.isSignedUp = false;
    }
}
