package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Map<String, String> rubrica = new HashMap<>();

    public static void main(String[] args) {
        //AGGIUNCO CONTATTI ALLA RUBRICA
        nuovoContatto("Mario Rossi", "3275641228");
        nuovoContatto("Gianluca Messina", "3421589227");
        nuovoContatto("Giovanni Storti", "3275547110");

        System.out.println("contatti presenti in rubrica: " + rubrica.size());
        stampaRubrica();

        //ELIMINO UN CONTATTO IN RUBRICA

        System.out.println("Elimino il contatto di Mario Rossi");
        eliminaContatto("Mario Rossi");
        System.out.println("contatti presenti in rubrica: " + rubrica.size());
        stampaRubrica();

        //CERCO CONTATTO TRAMITE NUMERO DI TELEFONO
        System.out.println("cerco contatto inserendo numero telefonico: '3421589227' ");
        cercaContattoConNumero("3421589227");

        //CERCO CONTATTO TRAMITE NOME
        System.out.println("cerco contatto inserendo un nome : 'Gianluca Messina'");
        cercaContattoConNome("Gianluca Messina");
    }

    //METODO PER AGGIUNGERE UN CONTATTO
    public static void nuovoContatto(String nome, String numero) {
        rubrica.put(nome, numero);
    }

    //METODO PER CANCELLARE CONTATTO
    public static void eliminaContatto(String nome) {
        rubrica.remove(nome);
    }

    //METODO PER CERCARE CONTATTI TRAMITE NUMERO DI TELEFONO
    public static void cercaContattoConNumero(String numero) {
        for (String name : rubrica.keySet()) {
            if (numero.equals(rubrica.get(name))) {
                System.out.println(name);
            }
        }

    }

    //METODO PER CERCARE CONTATTI TRAMITE NOME
    public static void cercaContattoConNome(String nome) {
        System.out.println(rubrica.get(nome));

    }

    //METODO PER STAMPARE NOMI E NUMMERI
    public static void stampaRubrica() {
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
