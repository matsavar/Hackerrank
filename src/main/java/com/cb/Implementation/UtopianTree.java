package com.cb.Implementation;

import java.util.Scanner;

/**
 * Created by c.bulut on 2/17/2016.
 */
public class UtopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n[] = new int[t];
        for(int a0 = 0; a0 < t; a0++){
            n[a0] = in.nextInt();
        }

        for(int a : n){
            calculateHeightOfTree(a);
        }
    }

    private static void calculateHeightOfTree(int num){

    }
}
