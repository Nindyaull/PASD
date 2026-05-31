package jobsheet14;

public class BinaryTreeArrayMain22 {
    public static void main(String[] args) {
        BinaryTreeArray22 bta = new BinaryTreeArray22();
        bta.add(new Mahasiswa22("244160121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa22("244160185", "Candra", "C", 3.41));
        bta.add(new Mahasiswa22("244160221", "Badar", "B", 3.75));
        bta.add(new Mahasiswa22("244160220", "Dewi", "B", 3.35));
        bta.add(new Mahasiswa22("244160131", "Devi", "A", 3.48));
        bta.add(new Mahasiswa22("244160205", "Ehsan", "D", 3.61));

        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

        System.out.println("\n PreOrder Traversal: ");
        bta.traversePreOrder(0);
        // Mahasiswa22[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        // int idxLast = 6;
        // bta.populateData(dataMahasiswa, idxLast);
    }
}
