package soal2;

class Negara {
    String nama;
    String jenisKepemimpinan;
    String namaPemimpin;
    String tanggalKemerdekaan;
    String bulanKemerdekaan;
    String tahunKemerdekaan;

    Negara(String nama, String jenisKepemimpinan, String namaPemimpin, String tanggalKemerdekaan, String bulanKemerdekaan, String tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    void showDetail() {
        if (jenisKepemimpinan.equals("Monarki")) {
            System.out.println("Negara " + nama + " mempunyai Raja bernama " + namaPemimpin);
            System.out.println(""); // Line break
        } else {
            System.out.println("Negara " + nama + " mempunyai " + jenisKepemimpinan + " bernama " + namaPemimpin);
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + bulanKemerdekaan + " " + tahunKemerdekaan);
            System.out.println(""); // Line break
        }
    }
}
