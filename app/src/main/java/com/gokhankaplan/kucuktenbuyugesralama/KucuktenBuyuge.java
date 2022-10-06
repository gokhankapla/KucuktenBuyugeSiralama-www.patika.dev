package com.gokhankaplan.kucuktenbuyugesralama;

import java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String [] args) {
        int a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz: ");
        a = input.nextInt();
        System.out.println("ikinci sayıyı giriniz: ");
        b = input.nextInt();
        System.out.println("ucuncu sayıyı giriniz: ");
        c = input.nextInt();

        if (a<b && a<c) {
            if (c < b) {
                System.out.println("a < c < b");
            }
                else {
                    System.out.println("a < b < c");
                }

        }
        if (b<a && b<c) {
            if (a<c) {
                System.out.println("b < a < c");
            }
            else {
                System.out.println("b < c < a");
            }
        }
        if (c<a && c<b) {
            if (b<a) {
                System.out.println("c < b < a");
            }
            else {
                System.out.println("c < a < b");
            }
        }
    }
}
