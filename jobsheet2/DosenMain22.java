package jobsheet2;

public class DosenMain22 {
    public static void main(String[] args) {
        Dosen22 dsn1 = new Dosen22();
        dsn1.idDosen = "A027";
        dsn1.nama = "Bu Siti";
        dsn1.setStatusAktif(true);
        dsn1.tahunBergabung = 2016;
        dsn1.bidangKeahlian = "Data Analyst";
        
        dsn1.tampilInformasi();
        int masaKerja = dsn1.hitungMasaKerja(2026);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
        
        dsn1.ubahKeahlian("fullstack");
        System.out.println("---------------------------------");
        dsn1.tampilInformasi();
    }
}
