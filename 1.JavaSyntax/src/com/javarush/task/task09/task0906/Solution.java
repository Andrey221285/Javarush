package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] el = Thread.currentThread().getStackTrace();
        String classname = el[2].getClassName();
        String methodname = el[2].getMethodName();
        System.out.println(classname + ": " + methodname + ": " + s);//напишите тут ваш код
    }
}