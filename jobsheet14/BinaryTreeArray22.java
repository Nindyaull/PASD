package jobsheet14;

public class BinaryTreeArray22 {
    Mahasiswa22[] dataMahasiswa = new Mahasiswa22[10];
    int idxLast;

    public BinaryTreeArray22() {
        this.dataMahasiswa = new Mahasiswa22[10];
    }

    void populateData (Mahasiswa22 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // untuk memasukkan data ke dalam binary tree
    public void add(Mahasiswa22 data) {
        int idx = 0; // mulai pengecekan dari root (index 0)

        while (true) {
            // cek apakah array sdh penuh
            if (idx >= dataMahasiswa.length) {
                System.out.println("Gagal menambahkan! Kapasitas array penuh.");
                break;
            }
            // jika masih ada ruang, masukkan data
            if (dataMahasiswa[idx] == null) {
                dataMahasiswa[idx] = data;

                // update nilai idxLast jika index baru lebih besar
                if (idx > idxLast) {
                    idxLast = idx;
                }
                break;
            }
            // menentukan arah index selanjutnya
            if (data.ipk < dataMahasiswa[idx].ipk) {
                idx = (2 * idx) + 1; // ke anak kiri
            } else {
                idx = (2 * idx) + 2; // ke anak kanan
            }
        }
    }

    // untuk traverse pre-order (parent --> kiri --> kanan)
    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
