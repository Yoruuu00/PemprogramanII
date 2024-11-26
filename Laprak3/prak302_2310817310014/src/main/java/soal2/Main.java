package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> NamaBulan = new HashMap<>();
        NamaBulan.put("1", "Januari");
        NamaBulan.put("2", "Februari");
        NamaBulan.put("3", "Maret");
        NamaBulan.put("4", "April");
        NamaBulan.put("5", "Mei");
        NamaBulan.put("6", "Juni");
        NamaBulan.put("7", "Juli");
        NamaBulan.put("8", "Agustus");
        NamaBulan.put("9", "September");
        NamaBulan.put("10", "Oktober");
        NamaBulan.put("11", "November");
        NamaBulan.put("12", "Desember");

        Scanner input = new Scanner(System.in);

     
        System.out.print("");
        int jumlahNegara = input.nextInt();
        input.nextLine(); 

     
        LinkedList<Negara> negaraList = new LinkedList<>();

   
        for (int i = 0; i < jumlahNegara; i++) {
            

            String namaNegara = input.nextLine();

            System.out.print("");
            String jenisKepemimpinan = input.nextLine().toLowerCase();
            String jenisKepemimpinanFormatted = jenisKepemimpinan.substring(0, 1).toUpperCase() + jenisKepemimpinan.substring(1);

            System.out.print("");
            String namaPemimpin = input.nextLine();

            if (jenisKepemimpinan.equals("monarki")) {
             
                negaraList.add(new Negara(namaNegara, jenisKepemimpinanFormatted, namaPemimpin, null, null, null));
            } else {
               
                System.out.print("");
                String tanggalKemerdekaan = input.nextLine();

                System.out.print("");
                String bulanKemerdekaan = input.nextLine();
                String bulanNama = NamaBulan.getOrDefault(bulanKemerdekaan, "Tidak diketahui");

                System.out.print("");
                String tahunKemerdekaan = input.nextLine();

                negaraList.add(new Negara(namaNegara, jenisKepemimpinanFormatted, namaPemimpin, tanggalKemerdekaan, bulanNama, tahunKemerdekaan));
            }
        }


        for (Negara negara : negaraList) {
            negara.showDetail();
        }

        input.close();
    }
}