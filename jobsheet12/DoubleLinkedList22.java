package jobsheet12;

public class DoubleLinkedList22 {
    Node22 head;
    Node22 tail;

    public DoubleLinkedList22() {
        head = null;
        tail = null;
    }

    // untuk mengecek apakah linked list masi kosong
    public boolean isEmpty() {
        return head == null;
    }

    // untuk menambahkan node baru pada bagian awal linked list
    public void addFirst(Mahasiswa22 data) {
        Node22 newNode = new Node22(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // untuk menambahkan node baru pada bagian akhir linked list
    public void addLast(Mahasiswa22 data) {
        Node22 newNode = new Node22(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // untuk menyisipkan node baru setelah node yang memiliki NIM tertentu
    public void insertAfter(String keyNim, Mahasiswa22 data) {
        Node22 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node22 newNode = new Node22(data);

        // jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { // node baru disisipkan di tengah
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    // untuk melakukan traversal dari node head hingga tail dan menampilkan seluruh isi linked list
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node22 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
}
