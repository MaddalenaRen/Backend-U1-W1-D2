package Esercizio4;

import java.util.Scanner;

public class ContoAllaRovescia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println( "Inserisci un numero intero:");
        num= scanner.nextInt();

        for(int i = num; i >=0; i--) {
            System.out.println(i);

        }
        scanner.close();
    }
}
