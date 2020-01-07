import java.util.Scanner;

import javafx.scene.input.KeyCharacterCombination;

public class App {
    public static void main(String[] args) {
        double beratKg;
        int beratPon;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Soal nomer 1 : ");
        System.out.println();
        System.out.println("PROGRAM KONVERSI KG KE PON");
        System.out.print("Masukkan berat dalam KG : ");
        beratKg = userInput.nextDouble();

        beratPon = (int) (beratKg * 2);
        System.out.println("Berat dalam Pon dari " + beratKg + " Kg adalah " + beratPon + " Pon");
        System.out.println();
        System.out.println("Soal nomer 2 : ");
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("Ganjil");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("INDONESIA");
            } else if (i % 2 == 0) {
                System.out.println(i);
            }

        }

    }

}