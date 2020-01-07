import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double beratKg;
        double beratPon;

        Scanner userInput = new Scanner(System.in);
        System.out.println("PROGRAM KONVERSI KG KE PON");
        System.out.print("Masukkan berat dalam KG : ");
        beratKg = userInput.nextDouble();

        beratPon = beratKg * 2;
        System.out.println("Berat dalam Pon dari " + beratKg + " Kg adalah " + beratPon + "Pon");
    }
}