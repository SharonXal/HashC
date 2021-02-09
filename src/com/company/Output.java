package com.company;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Output
{
    void output()throws IOException{

        PrintWriter pw=new PrintWriter(new FileWriter
                ("File.txt"));
        int A,Y,K,i;
        for(i=0;i<A;i++)
        {
            pw.print("The ID of the library="+A[i]+"\t");//the id of the library
            pw.println("The no. of books to be scaned from library Y="+Y[i]);//The no. of books to be scaned
            pw.println(/*fuction of the id's of the book to scan*/);
        }
        pw.close();
    }
}
}