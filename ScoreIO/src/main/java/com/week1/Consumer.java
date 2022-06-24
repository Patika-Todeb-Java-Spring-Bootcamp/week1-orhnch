package com.week1;

import java.io.File;
import java.io.FileReader;

public class Consumer {
    public static void reading() {
        try {
            File r = new File("score.txt");
            FileReader readerFile = new FileReader("score.txt");
            int i = readerFile.read();
            while (i != -1){
                System.out.print((char) i);
                i = readerFile.read();
            }
            readerFile.close();
            r.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}