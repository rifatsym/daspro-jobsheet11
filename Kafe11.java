import java.util.Scanner;
public class Kafe11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();
        System.out.print("Apakah Anda seorang member? (true/false): ");
        boolean isMember = sc.nextBoolean();
        sc.nextLine();
        
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        Menu(namaPelanggan, isMember, kodePromo);

        System.out.println("\nBerapa Menu yang akan anda pesan? ");
        int jumlahMenu = sc.nextInt();

        int totalKeseluruhan = 0;

        for(int i = 0; i <= jumlahMenu; i++){
            System.out.println("\nPesanan ke-" + (i+1));
            System.out.print("Masukkan nomor menu yang anda pesan: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item yang anda pesan: ");
            int banyakItem = sc.nextInt();

            int totalHarga = HitungTotalHarga11(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;

            System.out.println("Total sementara: Rp" + totalKeseluruhan);
        }
        System.out.println("Total harga untuk pesanan anda adalah: Rp" + totalKeseluruhan);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("\nSelamat Datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, mendapatkan diskon sebesar 10%");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat anda mendapat diskon sebesar 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat anda mendapat diskon %sebesar 30");
        } else {
            System.out.println("Tidak ada diskon");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Es teler -- Rp 15,000");
        System.out.println("2. Capuccino -- Rp 20,000");
        System.out.println("3. Latte -- Rp 22,000");
        System.out.println("4. Teh Tarik -- Rp 12,000");
        System.out.println("5. Roti Bakar -- Rp 10,000");
        System.out.println("6. Mie Goreng -- Rp 16.000");
        System.out.println("=============================");
        System.out.println("Silahkan pilih menu yang anda ingin kan.");
        System.out.println("\n");
    }

    public static int HitungTotalHarga11(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7;
        } else {
            System.out.println("Kode promo tidak valid, tidak ada pengurangan harga.");
        }
        return hargaTotal;
    }
}