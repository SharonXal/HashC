package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Library extends Main{


    int totalBooks, signUpDays, bookScannedPerDay;
    int[] bookID;//assuming that the bookId is also the book's score
    boolean isSignedUp;



    //initializing the necessary requirements for a Library
    Library(int signUpDays, int totalBooks, int bookScannedPerDay, int bookID[]){
        this.bookScannedPerDay = bookScannedPerDay;
        this.totalBooks = totalBooks;
        this.signUpDays = signUpDays;
        this.bookID = bookID.clone();
        this.isSignedUp = false;
    }
    int bookScore(){
        int avaliableDays = totalDays - signUpDays;
        int booksScannedInTotalAvaliableDays = avaliableDays*bookScannedPerDay;
        Arrays.sort(bookID);
        int[] booksToBeScanned = new int[booksScannedInTotalAvaliableDays];
        for(int i=booksToBeScanned.length;i>0;i--){
            booksToBeScanned[i] = bookID[i];
        }
        this.bookID = booksToBeScanned.clone();
        int bookScore = 0;
        for(int i=0;i<bookID.length;i++)
            bookScore = bookScore+bookID[i];
        return bookScore;
    }
    int LibraryScore(){
        return (bookScore()/signUpDays);
    }
}
