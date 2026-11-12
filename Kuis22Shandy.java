package kuis2;
import java.util.Scanner;

public class Kuis22Shandy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam;
        int total = 0;
        int jumlahKendaraan = 0;
        int lebih3jam = 0;

        System.out.print("Lama parkir (jam, 0 = selesai): ");
        jam = sc.nextInt();

        while (jam != 0) {
            if (jam < 0 || jam > 24) {
                System.out.println("input tidak valid.");
                System.out.print("Lama parkir (jam, 0 = selesai): ");
                jam = sc.nextInt();
                continue;
            }
            // Tarif: jam pertama Rp 5000, jam berikutnya Rp 3000 per jam
            int biaya = 5000 + (jam - 1) * 3000;
            total += biaya;
            System.out.println("Biaya parkir: Rp " + biaya);
            System.out.print("Lama parkir (jam, 0 = selesai): ");
            jam = sc.nextInt();
            jumlahKendaraan++;

            if (jam > 3) {
                lebih3jam++;
            }

        }

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pemasukan  : Rp " + total);
        System.out.println("Jumlah kendaraan yang parkir > 3 jam: " + lebih3jam);
        System.out.println("Jam terlama parkir: " + jam);
    }
}