package jobsheet3;

public class Dosen22 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    public Dosen22(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void cetakInfo() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        if (jenisKelamin) {
            System.out.println("Jenis Kelamin : Pria");
        } else {
            System.out.println("Jenis Kelamin : Wanita");
        }
        System.out.println("Usia          : " + usia);
        System.out.println("---------------------------------------");
    }
}
