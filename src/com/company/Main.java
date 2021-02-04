package com.company;
import java.util.*;

public class Main {

    static byte totalDays;
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total days : ");
        totalDays = sc.nextByte();
        //here in the Library constructor method, the place for bookId is vacant, it's for when input is recieved.
        Library lib = new Library(40,60,6, );
        System.out.println("Library Score = "+lib.LibraryScore());
        System.out.println("Hello dick face");
	    //TODO WORK
    }
}
