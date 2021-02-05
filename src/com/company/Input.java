package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {
        String FILENAME = "books.txt"; //name of the file to read from.
        URL path = Input.class.getResource(FILENAME);
        BufferedReader fr; //reads input from file.
        int B = 0, L = 0, D = 0;
        ArrayList<Library> libraries = new ArrayList<>();
        ArrayList<Integer> bookScores = new ArrayList<>();

        ArrayList<Integer> tokens(String a)//converts a line with multiple numbers to a int array[]
        {
            int i, n = 1;
            char c;
            ArrayList<Integer> ar = new ArrayList<>();
            Scanner sc = new Scanner(a);
            for (i = 0; i < a.length(); i++) {
                c = a.charAt(i);
                if (c == ' ')
                    n++;
            }
            for (i = 0; i < n; i++)
                ar.add(sc.nextInt());
            return ar;
        }

        void loadFile() //to load the file.
        {
            try {
                fr = new BufferedReader(new FileReader(new File(path.getFile())));
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("File not found !");
            }

        }

        void makeEntry() //makes required entry from file.
        {
            String tmp;
            ArrayList<Integer> tmpArr;
            int i;
            try {
                tmpArr = tokens(fr.readLine());
                /* initializing B,L,D. */
                B = tmpArr.get(0);
                L = tmpArr.get(1);//
                D = tmpArr.get(2);
                tmp = fr.readLine();
                tmpArr = tokens(tmp);
                for (i = 0; i < B; i++)
                    bookScores.add(tmpArr.get(i));
                i = 0;

                while ((tmp = fr.readLine()) != null) {
                    tmpArr = tokens(tmp);
                    tmp = fr.readLine();
                    libraries.add(new Library(i++, tmpArr.get(1), tmpArr.get(2), tokens(tmp)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        void close() throws IOException {
            fr.close();
        }
}
