package es3;

import java.util.Arrays;
import java.util.Scanner;

public class caratteriDivisi {
    public void DividiICaratteri() {
        Scanner scanner = new Scanner(System.in);
        String stringa = "";

        while (!stringa.equals(":q")) {
            System.out.println("Inserire una stringa (o ':q' per uscire):");
            stringa = scanner.nextLine();

            if (!stringa.equals(":q")) {
                String[] characters = stringa.split("");
                System.out.println(String.join(",", characters));
            }
        }

        scanner.close();
    }
}