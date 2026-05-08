package jobsheet11;

public class Mahasiswa22 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa22() {
    
    }

    public Mahasiswa22(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("%-15s %-15s %-8s %.1f\n", nama, nim, kelas, ipk);
    }
}
