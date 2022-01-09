package com.company;

import java.util.Scanner;

public class SortowanieWybieranieMalejacoEgzamin0 {

    //tworzyc pole + tablice private static bo wtedy w main nie czyta bez static???

    private static final int ILE_ELEM = 5;
    public static int[] tablica = new int[ILE_ELEM];

    /********************************************************
     * nazwa funkcji: <tu wstaw nazwę funkcji>
     * parametry wejściowe: <nazwa parametru> - <co przechowuje>
     * wartość zwracana: <co zwraca funkcja – opis>
     * autor: <numer PESEL zdającego>
     * ****************************************************/


    public static void wczytajTablice() {
        Scanner daneWejsciowe = new Scanner(System.in);

        for (int i = 0; i < ILE_ELEM; i++) {
            System.out.print("Wczytaj " + (i + 1) + " element tablicy: ");
            tablica[i] = daneWejsciowe.nextInt();
        }

    }

    public static void main(String[] args) {
        // write your code here
        wczytajTablice();
        SortowanieMalejaco sortowanieMalejaco = new SortowanieMalejaco(tablica);
        sortowanieMalejaco.posortuj();
        System.out.println(sortowanieMalejaco.toString());

    }
}
