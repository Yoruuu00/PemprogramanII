import java.util.Scanner;

public class  PRAK102_2310817310014_MuhammadRizkiSaputra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt(); 
        int baris = 0;

        while (baris < 11) {
         
            if (angka % 5 == 0) {
                System.out.print(angka / 5 - 1); 
            } else {
                System.out.print(angka); 
            }

          
            if (baris < 10) {
                System.out.print(", ");
            }

            baris++;
            angka++; 
        }

        scanner.close();
    }
}
