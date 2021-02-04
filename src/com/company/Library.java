package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Library extends Main{


    int[] bookID;
    int totalBooks, signUpDays, bookScannedPerDay;
    boolean isSignedUp;
    int signedUpDay;
    int libID;


    Library(int signUpDays, int totalBooks, int bookScannedPerDay, ArrayList<Integer> bookID, int libID){
        this.bookScannedPerDay = bookScannedPerDay;
        this.totalBooks = totalBooks;
        this.signUpDays = signUpDays;
        this.bookID = bookID;
        this.isSignedUp = false;
        this.libID = libID;
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
            bookScore = bookScore+ bookID.get(i);
        return bookScore;
        totalDays = totalDays - signUpDays;//in main function totalDays will be updated for next library
    }

    int LibraryScore(){
        return (bookScore()/signUpDays);
    }

    public int getLibID() {
        return libID;
    }

}
