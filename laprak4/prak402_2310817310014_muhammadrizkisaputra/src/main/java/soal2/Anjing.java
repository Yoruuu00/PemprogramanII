package soal2;

class Anjing extends HewanPeliharaan {
    String warnaBulu;
    String[] kemampuan;

    Anjing(String r, String n, String w, String[] kemampuan) {
        super(r, n);
        this.warnaBulu = w;
        this.kemampuan = kemampuan;
    }

    void displayDetail() {
        super.display();

        System.out.println("Memiliki warna bulu: " + warnaBulu);
        System.out.print("Memiliki kemampuan: ");
        for (int i = 0; i < kemampuan.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(kemampuan[i]);
        }
        System.out.println();
    }
}
