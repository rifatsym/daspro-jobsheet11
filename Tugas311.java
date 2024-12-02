import java.util.Scanner;

public class Tugas311 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = sc.nextInt();

        int[][] nilaiTugas = new int[jumlahMahasiswa][jumlahTugas];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan nilai tugas untuk mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Nilai tugas " + (j + 1) + ": ");
                nilaiTugas[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nRekap Nilai Tugas Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print(nilaiTugas[i][j] + " ");
            }
            System.out.println();
        }

        // Menampilkan rata-rata nilai tugas per mahasiswa
        System.out.println("\nRata-rata Nilai Tugas per Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            int totalNilai = 0;
            for (int j = 0; j < jumlahTugas; j++) {
                totalNilai += nilaiTugas[i][j];
            }
            double rataRata = (double) totalNilai / jumlahTugas;
            System.out.println("Mahasiswa " + (i + 1) + ": " + rataRata);
        }

        // Menampilkan rata-rata nilai untuk setiap tugas
        System.out.println("\nRata-rata Nilai per Tugas:");
        for (int j = 0; j < jumlahTugas; j++) {
            int totalNilaiTugas = 0;
            for (int i = 0; i < jumlahMahasiswa; i++) {
                totalNilaiTugas += nilaiTugas[i][j];
            }
            double rataRataTugas = (double) totalNilaiTugas / jumlahMahasiswa;
            System.out.println("Tugas " + (j + 1) + ": " + rataRataTugas);
        }
    }
}
