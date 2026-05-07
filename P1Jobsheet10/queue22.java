package P1Jobsheet10;

public class queue22 {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public queue22(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;

        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
            System.exit(0); // Menutup program secara paksa
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            // Tambahkan print ini agar elemen terakhir (di indeks rear) tetap tercetak
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue behasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(0); // menutup program secara paksa
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            // Pastikan dua baris ini ditaruh di sini agar elemen benar-benar masuk
            data[rear] = dt;
            size++;
        }
    }

    public int Dequeue() {
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            return 0; // Wajib ada return. Angka 0 sebagai penanda bahwa queue kosong.
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                // Jika setelah diambil queue menjadi kosong
                front = rear = -1;
            } else {
                // Jika masih ada sisa elemen
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
            return dt; // Pindahkan return dt ke sini agar selalu tereksekusi
        }
    }
}