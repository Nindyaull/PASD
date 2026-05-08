package jobsheet11;

public class QueueLL22 {
    Node22 front;
    Node22 rear;
    int size = 0;
    int max = 10;

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void enqueue(Mahasiswa22 data) {

        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }

        Node22 baru = new Node22(data, null);

        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }

        size++;
        System.out.println(data.nama + " berhasil masuk antrian");
    }

    public void dequeue() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {

            System.out.println("Memanggil antrian:");
            front.data.tampil();

            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    public void tampilDepan() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            front.data.tampil();
        }
    }

    public void tampilBelakang() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            rear.data.tampil();
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian : " + size);
    }

    public void print() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {

            Node22 temp = front;

            System.out.println("Isi antrian:");

            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
        }
    }
}