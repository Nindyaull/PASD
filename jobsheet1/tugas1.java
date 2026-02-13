package jobsheet1;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String plat[] = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        String kota[][] = {{"B", "A", "N", "T", "E", "N"},
                        {"J", "A", "K", "A", "R", "T", "A"}, 
                        {"B", "A", "N", "D", "U", "N", "G"},
                        {"C", "I", "R", "E", "B", "O", "N"},
                        {"B", "O", "G", "O", "R"}, 
                        {"P", "E", "K", "A", "L", "O", "N", "G", "A", "N"},
                        {"S", "E", "M", "A", "R", "A", "N", "G"},
                        {"S", "U", "R", "A", "B", "A", "Y", "A"},
                        {"M", "A", "L", "A", "N", "G"},
                        {"T", "E", "G", "A", "L"}};

        System.out.print("Masukkan Kode Plat: ");
        String kode = sc.nextLine().toUpperCase(); //untuk mengubah semua huruf menjadi kapital

        int index = -1; //pakai index -1 karena ceknya mulai dari 0

        for (int i = 0; i < plat.length; i++) {
            if (plat[i].equals(kode)) { // untuk cek platnya yang diinput user
                index = i;
                break;
            }
        }

        if (index != -1) { //kalau plat berhasil ketemu, nanti output kotanya
            for (int j = 0; j < kota[index].length; j++) {
                System.out.print(kota[index][j]);
            }
        } else {
            System.out.println("Kode plat tidak ditemukan!");
        }
        sc.close();;
    }
}
