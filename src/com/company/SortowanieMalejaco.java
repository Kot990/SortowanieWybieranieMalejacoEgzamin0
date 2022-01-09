package com.company;

import java.util.Arrays;

public class SortowanieMalejaco {
    //dodawanie pól
    private final int ILE_ELEM = 5;
    public int[] tablica = new int[ILE_ELEM];

    /********************************************************
     * nazwa funkcji: SortowanieMalejaco
     * parametry wejściowe: int[] tablica - przechowuje elemety tablicy  (liczby całkowite do posortowania)wpisane z konsoli
     * wartość zwracana: brak
     * opis - konstruktor klasy
     * autor: 910908
     * ****************************************************/


    public SortowanieMalejaco(int[] tablica) {
        this.tablica = tablica;
    }

    //METODA ZEBY ZNALEZC NAJWIEKSZA WARTOSC O PODANYM INDEKSIE, dodajemy parametr w metodzie bo od czegos zaczynami i podjaemy indeks
    //porownujemy kolejna od podanej czyli jessli zerowy indeks to powywnujemy z 1

    /********************************************************
     * nazwa funkcji: znajdzIndeksNajwiekszej
     * parametry wejściowe: int indeks - indeks elementu tablicy przyjęty jako najwiekszy od którego wyszukujemy wartość
     * największą w tablicy
     * wartość zwracana: indeksNajwiekszej - indeks najwiekszego elementu tablicy
     * opis - metoda znajdująca indeks najwiekszego elementu tablicy
     * autor: 910908
     * ****************************************************/
    public int znajdzIndeksNajwiekszej(int indeks) {
        int indeksNajwiekszej = indeks;
        for (int i = indeks + 1; i < ILE_ELEM; i++) {
            if (this.tablica[indeksNajwiekszej] < this.tablica[i]) {
                indeksNajwiekszej = i;
            }
        }
        return indeksNajwiekszej;

    }

    /********************************************************
     * nazwa funkcji: zamien
     * parametry wejściowe: int indeks1 - indeks elementu 1 (mniejszego) od elementu wyszukanego jako największy)
                            * int indeks2 - indeks elementu drugiego znalezionego jako największy
     * wartość zwracana: brak
     * opis - metoda zamieniająca indeks wartości porównywanej z indeksem wartosc największej
     * autor: 910908
     * ****************************************************/
    //metoda zamienia nam dwa podone elementy ze soba
    public void zamien(int indeks1, int indeks2) {


        int palik = this.tablica[indeks2];
        this.tablica[indeks2] = this.tablica[indeks1];
        this.tablica[indeks1] = palik;

    }

    /********************************************************
     * nazwa funkcji: posortuj
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis - metoda sortująca elementy tablicy
     * autor: 910908
     * ****************************************************/
    public void posortuj() {
        for (int i = 0; i < ILE_ELEM - 1; i++) {
            int indeksNajwiekszej = znajdzIndeksNajwiekszej(i);
            zamien(i, indeksNajwiekszej);
        }
    }

    @Override
    public String toString() {
        return "SortowanieMalejaco{" +
                Arrays.toString(tablica);

    }
}
