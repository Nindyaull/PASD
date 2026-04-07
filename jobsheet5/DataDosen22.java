package jobsheet5;

public class DataDosen22 {
    Dosen22[] dataDosen = new Dosen22[10];
    int idx;

    void tambah(Dosen22 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Data masih kosong.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx-1; i++) {
            for (int j = 1; j < idx-i; j++) {
                if (dataDosen[j].usia < dataDosen[j-1].usia) {
                    Dosen22 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx-1; i++) {
            int idxMax = i;
            for (int j = i+1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen22 tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }
}
