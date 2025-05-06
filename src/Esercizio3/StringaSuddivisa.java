package Esercizio3;

import java.util.Scanner;

public class StringaSuddivisa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;

        System.out.println("Inserisci una stringa (digita ':q' per uscire):");

        while (true) {
            s = scanner.nextLine();

            if (s.equals(":q")) {
                System.out.println("Programma terminato");
                break;
            }

            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(i));
                if (i < s.length() - 1) {
                    System.out.print(",");
                }
            }

            System.out.println();
            System.out.println("Inserisci un'altra stringa (':q' per uscire):");
        }

        scanner.close();
    }
}