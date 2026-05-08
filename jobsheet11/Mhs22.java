package jobsheet11;

public class Mhs22 {
    String nim;
    String nama;

    // Konstruktor dengan 2 parameter sesuai yang ada di Main22
    public Mhs22(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    // Method tampil() sesuai yang dipanggil di QueueLL22
    public void tampil() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("--------------------");
    }
}
