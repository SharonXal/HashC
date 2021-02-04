package com.company;

import java.util.ArrayList;

public class Library extends Main{


    ArrayList<Integer> bookID;
    int totalBooks, signUpDays, bookScannedPerDay;
    boolean isSignedUp;
    int signUpInitial, signUpFinal;
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
            bookScore = bookScore+bookID[i];
        return bookScore;
        totalDays = totalDays - avaliableDays;//in main function totalDays will be updated for next library
    }

    int LibraryScore(){
        return (bookScore()/signUpDays);
    }

    public int getLibID() {
        return libID;
    }
    public void signUp(){
        if(!isSigningUp){
            isSignedUp=true;
            signUpInitial=currentDay;
            signUpFinal=currentDay+signUpDays;
            currentDay+=signUpDays;
            isSigningUp=false;
        }
    }

}
