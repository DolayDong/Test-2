import java.util.Scanner;

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
        System.out.println();
        double gajiPokok = 4600897;
        double tunjanganSuamiIstri = gajiPokok * 10 / 100;
        double tunjanganAnak = 4 * (gajiPokok * 2 / 100);
        double iuranPensiun = gajiPokok * 4 / 100;
        double penghasilanBruto = gajiPokok + tunjanganAnak + tunjanganSuamiIstri;
        double penghasilanNetto = penghasilanBruto - iuranPensiun;
        System.out.println("Soal nomer 3 :");
        System.out.println();
        System.out.println("Gaji pokok = 4,600,897.00");
        System.out.println("Tunjangan suami istri = " + tunjanganSuamiIstri);
        System.out.println("Tunjangan anak = " + tunjanganAnak);
        System.out.println("iuran pensiun = " + iuranPensiun);
        System.out.println("Penghasilan Bruto = " + penghasilanBruto);
        System.out.println("Penghasilan netto = " + penghasilanNetto);

    }

}