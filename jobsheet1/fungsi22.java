package jobsheet1;
public class fungsi22 {

    public static int hitungPendapatan(int stock[][], int harga[], int index) {
        int total = 0;
        for (int i = 0; i < stock[index].length; i++) {
            total += stock[index][i] * harga[i];
        }
        return total;
    }

    public static String cekStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
    
    public static void main(String[] args) {
        int stock[][] = {{10, 5, 15, 7}, 
                        {6, 11, 9, 12}, 
                        {2, 10, 10, 5}, 
                        {5, 7, 12, 9}};
        int harga[] = {75000, 50000, 60000, 10000};

        for (int i = 0; i < stock.length; i++) {
            int pendapatan = hitungPendapatan(stock, harga, i);
            System.out.println("Pendapatan Cabang " + (i+1) + " = " + pendapatan);
        }
        System.out.println("==============================================");

        for (int i = 0; i < stock.length; i++) {
            int pendapatan = hitungPendapatan(stock, harga, i);
            String status = cekStatus(pendapatan);

            System.out.println("Cabang " + (i+1));
            System.out.println("Pendapatan: RP " + pendapatan);
            System.out.println("Status: " + status);
            System.out.println("----------------------------------------------");
        }
    }
}
