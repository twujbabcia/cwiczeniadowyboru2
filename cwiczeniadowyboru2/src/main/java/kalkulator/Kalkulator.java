package kalkulator;

import matematyka.Dodawanie;
import matematyka.Odejmowanie;

public class Kalkulator {
    private Dodawanie dodawanie;
    private Odejmowanie odejmowanie;

    public Kalkulator() {
        dodawanie = new Dodawanie();
        odejmowanie = new Odejmowanie();
    }
