package jobsheet9;

public class StackSurat22 {
    Surat22[] stack;
    int size;
    int top;

    public StackSurat22(int size) {
        this.size = size;
        this.stack = new Surat22[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat22 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }
    
    public Surat22 pop() {
        if (!isEmpty()) {
            Surat22 srt = stack[top];
            top--;
            return srt;
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat22 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ketemu = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMhs.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan!");
                System.out.println("ID Surat  : " + stack[i].idSurat);
                System.out.println("Nama      : " + stack[i].namaMhs);
                System.out.println("Kelas     : " + stack[i].kelas);
                System.out.println("Keterangan: " + (stack[i].jenisIzin == 'S' ? "Sakit" : "Izin"));
                System.out.println("Durasi    : " + stack[i].durasi + " hari");
                ketemu = true;
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Surat dengan nama " + nama + " tidak ditemukan.");
        }
    }
}
