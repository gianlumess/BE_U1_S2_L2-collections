package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static List<Integer> generaListaRandom(int num) {
        //creo la lista di interi
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            //aggiungo un numero randomico da 0 a 100 tante volte quanto il valore di num
            lista.add((int) Math.random() * 101);
        }
        Collections.sort(lista);
        return lista;
    }
}
