package com.javaE1;

import static java.lang.System.*;

public class Main {
    public static void rightTriangle(int n){
        for (int i=0;i<n;i++) {
            for (int j = 0; j <= i; j++) {
                out.print("*");
            }
            out.println("");
        }
    }

    private static String myName ="huang";
    private static void printLine(int level,int n){
        int dot=level*2-1;
        int space=n-level;
        for (int i=0;i<space;i++){
            out.print(" ");
        }
        for (int i=0;i<dot;i++){
            out.print("*");
        }
        for (int i=0;i<space;i++){
            out.print(" ");
        }
        out.println("");
    }
    private static void R_diamondName(int level,int n){ //starts from 1
        if(level<n){
            printLine(level,n);
            R_diamondName(level+1,n);
            printLine(level,n);
        }
        else {
            out.println(myName);
        }
    }
    public static void diamondName(int n){
        R_diamondName(1,n);
    }


    public static void main(String[] args) {
        //rightTriangle(3);
        diamondName(3);
    }
}
