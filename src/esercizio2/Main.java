package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int N = 6;
        //genero lista di N int casuali da 0 a 100 e li ordina
        List<Integer> listaCasuale = generaListaRandom(N);
        System.out.println(listaCasuale);

        //genero nuova lista con gli stessi elementi più il reverse della lista stessa
        List<Integer> listaInversa = duplicaListaInOrdineInverso(listaCasuale);
        System.out.println("Lista duplicata con elementi aggiunti in ordine inverso: ");
        System.out.println(listaInversa);

        //stampo valori in posizioni pari
        System.out.println("stampo valori in posizioni PARI: ");
        stampaPosizioniPariDispari(listaCasuale, true);

        //stampo valori in posizioni dispari
        System.out.println("stampo valori in posizioni DISPARI: ");
        stampaPosizioniPariDispari(listaCasuale, false);
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

    //METODO CHE DUPLICA LA LISTA E AGGIUNGE GLIE ELEMENTI DELLA STASSA IN ORDINE INVERSO
    public static List<Integer> duplicaListaInOrdineInverso(List<Integer> lista) {
        List<Integer> nuovaLista = new ArrayList<>(lista);
        List<Integer> reverse = new ArrayList<>(lista);

        //inverto l'ordine degli elementi
        Collections.reverse(reverse);

        //aggiungo alla lista la reverse
        nuovaLista.addAll(reverse);
        return nuovaLista;

    }

    //METODO CHE STAMPA I VALORI IN POSIZIONI PARI DELLA LISTA SE IL BOOLEANO è TURE E STAMPA LE POSIZIONI DISPARI SE è FALSO
    public static void stampaPosizioniPariDispari(List<Integer> lista, boolean bool) {
        for (int i = 0; i < lista.size(); i++) {
            if (bool && i % 2 == 0) {
                System.out.println(lista.get(i));
            } else if (!bool && i % 2 != 0) {
                System.out.println(lista.get(i));
            }
        }
    }
}
