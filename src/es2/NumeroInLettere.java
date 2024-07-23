package es2;

import java.util.Scanner;

public class NumeroInLettere {
    public void convertiNumeroInLettere() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero intero tra 0 e 3: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("Errore: il numero non è compreso tra 0 e 3.");
                break;
        }
    }
}
