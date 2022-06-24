package com.week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        boolean start = true;
        while (start){
            Producer.writing();
            Consumer.reading();

            System.out.println();
            System.out.print("Yeni Giriþ Yapmak Ýstiyor Musunuz? y/n:");
            String i = inp.nextLine();

            switch (i){
                case("y"):
                    continue;
                case("n"):
                    start = false;
                    break;

                default:
                    System.out.println("Hatalý Giriþ Yaptýnýz!");
                    start = false;
            }

        }
    }
}
