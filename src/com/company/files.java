package com.company;

import java.io.*;
import java.util.*;
class library
{
    int N,T,M;
    int ar[];
    library next;
    library(){}
    library(library cl)
    {
        int i;
        this.N=cl.N;
        this.T=cl.T;
        this.M=cl.M;
        initialize();
        for(i=0;i<cl.ar.length;i++)
            this.ar[i]=cl.ar[i];
        this.next=cl.next;
    }
    void initialize()
    {
        this.ar=new int[N];
    }
    void addBooks(int[] tmp)
    {
        this.ar=tmp;
    }
    library get(int i)
    {
        library tmp;
        tmp=this;
        int j=0;
        do {
            if(j==i)
                return tmp;
        }while((tmp=this.next)!=null);
        return null;
    }
    void push(library tmp)
    {
        library tmp1;
        tmp1=this;
        while(tmp1.next!=null)
            tmp1=tmp1.next;
        tmp1.next=new library(tmp);
    }
}
public class files
{
    String FILENAME="/books.txt"; //name of the file to read from.
    BufferedReader fr; //reads input from file.
    int B,L,D; //for books, libraries and days.
    int[] scores;
    library lb=null;

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
        scores=new int[B];
        tmp=fr.readLine();
        tmpArr=tokens(tmp);
        tmpLib=(lb==null)?new library():lb;
        for(i=0;i<B;i++)
            scores[i]=tmpArr[i];

        while((tmp=fr.readLine())!=null)
        {
            tmpArr=tokens(tmp);
            tmpLib.N=tmpArr[0];
            tmpLib.T=tmpArr[1];
            tmpLib.M=tmpArr[2];
            tmpLib.initialize();
            tmp=fr.readLine();
            tmpLib.ar=tokens(tmp);
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

    public static void main(String args[])throws IOException
    {
        files ob=new files();
        ob.loadFile();
        ob.makeEntry();
        ob.close();
    }
}