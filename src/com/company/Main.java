package com.company;

import Loops.Compute;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*
        //While Loop
        int x=1;

        while (x<=10) {
            System.out.print("[" + x + "] " );
            x++;
        }
        System.out.println("");

        //Do-While Loop
        int y=1;

        do {
            System.out.print("[" + y + "] ");
            y++;
        }while( y<=10);

        System.out.println("");
        //For Loop
        for (int z=1; z<=10; z++) {
            System.out.print("[" + z + "] ");
        }
        */
        System.out.println("\nSUM: "+Compute.computeSum(10));
        System.out.println("\nFACTORIAL: "+Compute.computeFactorial(7));
    }
}
