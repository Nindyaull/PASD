package TugasJobsheet10;

public class AntrianKRS22 {
    Mhs22[] data;
    int front, rear, size, max;
    int totalDiproses; // Utk mencatat yg sudah KRS
    final int kuotaDPA = 30; // Batas tanggungan DPA

    // Konstruktor diset max 10
    public AntrianKRS22() {
        this.max = 10;
        this.data = new Mhs22[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalDiproses = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;

        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void enqueue(Mhs22 mahasigma) {
        if (isFull()) {
            System.out.println("Antrian penuh! Mahasiswa atas nama " + mahasigma.nama + " tidak dapat masuk.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mahasigma;
        size++;
        System.out.println("Mahasiswa " + mahasigma.nama + " berhasil masuk antrian.");
    }

    // Method utk memanggil 2 antrian sekaligus
    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang bisa diproses.");
            return;
        }
        System.out.println("--- Proses KRS DPA ---");
        // Loop 2 kali utk memanggil 2 mahasiswa terdepan
        for (int i = 0; i < 2; i++) {
            if (!isEmpty()) {
                Mhs22 mahasigma = data[front];
                System.out.print("Melayani: ");
                mahasigma.tampilDataMhs();

                front = (front + 1) % max;
                size--;
                totalDiproses++;
            }
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[idx].tampilDataMhs();
        }
    }

    // Menampilkan 2 antrian terdepan
    public void peek2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan:");
        // Batasi maksimal 2, kalau antrian cuma 1 bakal mencetak 1 aja
        int batas = Math.min(size, 2);
        for (int i = 0; i < batas; i++) {
            int idx = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[idx].tampilDataMhs();
        }
    }

    public void peekBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa Paling Belakang");
            data[rear].tampilDataMhs();
        }
    }

    // Method utk mencetak info rekapitulasi KRS
    public void infoKRS() {
        System.out.println("--- Info Rekapitulasi KRS ---");
        System.out.println("Jumlah mahasiswa di antrian saat ini : " + size);
        System.out.println("Jumlah mahasiswa sudah proses KRS    : " + totalDiproses);

        int belum = kuotaDPA - totalDiproses;
        System.out.println("Jumlah mahasiswa belum proses KRS    : " + belum);
    }
}
