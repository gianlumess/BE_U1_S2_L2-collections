package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //creo oggetto scanner
        System.out.println("Scegli quanti elementi inserire: ");

        int numElementi = Integer.parseInt(scanner.nextLine());

        Set<String> parole = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (int i = 0; i < numElementi; i++) {
            System.out.println("inserisci la parola: ");
            String inputParola = scanner.nextLine();
            //qui faccio un controllo per verificare se la parola esiste già
            if (!parole.add(inputParola)) {
                duplicate.add(inputParola);
            } else parole.add(inputParola);
        }

        if (!duplicate.isEmpty()) {
            System.out.println("Le parole duplicate sono: " + duplicate);

        } else System.out.println("Non cè nessuna parola duplicata");

        
        System.out.println("parole distinte: " + parole.size());
        System.out.println(parole);
    }
}
