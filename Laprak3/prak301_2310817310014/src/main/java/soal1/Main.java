package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah dadu: ");
        int jumlahDadu = scanner.nextInt();

        LinkedList<Dadu> daftarDadu = new LinkedList<>();

        for (int i = 0; i < jumlahDadu; i++) {
            Dadu dadu = new Dadu();  
            daftarDadu.add(dadu);  
        }

        int totalNilai = 0;
        for (int i = 0; i < daftarDadu.size(); i++) {
            Dadu dadu = daftarDadu.get(i);  
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + dadu.Nilai);
            totalNilai += dadu.Nilai; 
        }

        System.out.println("Total nilai dadu keseluruhan: " + totalNilai);

        scanner.close();
    }
}
