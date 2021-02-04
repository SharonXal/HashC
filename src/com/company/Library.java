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
        //assuming that the array containing book ids is already given
        this.bookID = bookID.clone();
        //in the above process i am cloning the array of the book id that will be given as input in another array for further calculations
        //the process for getting book id is shown below, you can use some other method but pls make sure that it's an array.
        //this.bookID = new int[totalBooks];//this is the process of getting the book id and should will be done during the input,
        //make sure to get the id in array and give that array for this process.
        //also input all the data like bookId and etc in the Main class
        this.isSignedUp = false;
    }
    int bookScore(){
        //calculating avaliable days for a library
        int avaliableDays = totalDays - signUpDays;
        //counting how many books can be scanned in the avaliableDays
        int booksScannedInTotalAvaliableDays = avaliableDays*bookScannedPerDay;
        //sorting the books according to their ID(or Score)
        Arrays.sort(bookID);
        //making an array which will hold the books to be scanned in the given days according to their score
        int[] booksToBeScanned = new int[booksScannedInTotalAvaliableDays];
        for(int i=booksToBeScanned.length;i>0;i--){
            booksToBeScanned[i] = bookID[i];
        }
        //copying booksToBeScanned array into bookID array
        this.bookID = booksToBeScanned.clone();
        //summing the book score for all the books that will be scanned only
        int bookScore = 0;
        for(int i=0;i<bookID.length;i++)
            bookScore = bookScore+bookID[i];
        return bookScore;
    }
    int LibraryScore(){
        //to find library score based on the book score
        return (bookScore()/signUpDays);
    }
}
