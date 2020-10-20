package com.company;

public class Main {

    public static void main(String[] args) {
        List a = new List();
        for(int i = 1; i <= 10; i++) {
            a.pushEnd(i);
        }
        a.print();
        a.print(3);
        System.out.println("razhmer spiska: "+a.size());
        a.remove(4);
        System.out.println("razhmer spiska: "+a.size());
        a.print();
        a.remove(15);
        a.print();

    }
}
