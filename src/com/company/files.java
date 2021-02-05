package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class files
{
    String FILENAME="/books.txt"; //name of the file to read from.
    BufferedReader fr; //reads input from file.
    int B=0,L=0,D=0;
    ArrayList<Library> libraries;
    ArrayList<Integer> bookScores;

    int[] tokens(String a)//converts a line with multiple numbers to a int array[]
    {
        int i,n=1;
        char c;
        int[] ar;
        Scanner sc=new Scanner(a);
        for(i=0;i<a.length();i++)
        {
            c=a.charAt(i);
            if(c==' ')
                n++;
        }
        ar=new int[n];
        for(i=0;i<n;i++)
            ar[i]=sc.nextInt();
        return ar;
    }
    void loadFile() //to load the file.
    {
        try {
            fr = new BufferedReader(new FileReader("C:\\Users\\LUCKY\\IdeaProjects\\book\\src\\books.txt"));
        }
        catch(Exception e)
        {
            System.out.println("File not found !");
        }

    }
    void makeEntry()throws IOException //makes required entry from file.
    {
        String tmp;
        int[] tmpArr;
        int i;
        library tmpLib;
        tmpArr=tokens(fr.readLine());
        /* initializing B,L,D. */
        B=tmpArr[0];
        L=tmpArr[1];
        D=tmpArr[2];
        //scores=new int[B];
        tmp=fr.readLine();
        tmpArr=tokens(tmp);
        //tmpLib=(lb==null)?new library():lb;
        for(i=0;i<B;i++)
            bookScores.add(tmpArr[i]);

        while((tmp=fr.readLine())!=null)
        {
            tmpArr=tokens(tmp);
            tmpLib.N=tmpArr[0];
            tmpLib.T=tmpArr[1];
            tmpLib.M=tmpArr[2];
            tmpLib.initialize();
            tmp=fr.readLine();
            tmpLib.ar=tokens(tmp);
            libraries.add(new Library(tmpArr[0],tmpArr[1],tmpArr[2],Arrays.asList(tokens(tmp))));
            if(lb==null)
            {
                lb=new library(tmpLib);
            }
            else
            {
                lb.push(tmpLib);
            }
        }

    }
    void close()throws IOException
    {
        fr.close();
    }
}