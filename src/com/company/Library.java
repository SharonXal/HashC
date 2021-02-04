package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Library extends Main{


    ArrayList<Integer> bookID;
    int totalBooks, signUpDays, bookScannedPerDay;
    boolean isSignedUp;
    int signUpInitial, signUpFinal;
    int libID;
    int availableDays;


    Library( int libID,int signUpDays, int bookScannedPerDay, ArrayList<Integer> bookID){
        this.bookScannedPerDay = bookScannedPerDay;
        this.totalBooks = bookID.size();
        this.signUpDays = signUpDays;
        this.bookID = bookID;
        this.isSignedUp = false;
        this.libID = libID;
        availableDays=D;
    }


//    int bookScore(){
//        int avaliableDays = totalDays - signUpDays;
//        int booksScannedInTotalAvaliableDays = avaliableDays*bookScannedPerDay;
//        //Arrays.sort(bookID);
//        int[] booksToBeScanned = new int[booksScannedInTotalAvaliableDays];
//        for(int i=booksToBeScanned.length;i>0;i--){
//            booksToBeScanned[i] = bookID.get(i);
//        }
//        this.bookID = booksToBeScanned.clone();
//        int bookScore = 0;
//        for(int i=0;i<bookID.length;i++)
//            bookScore = bookScore+bookID[i];
//        return bookScore;
//    }

//    int LibraryScore(){
//        return (bookScore()/signUpDays);
//    }

    public int getLibID() {
        return libID;
    }
    int libraryAvailableDays(){
        return availableDays;
    }
    public void signUp(){
            isSignedUp=true;
            signUpInitial=currentDay;
            signUpFinal=currentDay+signUpDays;
            currentDay+=signUpDays;
            availableDays = D - signUpFinal;
        }

        public ArrayList<Integer> getBooksForScanning(){
            Collection.sort(bookID, Collections.reverseOrder());
        }

    }
