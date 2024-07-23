package es4;

import java.util.Scanner;

public class EsFor {

    public void ContoRovescia () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero: ");

        int numero = Integer.parseInt(scanner.nextLine());

        for (int i= numero; i >= 0; i--) {
            System.out.println(String.valueOf(i));
        }

    }
}
