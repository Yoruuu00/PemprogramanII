package praktikum2.soal3;

// public class Employee (ini kode awal), salah karena tidak sesuai dengan nama file yang diberikan
public class Pegawai {
    public String nama;

    // public char asal; (ini kode awal) karena atribut ini harus berupa String bukan char
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }

    // public void setJabatan() (ini kode awal)
    public void setJabatan(String jabatan) {

        // this.jabatan = j; karena tidak sesuai
        this.jabatan = jabatan;
    }
}

