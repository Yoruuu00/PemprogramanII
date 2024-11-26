package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Inputan = new Scanner(System.in);
        ArrayList<Mahasiswa> listMhs = new ArrayList<>();
        int Pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
    
            System.out.print("Pilihan: ");
            Pilihan = Inputan.nextInt();
            Inputan.nextLine(); 

            if(Pilihan == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String Nama = Inputan.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String NIM = Inputan.nextLine();
    
            
                boolean nimExists = false;
                for (Mahasiswa mhs : listMhs) {
                    if (mhs.getNim().equals(NIM)) {
                        nimExists = true;
                        break;
                    }
                }
                
                if (nimExists) {
                    System.out.println("NIM sudah ada. Mahasiswa tidak ditambahkan.");
                } else {
                    Mahasiswa mhs = new Mahasiswa(Nama, NIM);
                    listMhs.add(mhs);
                    System.out.println("Mahasiswa " + Nama + " dengan NIM " + NIM + " ditambahkan.");
                }
            }
            else if(Pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nimTemp = Inputan.nextLine();
                boolean ditemukan = false;

                for(int j = 0 ; j < listMhs.size() ; j++) {
                    if(nimTemp.equals(listMhs.get(j).getNim())) {
                        listMhs.remove(j);
                        System.out.println("Mahasiswa dengan NIM " + nimTemp + " dihapus.");
                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Mahasiswa dengan NIM " + nimTemp + " tidak ditemukan.");
                }
            }
            else if(Pilihan == 3) {
                System.out.print("Masukkan NIM dari Mahasiswa yang ingin dicari: ");
                String nimSearch = Inputan.nextLine();
                boolean ditemukan = false;

                for(int j = 0 ; j < listMhs.size() ; j++) {
                    if(nimSearch.equals(listMhs.get(j).getNim())) {
                        System.out.println("NIM: " + listMhs.get(j).getNim() + ", Nama: " + listMhs.get(j).getNama());
                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Mahasiswa dengan NIM " + nimSearch + " tidak ditemukan.");
                }
            }
            else if(Pilihan == 4) {
                if (listMhs.isEmpty()) {
                    System.out.println("Tidak ada data mahasiswa.");
                } else {
                    System.out.println("Daftar Mahasiswa:");
                    for(int j = 0 ; j < listMhs.size() ; j++) {
                        System.out.println("NIM: " + listMhs.get(j).getNim() + ", Nama: " + listMhs.get(j).getNama());
                    }
                }
            }
            else if (Pilihan == 0) {
                System.out.println("Terima kasih!");
                listMhs.clear();  // Hapus semua data mahasiswa
            }
            else {
                System.out.println("Pilihan tidak valid.");
            }
        }
        while(Pilihan != 0);

        Inputan.close();
    }
}
