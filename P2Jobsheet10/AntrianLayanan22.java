package P2Jobsheet10;

public class AntrianLayanan22 {
    Mahasiswa22[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan22(int max) {
        this.max = max;
        this.data = new Mahasiswa22[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
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

    // Kode ini sama seperti method peek
    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    // Kode ini sama seperti method print
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue behasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    // Ini adalah method yang sama seperti enqueue
    public void tambahAntrian(Mahasiswa22 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    // Ini adalah method yang sama seperti dequeue
    public Mahasiswa22 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa22 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    // Untuk menampilkan nilai size
    public int getJumlahAntrian() {
        return size;
    }
}
