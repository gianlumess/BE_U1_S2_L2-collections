package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        Map<String, Integer> contatti = new HashMap<>();
    }

    //METODO PER AGGIUNGERE UN CONTATTO
    public static void nuovoContatto(Map<String, Integer> contatti, String nome, int numero) {
        contatti.put(nome, numero);
    }

    //METODO PER CANCELLARE CONTATTO
    public static void eliminaContatto(Map<String, Integer> contatti, String nome) {
        contatti.remove(nome);
    }


}
