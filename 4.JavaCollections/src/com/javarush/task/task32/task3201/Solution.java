package com.javarush.task.task32.task3201;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) throws IOException {
        String fileName = args[0];
        Long number = Long.parseLong(args[1]);
        String text = args[2];

        RandomAccessFile raf = new RandomAccessFile(fileName,"rw");
        long dlina = raf.length();

        if(number<dlina){
            raf.seek(number);
            raf.write(text.getBytes());
        }
        else{
            raf.seek(dlina);
            raf.write(text.getBytes());
        }
        raf.close();

    }
}
