import java.util.Scanner;

public class PRAK101_2310817310014_MuhammadRizkiSaputra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = scanner.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = scanner.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        System.out.print("Masukkan Tinggi Badan: (cm) ");
        int tinggiBadan = scanner.nextInt();

        System.out.print("Masukkan Berat Badan: (kg) ");
        int beratBadan = scanner.nextInt();

       
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                          "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

    
        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempatLahir +
                           " pada Tanggal " + tanggalLahir + " " + bulan[bulanLahir - 1] +
                           " " + tahunLahir + ", Tinggi Badan " + tinggiBadan + " cm, Berat Badan " + beratBadan + " kg");

        scanner.close();
    }
}
