package it.euris.ires;

import static it.euris.ires.Calculator.add;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        testAdd();
    }

    public static void testAdd() {
        int a = 1;
        int b = 1;
        if (add(a, b) == 2) {
            System.out.println("Il test è corretto");
        }

    }
}
