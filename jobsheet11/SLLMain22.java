package jobsheet11;

// import java.util.Scanner;

public class SLLMain22 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        SingleLinkedList22 sll = new SingleLinkedList22();

        Mahasiswa22 mhs1 = new Mahasiswa22("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa22 mhs2 = new Mahasiswa22("23212201", "Bimon", "2B", 3.8);
        Mahasiswa22 mhs3 = new Mahasiswa22("22212202", "Cintia", "3C", 3.5);
        Mahasiswa22 mhs4 = new Mahasiswa22("21212203", "Dirga", "4D", 3.6);

        // MASUKKAN DATA DULU KE LIST
        sll.addLast(mhs4); // Index 0: Dirga
        sll.addLast(mhs3); // Index 1: Cintia
        sll.addLast(mhs2); // Index 2: Bimon
        sll.addLast(mhs1); // Index 3: Alvaro
        
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
        // System.out.println("--- Input Data Mahasiswa ---");
        // System.out.print("NIM: ");
        // String nim = sc.nextLine();
        // System.out.print("Nama: ");
        // String nama = sc.nextLine();
        // System.out.print("Kelas: ");
        // String kelas = sc.nextLine();
        // System.out.print("IPK: ");
        // double ipk = sc.nextDouble();

        // // Membuat objek dari input keyboard
        // Mahasiswa22 mhsInput = new Mahasiswa22(nim, nama, kelas, ipk);

        // // Menambahkan ke linked list
        // sll.addFirst(mhsInput);
        // sll.print();

// Pastikan input data sesuai urutan konstruktor: NIM, Nama, Kelas, IPK

// sll.print();

// sll.addFirst(mhs4);
// sll.print();

// sll.addLast(mhs1);
// sll.print();

// sll.insertAfter("Dirga", mhs3);
// sll.insertAt(2, mhs2);

// sll.print();
