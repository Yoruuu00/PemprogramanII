package soal1;

import java.util.Random;

public class Dadu {
    int Nilai;

    public Dadu() {
        acakNilai();  
    }

    public void acakNilai() {
        Random rand = new Random();
        this.Nilai = rand.nextInt(6) + 1;  
    }
}
