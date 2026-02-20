package jobsheet2;

public class MataKuliahMain22 {
    public static void main(String[] args) {
        MataKuliah22 mk1 = new MataKuliah22();
        mk1.kodeMK = "A105SD";
        mk1.nama = "Algoritma Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 5;

        mk1.tampilInformasi();
        mk1.ubahSKS(2);
        mk1.tambahJam(3);
        mk1.kurangiJam(4);
        System.out.println("-------------------------------");
        mk1.tampilInformasi();
    }
}
