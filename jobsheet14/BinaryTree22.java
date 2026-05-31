package jobsheet14;

public class BinaryTree22 {
    Node22 root;

    public BinaryTree22() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa22 mahasiswa) {
        Node22 newNode = new Node22(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node22 current = root;
            Node22 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node22 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    // untuk mengunjungi dan menampilkan node" dalam binary tree
    void traversePreOrder(Node22 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node22 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }
    
    void traversePostOrder(Node22 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    // untuk proses penghapusan node yg memiliki 2 child
    Node22 getSuccessor(Node22 del) {
        Node22 successor = del.right;
        Node22 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        // cari node (current) yang akan dihapus
        Node22 parent = root;
        Node22 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            // jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { // jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { // jika punya 2 anak
                Node22 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    // method untuk penambahan secara rekursif
    public void addRekursif(Mahasiswa22 mahasiswa) {
        root = rekursifHelper(root, mahasiswa);
    }

    // method helper untuk menjalankan logika rekursif
    public Node22 rekursifHelper(Node22 current, Mahasiswa22 mahasiswa) {
        if (current == null) {
            return new Node22(mahasiswa);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = rekursifHelper(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = rekursifHelper(current.right, mahasiswa);
        }
        return current;
    }

    // untuk mencari IPK terendah
    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Binary Tree masih kosong!");
            return;
        }
        Node22 current = root;
        while (current.left != null) {
            current = current.left; // terus menelusuri cabang paling kiri
        }

        System.out.println("\n--- Data Mahasiswa dengan IPK Terendah ---");
        current.mahasiswa.tampilInformasi();
    }

    // untuk mencari IPK tertinggi
    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Binary Tree masih kosong!");
            return;
        }
        Node22 current = root;
        while (current.right != null) {
            current = current.right; // terus menelusuri cabang paling kanan
        }
        
        System.out.println("\n--- Data Mahasiswa dengan IPK Tertinggi ---");
        current.mahasiswa.tampilInformasi();
    }

    // untuk menampilkan data mahasiswa dgn IPK di atas batas
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("\n--- Daftar Mahasiswa dengan IPK > " + ipkBatas + " ---");
        tampilBatasHelper(root, ipkBatas);
    }

    // method helper untuk menjalankan logika rekursif
    public void tampilBatasHelper(Node22 node, double batas) {
        if (node != null) {
            tampilBatasHelper(node.left, batas);

            if (node.mahasiswa.ipk > batas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilBatasHelper(node.right, batas);
        }
    }
}
