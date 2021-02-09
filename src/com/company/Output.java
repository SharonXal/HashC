package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.net.URL;
import java.io.*;
import java.io.PrintWriter;

public class Output() {
    public Output(ArrayList<Library> library ) {

    }

    void output() throws IOException {
        int i, n;
        PrintWriter pw = new PrintWriter(new FileWriter("SubmissionFile.txt"));
        n =;//total library to that will be signed up for scanning
        pw.println(n);
        for (i = 0; i <= n; i++)//n=total books signed up for scanning
        {
            pw.println(/* function for first library for sign up process*/+' ' +/total books for sign up process/);
            pw.println(/fuction of books in order that will be send from the library/+' ');
        }

        pw.close();


    }
}