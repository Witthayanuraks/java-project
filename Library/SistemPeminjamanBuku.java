package Library;
import java.util.Scanner;

class Buku {
    String judul;
    String jenis;
    boolean dipinjam;

    public Buku(String judul, String jenis) {
        this.judul = judul;
        this.jenis = jenis;
        this.dipinjam = false;
    }

    public void pinjam() {
        if (!dipinjam) {
            dipinjam = true;
            System.out.println("Buku '" + judul + "' berhasil dipinjam.");
        } else {
            System.out.println("Buku '" + judul + "' sudah dipinjam.");
        }
    }

    public void kembalikan() {
        if (dipinjam) {
            dipinjam = false;
            System.out.println("Buku '" + judul + "' berhasil dikembalikan.");
        } else {
            System.out.println("Buku '" + judul + "' belum dipinjam.");
        }
    }
}

public class SistemPeminjamanBuku {
    static Buku[] daftarBuku = {
            new Buku("Buku Referensi A", "Referensi"),
            new Buku("Buku Cerita B", "Cerita"),
            new Buku("Buku Kejuruan C", "Kejuruan"),
            new Buku("Buku Pelajaran D", "Pelajaran")
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nSistem Peminjaman Buku");
            System.out.println("1. Pinjam Buku");
            System.out.println("2. Kembalikan Buku");
            System.out.println("3. Lihat Status Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    pinjamBuku(scanner);
                    break;
                case 2:
                    kembalikanBuku(scanner);
                    break;
                case 3:
                    lihatStatusBuku();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }

    public static void pinjamBuku(Scanner scanner) {
        System.out.println("Pilih buku yang akan dipinjam:");
        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println((i + 1) + ". " + daftarBuku[i].judul + " (" + daftarBuku[i].jenis + ")");
        }
        System.out.print("Masukkan nomor buku: ");
        int pilihanBuku = scanner.nextInt();
        if (pilihanBuku >= 1 && pilihanBuku <= daftarBuku.length) {
            daftarBuku[pilihanBuku - 1].pinjam();
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    public static void kembalikanBuku(Scanner scanner) {
        System.out.println("Pilih buku yang akan dikembalikan:");
        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println((i + 1) + ". " + daftarBuku[i].judul + " (" + daftarBuku[i].jenis + ")");
        }
        System.out.print("Masukkan nomor buku: ");
        int pilihanBuku = scanner.nextInt();
        if (pilihanBuku >= 1 && pilihanBuku <= daftarBuku.length) {
            daftarBuku[pilihanBuku - 1].kembalikan();
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    public static void lihatStatusBuku() {
        System.out.println("\nStatus Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println(buku.judul + " (" + buku.jenis + ") - " + (buku.dipinjam ? "Dipinjam" : "Tersedia"));
        }
    }
}
