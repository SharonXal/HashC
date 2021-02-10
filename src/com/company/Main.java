package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    static int currentDay=0;
    static  int B=0,L=0,D=0;
    static ArrayList<Library> libraries;
    static  ArrayList<Integer> bookScores;

    public static void main(String[] args) {
        ArrayList<ArrayList<Library>> librariesCombos = new ArrayList<>();

        ArrayList<Library> libCombo1 = new ArrayList<>();
        ArrayList<Library> libCombo2 = new ArrayList<>();
        Input ip = new Input();
        ip.makeEntry();

        for(Library libTemp : libraries)
            libCombo1.add(libTemp);
        librariesCombos.add(libCombo1);
            libCombo2.add((Library) libraries.get(1));
            libCombo2.add((Library) libraries.get(0));
       librariesCombos.add(libCombo2);


        Main ob = new Main();
        ArrayList<Integer> scores = new ArrayList<>();

        for(ArrayList<Library> libCombos:librariesCombos){
            scores.add(ob.score(libCombos));
            }
        ArrayList<Library> finalSelection = librariesCombos.get(scores.indexOf(Collections.max(scores))); //FINAL SELECTED COMBO

        }


        public int score(ArrayList<Library> libs){
        int totalScore=0;
        int currentDayTemp=currentDay;
        for(Library lib : libs){
            lib.signUpFake(currentDayTemp);
            lib.scan();
            totalScore+=lib.getTotalBookScore();

            currentDayTemp=lib.signUpFinal;
        }

        int multiples[] = new int[bookScores.size()];
        for(int i=0;i<multiples.length;i++){
            int count=0;
            for(Library tempLib : libs){
                if(tempLib.booksScanned.contains(i))
                    count++;
            }
            multiples[i]=count>1?count-1:0;
        }
        for(int i=0;i<bookScores.size();i++){
            totalScore=totalScore-bookScores.get(i)*multiples[i];
        }

        return totalScore;
    }
}
