package jobsheet9;

public class StackTugasMahasiswa22 {
    Mahasiswa22[] stack;
    int top;
    int size;

    public StackTugasMahasiswa22(int size) {
        this.size = size;
        stack = new Mahasiswa22[size];
        top = -1;
    }

    // isFull untuk mengecek apakah tumpukan tugas mahasiswa sudah terisi penuh sesuai kapasitas.
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    // isEmpty untuk mengecek apakah tumpukan tugas masi kosong.
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    // push untuk dapat menambahkan berkas tugas ke dalam tumpukan Stack
    public void push(Mahasiswa22 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh ! Tidak bisa menambahkan tugas lagi.");
        }
    }

    // pop untuk mengeluarkan tugas yg akan dinilai. Mempunyai nilai kembalian berupa object dri class Mahasiswa22
    public Mahasiswa22 pop() {
        if (!isEmpty()) {
            Mahasiswa22 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    // peek untuk dapat mengecek tumpukan tugas mahasiswa yg berada di posisi paling atas
    public Mahasiswa22 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    // print untuk dapat menampilkan semua daftar tugas mahasiswa pada stack
    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public Mahasiswa22 peekLower() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public int hitungTugas() {
        return top + 1;
    }

    public String konversiDesimalkeBiner(int nilai) {
        StackKonversi22 stack = new StackKonversi22();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai/2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
