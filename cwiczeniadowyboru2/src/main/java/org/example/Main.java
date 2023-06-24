package org.example;
import kalkulator.Kalkulator;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        int wynikDodawania = kalkulator.dodaj(5, 3);
        System.out.println("Wynik dodawania: " + wynikDodawania);

        int wynikOdejmowania = kalkulator.odejmij(10, 4);
        System.out.println("Wynik odejmowania: " + wynikOdejmowania);
    }
}