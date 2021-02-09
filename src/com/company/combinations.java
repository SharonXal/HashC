package com.company;

import java.util.ArrayList;

public class combinations extends Main {
    ArrayList<Integer> z;
    ArrayList<ArrayList<Integer>> ty = new ArrayList<ArrayList<Integer>>();

    combinations(ArrayList<Integer> z) {
        this.z = new ArrayList<>(z);
    }

    ArrayList<ArrayList<Integer>> get() {
        return comb(new ArrayList<>(),0);
    }

    ArrayList<Integer> mutualcut(ArrayList<Integer> x, ArrayList<Integer> z) {
        ArrayList<Integer> y = new ArrayList<>();
        for (int tx : z)
            if (!x.contains(tx))
                y.add(tx);
        return y;
    }

    ArrayList<ArrayList<Integer>> comb(ArrayList<Integer> x,int i) {
        ArrayList<Integer> tz = mutualcut(x, z);
        ArrayList<Integer> tx;
        for (int y : tz) {
            tx = new ArrayList<>(x);
            tx.add(y);
            if (sum(tx) > D) {
                tx.remove(tx.size() - 1);
                ty.add(tx);
                break;
            } else {
                comb(tx, i+1);
            }

        }
        return ty;
    }

    int sum(ArrayList<Integer> x) {
        int y = 0;
        for (int z = 0; z < x.size(); z++)
            y += x.get(z);
        return y;
    }

    void print(ArrayList<ArrayList<Integer>> x) {
        for (int i = 0; i < x.size(); i++) {
            ArrayList<Integer> y = x.get(i);
            for (int j = 0; j < y.size(); j++) {
                System.out.print(y.get(j)+" ");
            }
            System.out.println();
        }
    }
}
