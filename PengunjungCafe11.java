public class PengunjungCafe11 {
    public static void main(String[] args) {
        daftarPengunjung("aldi", "budi", "citra");
    }

    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
}
