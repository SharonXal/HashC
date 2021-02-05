//hello its deep
package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Files
{
    String FILENAME="/books.txt"; //name of the file to read from.
    BufferedReader fr; //reads input from file.
    int B=0,L=0,D=0;
    ArrayList<Library> libraries;
    ArrayList<Integer> bookScores;

    ArrayList<Integer> tokens(String a)//converts a line with multiple numbers to a int array[]
    {
        int i,n=1;
        char c;
        ArrayList<Integer> ar = new ArrayList<>();
        Scanner sc=new Scanner(a);
        for(i=0;i<a.length();i++)
        {
            c=a.charAt(i);
            if(c==' ')
                n++;
        }
        for(i=0;i<n;i++)
            ar.add(sc.nextInt());
        return ar;
    }
    void loadFile() //to load the file.
    {
        try {
            fr = new BufferedReader(new FileReader(FILENAME));
        }
        catch(Exception e)
        {
            System.out.println("File not found !");
        }

    }
    void makeEntry()throws IOException //makes required entry from file.
    {
        String tmp;
        ArrayList<Integer> tmpArr;
        int i;
        tmpArr=tokens(fr.readLine());
        /* initializing B,L,D. */
        B=tmpArr.get(0);
        L=tmpArr.get(1);//
        D=tmpArr.get(2);
        tmp=fr.readLine();
        tmpArr=tokens(tmp);
        for(i=0;i<B;i++)
            bookScores.add(tmpArr.get(i));
        i=0;

        while((tmp=fr.readLine())!=null)
        {
            tmpArr=tokens(tmp);
            tmp=fr.readLine();
            libraries.add(new Library(i++,tmpArr.get(0),tmpArr.get(2), tokens(tmp)));
        }

    }
    void close()throws IOException
    {
        fr.close();
    }


   /* ```class output
{
    int A,Y,K,i;
    PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("SubmissionFile.txt"));//to create the submission file
	System.out.println("//Details of the book")
            for(i=0;i<A;i++)//A=the no. of libraries to sign up
    {
        System.out.print("The Id of the library is="Y[i]\t);//Y=the ID of the library
        System.out.println("The no. of books to be scaned from library Y="+K[i]);//K=the no. of books to be scaned from library Y
        System.out.println(/*function of the ID's of the book[i]*/);
    }

}

```
}
*/