package com.week1;

import java.io.FileWriter;
import java.util.Scanner;

public class Producer {
    public static void writing() {

        Scanner inp = new Scanner(System.in);

        try {
            System.out.println("Birinci Tak�m: ");
            String t1 = inp.nextLine();

            System.out.println("�kinci Tak�m: ");
            String t2 = inp.nextLine();

            System.out.println("Birinci Tak�m Skor: ");
            int ts1 = inp.nextInt();

            System.out.println("�kinci Tak�m Skor: ");
            int ts2 = inp.nextInt();

            String fileName = "score.txt";
            FileWriter writerFile = new FileWriter(fileName);
            writerFile.write(t1+" "+ts1+"-"+ts2+" "+t2);
            writerFile.close();

        }catch (Exception e){
            System.out.println("Bir �eyler ters gitti!");
            e.printStackTrace();
        }

    }

}
