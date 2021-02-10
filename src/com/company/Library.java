package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Library extends Main{


    ArrayList<Integer> bookID;
    int totalBooks, signUpDays, bookScannedPerDay;
    boolean isSignedUp;
    int signUpInitial, signUpFinal;
    int libID;
    int availableDays;
    ArrayList<Integer> booksScanned;


    Library( int libID,int signUpDays, int bookScannedPerDay, ArrayList<Integer> bookID){
        this.bookScannedPerDay = bookScannedPerDay;
        this.totalBooks = bookID.size();
        this.signUpDays = signUpDays;
        this.bookID = bookID;
        this.isSignedUp = false;
        this.libID = libID;
        availableDays=D;
        booksScanned = new ArrayList<>();
    }


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

    public  void scan(){
        Collections.sort(bookID, Collections.reverseOrder());
        int totalBooksCanBeScanned = availableDays*bookScannedPerDay;


        if(totalBooksCanBeScanned>totalBooks){
            for(int i=0;i<totalBooks;i++){
                booksScanned.add(bookID.get(i));
                availableDays--;
            }
        }
        else{
            for(int i=0;i<totalBooksCanBeScanned;i++){
                booksScanned.add(bookID.get(i));
                availableDays--;
            }
        }

    }

    public ArrayList<Integer> getBooksForScanning(){
        return booksScanned;
    }

}
