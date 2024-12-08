package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");

        System.out.print("Masukkan pilihan: ");
        String pilihan = inputan.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String nama = inputan.nextLine();
        System.out.print("Ras: ");
        String ras = inputan.nextLine();

        if (pilihan.equals("1")) {
            System.out.print("Warna Bulu: ");
            String warnaBulu = inputan.nextLine();

            Kucing cat = new Kucing(ras, nama, warnaBulu);

            cat.displayDetail();
        } else if (pilihan.equals("2")) {
            System.out.print("Warna Bulu: ");
            String warnaBulu = inputan.nextLine();
            System.out.print("Kemampuan (pisahkan dengan koma): ");
            String[] kemampuan = inputan.nextLine().split(", ");

            Anjing dog = new Anjing(ras, nama, warnaBulu, kemampuan);

            dog.displayDetail();
        }
        inputan.close();
    }
}
