package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Library extends Main{


    ArrayList<Integer> bookID;
    int totalBooks, signUpDays, bookScannedPerDay;
    boolean isSignedUp;
    int lidID;


    Library(int signUpDays, int totalBooks, int bookScannedPerDay, ArrayList<Integer> bookID){
        this.bookScannedPerDay = bookScannedPerDay;
        this.totalBooks = totalBooks;
        this.signUpDays = signUpDays;
        this.bookID = bookID;
        this.isSignedUp = false;
    }
    int bookScore(){
        int avaliableDays = totalDays - signUpDays;
        int booksScannedInTotalAvaliableDays = avaliableDays*bookScannedPerDay;
        //Arrays.sort(bookID);
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
