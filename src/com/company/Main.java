package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    static int currentDay=0;
    static  int B=0,L=0,D=0;
    static ArrayList<Library> libraries;
    static  ArrayList<Integer> bookScores;

    public static void main(String[] args) {
//        ArrayList<Integer> bookID0 = new ArrayList<>();
//        bookID0.add(1);
//        bookID0.add(2);
//        bookID0.add(3);
//        ArrayList<Integer> bookID1 = new ArrayList<>();
//        bookID1.add(0);
//        bookID1.add(2);
//        bookID1.add(3);
//        bookID1.add(5);
//        bookID1.add(1);
//        ArrayList<Integer> bookID2 = new ArrayList<>();
//        bookID2.add(0);
//        bookID2.add(2);
//        bookID2.add(3);
//        bookID2.add(5);
//        bookID2.add(9);
//
//        Library lib0 = new Library(0,2,2, bookID0);
//        Library lib1 = new Library(1,3,1,bookID1);
//        Library lib2 = new Library(2,1,1,bookID2);
//        libraries = new ArrayList<>();
//        libraries.add(lib1);
//        libraries.add(lib0);
//        libraries.add(lib2);

        Input ob = new Input();
        ob.loadFile();
        ob.makeEntry();
        B=ob.B;
        L=ob.L;
        D=ob.D;
        libraries = ob.libraries;
        bookScores = ob.bookScores;

        for(Library lib : libraries){
            lib.signUp();
            //lib.scan();
            //lib.scan(lib.libraryAvailableDays());
            lib.libraryScore();
        }
//
//        System.out.println("Library 0 : ");
//        for(int x: lib0.getBooksForScanning()){
//            System.out.println(x+" ,");
//        }
//        System.out.println("Library 1 : ");
//        for(int x: lib1.getBooksForScanning()){
//            System.out.println(x+" ,");
        }

        //ArrayList<Integer> commons = lib1.updatedBookList(lib0.bookID);

    }

    //hello world
