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
    public int libraryScore;


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

        public void libraryScore(){
            libraryScore=0;
            int scoresSum=0;
            for(int x: bookID)
                scoresSum+=x;
            libraryScore=(scoresSum*bookScannedPerDay)/signUpDays;
        }

    public int getLibraryScore() {
        return libraryScore;
    }

    public ArrayList<Integer> updatedBookList(ArrayList<Integer> other){
        //TODO create and return new array list
            for(int i: booksScanned){
                if(other.contains(i)){
                    other.remove(i);
                }
            }
            Collections.sort(other, Collections.reverseOrder());
            return other;
        }

    }
