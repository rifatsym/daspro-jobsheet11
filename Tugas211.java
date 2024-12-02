import java.util.Scanner;

public class Tugas211 {
    public static void main(String[] args) {
        inputPenjualan();
        tampilkanPenjualan();
        menuPenjualanTertinggi();
        rataRataPenjualan();
    }

    // Data penjualan 5 menu selama 7 hari
    static int[][] penjualan = new int[5][7];
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    
    // Fungsi untuk memasukkan data penjualan
    public static void inputPenjualan() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan penjualan untuk menu " + menu[i] + " selama 7 hari:");
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j+1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }
    
    // Fungsi untuk menampilkan seluruh data penjualan
    public static void tampilkanPenjualan() {
        System.out.println("\nRekap Penjualan:");
        System.out.print("Menu\t\t");
        for (int j = 0; j < 7; j++) {
            System.out.print("Hari ke-" + (j+1) + "\t");
        }
        System.out.println();
        
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    public static void menuPenjualanTertinggi() {
        int maxPenjualan = 0;
        String menuTertinggi = "";
        
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }
        
        System.out.println("\nMenu dengan penjualan tertinggi adalah " + menuTertinggi + " dengan total penjualan " + maxPenjualan);
    }
    
    // Fungsi untuk menampilkan rata-rata penjualan untuk setiap menu
    public static void rataRataPenjualan() {
        System.out.println("\nRata-rata Penjualan per Menu:");
        
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / 7;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }
    
}
