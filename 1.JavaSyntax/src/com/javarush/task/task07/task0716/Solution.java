package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> fixlist = new ArrayList<String>();//напишите тут ваш код
        for (String s : list) {
            if (s.indexOf('р') != -1 && s.indexOf('л') != -1) {
                fixlist.add(s);

            }
            if (s.indexOf('р') ==-1 && s.indexOf ('л') !=-1){
                fixlist.add(s);
                fixlist.add(s);
            }
            if (s.indexOf('р') ==-1 && s.indexOf('л') ==-1){
                fixlist.add(s);
            }

        }
        return fixlist;
    }
}