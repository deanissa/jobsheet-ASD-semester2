import java.util.Scanner;

public class fungsi {
    static int[] hargaBunga = {75000, 50000, 60000, 10000}; 

    public static void pendapatanBunga(int[][] stockBunga) {
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatanCabang = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatanCabang += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": " + pendapatanCabang);
        }
    }

    public static void jumlahStockBunga(int[][] stockBunga) {
        System.out.println("Jumlah Stock Bunga di RoyalGarden 4:");
        for (int j = 0; j < stockBunga[3].length; j++) {
            if (j == 0)
                System.out.println("Aglonema: " + (stockBunga[3][j] - 1)); 
            else if (j == 1)
                System.out.println("Keladi: " + (stockBunga[3][j] - 2)); 
            else if (j == 2)
                System.out.println("Alocasia: " + (stockBunga[3][j]));
            else if (j == 3)
                System.out.println("Mawar: " + (stockBunga[3][j] - 5)); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jumlah Royal Garden : ");
        int jumlahCabang = scanner.nextInt();
        System.out.println("Jumlah Jenis Bunga: ");
        int jumlahJenisBunga = scanner.nextInt();

        int[][] stockBunga = new int[jumlahCabang][jumlahJenisBunga];
        for (int i = 0; i < jumlahCabang; i++) {
            System.out.println("Masukkan jumlah stock bunga untuk RoyalGarden " + (i + 1) + ":");
            for (int j = 0; j < jumlahJenisBunga; j++) {
                System.out.print("Jumlah stock bunga " + (j + 1) + ": ");
                stockBunga[i][j] = scanner.nextInt();
            }
        }
        pendapatanBunga(stockBunga);
        jumlahStockBunga(stockBunga);
        scanner.close();
    }
}
