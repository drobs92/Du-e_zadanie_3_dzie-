package com.sda.arppl2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 1 wykonane!");
        //osoby
        Osoba osoba1 = new Osoba("Marian", "Kowalski");
        Osoba osoba2 = new Osoba("Adrian", "Roztocki");
        Osoba osoba3 = new Osoba("Hugo", "Kołłątaj");
        Osoba osoba4 = new Osoba("Alicja", "Wkrainieczarów");
        Osoba osoba5 = new Osoba("Dagmara", "Drakula");
        ///miśki
        Bear bear1 = new Bear("Marian", 32);
        Bear bear2 = new Bear("Olek", 2);
        Bear bear3 = new Bear("Filipek", 10);
        Bear bear4 = new Bear("Teddy", 3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imie miśka, misiu");
        String imiemisia5 = scanner.next();
        System.out.println("a ile ma mieć lat?");
        int wiekmisia5 = scanner.nextInt();
        //cos do zmiany
Bear bear5 = new Bear(imiemisia5,wiekmisia5);


//System.out.println("Cześć, jak masz na imie?");
//        Scanner scanner = new Scanner(System.in);
//        String imie = scanner.next();
//        System.out.println("Ile masz lat?");
//        int wiek = scanner.nextInt();
//        System.out.println(wiek + " to całkiem nie dużo, " + imie + " !");

    }
}

