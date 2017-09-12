package com.javaE1;

import static java.lang.System.*;
import java.util.ArrayList;
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

    public static  void fizzBuzz(int n){
        for (int i=1;i<=n;i++){
            if(i%3==0 &&i%5==0){
                out.println("FizzBuzz");
            }
            else if(i%3==0 ){
                out.println("Fizz");
            }
            else if(i%5==0 ){
                out.println("Buzz");
            }
            else{
                out.println(i);
            }

        }
    }

    public static ArrayList<Integer> generate(int n){
        ArrayList<Integer> res= new ArrayList<Integer>();
        if(n>1){
            res.add(2);
        }
        for (int i=3;i<=n;i++){
            boolean isPrime = true;
            for (int dvd=2;dvd<i;dvd++){
                if(i%dvd==0)
                    isPrime=false;
            }
            if(isPrime)
                res.add(i);
        }
        for (int x:res ){
            out.print(String.valueOf(x)+" ");
        }
        return res;
    }

    public static void main(String[] args) {
        //rightTriangle(3);
        //diamondName(3);
        //fizzBuzz(100);
        generate(100);
    }
}
