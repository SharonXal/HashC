package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    static int currentDay=0;
    static final int D=7;
    static ArrayList<Library> libraries;

    public static void main(String[] args) {
        ArrayList<Integer> bookID0 = new ArrayList<>();
        bookID0.add(1);
        bookID0.add(11);
        bookID0.add(211);
        bookID0.add(311);
        bookID0.add(41);
        bookID0.add(412);bookID0.add(411);bookID0.add(413);bookID0.add(415);bookID0.add(416);bookID0.add(4231);bookID0.add(4141);
        ArrayList<Integer> bookID1 = new ArrayList<>();
        bookID1.add(01);
        bookID1.add(211);
        bookID1.add(321);
        bookID1.add(52);
        bookID1.add(11);
        bookID1.add(32);bookID1.add(411);bookID1.add(413);bookID1.add(456);bookID1.add(6868);bookID1.add(90);bookID1.add(4141);
        Library lib0 = new Library(0,2,2, bookID0);
        Library lib1 = new Library(1,3,1,bookID1);

        libraries = new ArrayList<>();
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

        ArrayList<Integer> commons = lib1.getCommons(lib0.bookID);
    }

    //hello world
}
