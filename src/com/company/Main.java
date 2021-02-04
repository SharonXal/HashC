package com.company;

import java.util.ArrayList;

public class Main {

    static int currentDay=0;
    static final int D=7;

    public static void main(String[] args) {
        ArrayList<Integer> bookID0 = new ArrayList<>();
        bookID0.add(0);
        ArrayList<Integer> bookID1 = new ArrayList<>();
        bookID1.add(0);
        bookID1.add(1);
        bookID1.add(2);

        Library lib0 = new Library(2,1,1,bookID0,0);
        Library lib1 = new Library(3,3,1,bookID1,1);

        ArrayList<Library> libraries = new ArrayList<>();
        libraries.add(lib0);
        libraries.add(lib1);
        for(Library lib : libraries){
            lib.signUp();
        }


    }
}
