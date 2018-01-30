package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /* Parašyti programą, kuri leistų vartotojui įvesti savo masę ir ūgį, pagal gautus duomenis
            paskaičiuotų ir atvaizduotų jo kūno masės indeksą.
            KMI = masė (kg) / (ūgis(m))^2
        */
	    /*Realizuoti 1.6. užduotį panaudojant metodą, kurio parametrai būtų masė ir svoris, o
            grąžinama reikšmė, kūno masės indeksas.
        */
        float mase, ugis;

        Scanner in = new Scanner(System.in);

        System.out.print("Iveskite savo mase: ");
        mase = in.nextFloat();
        System.out.print("Iveskite savo ugi: ");
        ugis = in.nextFloat();

        System.out.print("KMI: " + mase / (ugis * ugis)) ;

    }
}