package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

      for (int a=1;a<=list.size();a+=2){
            list.add(a,"именно");
       }

        for(String i : list) {
            System.out.println(i);
        }
        //напишите тут ваш код
    }
}