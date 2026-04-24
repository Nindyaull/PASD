package jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        StackTugasMahasiswa22 stack = new StackTugasMahasiswa22(5);
        Scanner sc = new Scanner(System.in);
        int pilih;
    
        do {
            System.out.println("\nMenu:");
            System.out.println("1. mengumpulka Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Pertama Dari Bawah");
            System.out.println("6. Tampilkan Tugas yang Dikumpulkan");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
    
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
    
                    Mahasiswa22 mhs = new Mahasiswa22(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
    
                case 2:
                    Mahasiswa22 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
    
                case 3:
                    Mahasiswa22 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    } 
                    break;
    
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("nama\tNIM\tKelas");
                    stack.print();
                    break;

                case 5:
                    Mahasiswa22 bawah = stack.peekLower();
                    if (bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh: " + bawah.nama);
                    }
                    break;

                case 6:
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stack.hitungTugas());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
