package praktikum2.soal3;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        // p1.nama = "Roi"(ini kode awal) salah karena tidak ada tanda';'
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        // tadi atribut umur untuk object p1 belum di inisiasi
        p1.umur = 17;

    
        // System.out.println("Nama Pegawai: " + p1.getNama());(ini kode awal) salah karena seharusnya Nama saja bukan Nama Pegawai dikarenakan tidak sesuai dengan variabel dan objek yang sudah ditentukan
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        // System.out.println("Umur: " + p1.umur); (ini kode awal) salah karena kurang menambahkan tahun di akhir
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
