package com.javaE1;

public class Main {

    public static void rightTriangle(int n){
        for (int i=0;i<n;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        rightTriangle(3);
    }
}
