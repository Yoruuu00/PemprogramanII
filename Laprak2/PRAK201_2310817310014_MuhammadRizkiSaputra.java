public class PRAK201_2310817310014_MuhammadRizkiSaputra {

static class Buah {
    String nama;
    double beratPerBuah;
    double hargaPerBuah;
    double jumlahBeli;

    void showInfo() {
        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat: " + beratPerBuah);
        System.out.println("Harga: " + hargaPerBuah);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", hargaSebelumDiskon());
        System.out.printf("Total Diskon: Rp%.2f\n", hitungDiskon());
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n", hargaSetelahDiskon());
    }

    double hargaSebelumDiskon() {
        return (jumlahBeli / beratPerBuah) * hargaPerBuah;
    }

    double hitungDiskon() {
        return Math.floor(jumlahBeli / 4) * (hargaPerBuah * 4 * 0.02);
    }

    double hargaSetelahDiskon() {
        return hargaSebelumDiskon() - hitungDiskon();
    }
}
    public static void main(String[] args) {
        Buah buah1 = new Buah();
        buah1.nama = "Apel";
        buah1.beratPerBuah = 0.4;
        buah1.hargaPerBuah = 7000;
        buah1.jumlahBeli = 40;
        buah1.showInfo();

        System.out.println();

        Buah buah2 = new Buah();
        buah2.nama = "Mangga";
        buah2.beratPerBuah = 0.2;
        buah2.hargaPerBuah = 3500;
        buah2.jumlahBeli = 15;
        buah2.showInfo();

        System.out.println();

        Buah buah3 = new Buah();
        buah3.nama = "Alpukat";
        buah3.beratPerBuah = 0.25;
        buah3.hargaPerBuah = 10000;
        buah3.jumlahBeli = 12;
        buah3.showInfo();
    }
}