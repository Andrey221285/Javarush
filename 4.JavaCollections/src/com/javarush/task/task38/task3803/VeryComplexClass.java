package com.javarush.task.task38.task3803;

/* 
Runtime исключения (unchecked exception)
*/

public class VeryComplexClass {
    public void methodThrowsClassCastException() {
        Object i = Integer.valueOf(42);
        String s = (String)i;
    }

    public void methodThrowsNullPointerException() {
        Integer a = null;
        int b = a;

    }

    public static void main(String[] args) {
VeryComplexClass veryComplexClass = new VeryComplexClass();
veryComplexClass.methodThrowsClassCastException();
veryComplexClass.methodThrowsNullPointerException();
    }
}
