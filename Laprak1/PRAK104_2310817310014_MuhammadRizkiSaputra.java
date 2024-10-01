import java.util.Scanner;

public class  PRAK104_2310817310014_MuhammadRizkiSaputra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String[] tanganAbu = scanner.nextLine().split(" ");
        System.out.print("Tangan Bagas: ");
        String[] tanganBagas = scanner.nextLine().split(" ");

        int scoreAbu = 0, scoreBagas = 0;

        for (int ronde = 0; ronde < 3; ronde++) {
            String abu = tanganAbu[ronde];
            String bagas = tanganBagas[ronde];

            if ((abu.equals("B") && bagas.equals("G")) || 
                (abu.equals("G") && bagas.equals("K")) || 
                (abu.equals("K") && bagas.equals("B"))) {
                scoreAbu++;
            } else if ((bagas.equals("B") && abu.equals("G")) || 
                       (bagas.equals("G") && abu.equals("K")) || 
                       (bagas.equals("K") && abu.equals("B"))) {
                scoreBagas++;
            }
        }

        if (scoreAbu > scoreBagas) {
            System.out.println("Abu menang");
        } else if (scoreAbu < scoreBagas) {
            System.out.println("Bagas menang");
        } else {
            System.out.println("Seri");
        }

        scanner.close();
    }
}
