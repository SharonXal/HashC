package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    static int currentDay=0;
    static final int D=7;

    public static void main(String[] args) {
        ArrayList<Integer> bookID0 = new ArrayList<>();
        bookID0.add(0);
        bookID0.add(1);
        bookID0.add(2);
        bookID0.add(3);
        bookID0.add(4);
        ArrayList<Integer> bookID1 = new ArrayList<>();
        bookID1.add(0);
        bookID1.add(2);
        bookID1.add(3);
        bookID1.add(5);

        Library lib0 = new Library(0,2,2, bookID0);
        Library lib1 = new Library(1    ,3,1,bookID1);

        ArrayList<Library> libraries = new ArrayList<>();
        libraries.add(lib1);
        libraries.add(lib0);
        for(Library lib : libraries){
            lib.signUp();
            lib.scan();
        }

        System.out.println("Library 0 : ");
        for(int x: lib0.getBooksForScanning()){
            System.out.println(x+" ,");
        }
        System.out.println("Library 1 : ");
        for(int x: lib1.getBooksForScanning()){
            System.out.println(x+" ,");
        }

    }
}
