package com.week1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Threads {
    static class Producer extends Thread {

        public void run() {

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
                writerFile.write(t1 + " " + ts1 + "-" + ts2 + " " + t2);
                writerFile.close();

            } catch (Exception e) {
                System.out.println("Bir �eyler ters gitti!");
                e.printStackTrace();
            }


        }

    }

    static class Consumer extends Thread {
        public void run() {
            try {
                File r = new File("score.txt");
                FileReader readerFile = new FileReader("score.txt");
                int i = readerFile.read();
                while (i != -1) {
                    System.out.print((char) i);
                    i = readerFile.read();
                }
                readerFile.close();
                r.delete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Threads.Producer producer = new Threads.Producer();
        Threads.Consumer consumer = new Threads.Consumer();

        producer.start();
        while (producer.isAlive()) {

        }
        consumer.start();
    }
}
