package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int N = 10;
        List<Integer> listaCasuale = generaListaRandom(N);
        System.out.println(listaCasuale);
    }

    //METODO PER GENERARE LISTA CON VALORI RANDOMICI DA 0 A 100
    public static List<Integer> generaListaRandom(int num) {
        //creo la lista di interi
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            //aggiungo un numero randomico da 0 a 100 tante volte quanto il valore di num
            lista.add((int) (Math.random() * 101));
        }
        Collections.sort(lista);
        return lista;
    }

    public static List<Integer> duplicaListaInOrdineInverso(List<Integer> lista) {
        List<Integer> nuovaLista = new ArrayList<>(lista);
        List<Integer> reverse = new ArrayList<>(lista);

        //inverto l'ordine degli elementi
        Collections.reverse(reverse);

        //aggiungo alla lista la reverse
        nuovaLista.addAll(reverse);
        return nuovaLista;

    }
}
