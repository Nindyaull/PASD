package jobsheet3;

public class DataDosen22 {
    public void dataSemuaDosen(Dosen22[] arrayOfDosen) {
        for (Dosen22 dsn : arrayOfDosen) {
            dsn.cetakInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen22[] arrayOfDosen) {
        int jumlahPria = 0; 
        int jumlahWanita = 0;
        for (Dosen22 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria     : " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita   : " + jumlahWanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen22[] arrayOfDosen) {
        int usiaPria = 0;
        int usiaWanita = 0;
        int jmlPria = 0;
        int jmlWanita = 0;
        for (Dosen22 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                usiaPria += dsn.usia;
                jmlPria++;
            } else {
                usiaWanita += dsn.usia;
                jmlWanita++;
            }
        }
        System.out.println("Rata-Rata Usia Pria   : " + (usiaPria / jmlPria));
        System.out.println("Rata-Rata Usia Wanita : " + (usiaWanita / jmlWanita));
    }

    public void infoDosenPalingTua(Dosen22[] arrayOfDosen) {
        Dosen22 tertua = arrayOfDosen[0];
        for (Dosen22 dsn : arrayOfDosen) {
            if (dsn.usia > tertua.usia) {
                tertua = dsn;
            }
        }
        System.out.println("Dosen Paling Tua");
        tertua.cetakInfo();
    }
    
    public void infoDosenPalingMuda(Dosen22[] arrayOfDosen) {
        Dosen22 termuda = arrayOfDosen[0];
        for (Dosen22 dsn : arrayOfDosen) {
            if (dsn.usia < termuda.usia) {
                termuda = dsn;
            }
        }
        System.out.println("Dosen Paling Muda");
        termuda.cetakInfo();
    }
}
