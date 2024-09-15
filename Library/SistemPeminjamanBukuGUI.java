package Library;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BukuGUI {
    String judul;
    String jenis;
    boolean dipinjam;

    public BukuGUI(String judul, String jenis) {
        this.judul = judul;
        this.jenis = jenis;
        this.dipinjam = false;
    }

    public void pinjam() {
        if (!dipinjam) {
            dipinjam = true;
            JOptionPane.showMessageDialog(null, "Buku '" + judul + "' berhasil dipinjam.");
        } else {
            JOptionPane.showMessageDialog(null, "Buku '" + judul + "' sudah dipinjam.");
        }
    }

    public void kembalikan() {
        if (dipinjam) {
            dipinjam = false;
            JOptionPane.showMessageDialog(null, "Buku '" + judul + "' berhasil dikembalikan.");
        } else {
            JOptionPane.showMessageDialog(null, "Buku '" + judul + "' belum dipinjam.");
        }
    }

    public String getStatus() {
        return judul + " (" + jenis + ") - " + (dipinjam ? "Dipinjam" : "Tersedia");
    }
}

public class SistemPeminjamanBukuGUI extends JFrame {
    BukuGUI[] daftarBuku = {
            new BukuGUI("Buku Referensi A", "Referensi"),
            new BukuGUI("Buku Cerita B", "Cerita"),
            new BukuGUI("Buku Kejuruan C", "Kejuruan"),
            new BukuGUI("Buku Pelajaran D", "Pelajaran")
    };

    public SistemPeminjamanBukuGUI() {
        setTitle("Sistem Peminjaman Buku");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Buat panel utama
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Bagian daftar buku
        JTextArea daftarBukuArea = new JTextArea(10, 30);
        daftarBukuArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(daftarBukuArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Tombol Pinjam Buku
        JButton pinjamButton = new JButton("Pinjam Buku");
        pinjamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] judulBuku = new String[daftarBuku.length];
                for (int i = 0; i < daftarBuku.length; i++) {
                    judulBuku[i] = daftarBuku[i].judul;
                }
                String pilihan = (String) JOptionPane.showInputDialog(null, "Pilih buku yang ingin dipinjam:",
                        "Pinjam Buku", JOptionPane.QUESTION_MESSAGE, null, judulBuku, judulBuku[0]);
                if (pilihan != null) {
                    for (BukuGUI buku : daftarBuku) {
                        if (buku.judul.equals(pilihan)) {
                            buku.pinjam();
                            updateDaftarBuku(daftarBukuArea);
                        }
                    }
                }
            }
        });

        // Tombol Kembalikan Buku
        JButton kembalikanButton = new JButton("Kembalikan Buku");
        kembalikanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] judulBuku = new String[daftarBuku.length];
                for (int i = 0; i < daftarBuku.length; i++) {
                    judulBuku[i] = daftarBuku[i].judul;
                }
                String pilihan = (String) JOptionPane.showInputDialog(null, "Pilih buku yang ingin dikembalikan:",
                        "Kembalikan Buku", JOptionPane.QUESTION_MESSAGE, null, judulBuku, judulBuku[0]);
                if (pilihan != null) {
                    for (BukuGUI buku : daftarBuku) {
                        if (buku.judul.equals(pilihan)) {
                            buku.kembalikan();
                            updateDaftarBuku(daftarBukuArea);
                        }
                    }
                }
            }
        });

        // Panel tombol
        JPanel panelTombol = new JPanel();
        panelTombol.add(pinjamButton);
        panelTombol.add(kembalikanButton);
        panel.add(panelTombol, BorderLayout.SOUTH);

        // Menambahkan panel ke frame
        add(panel);

        // Tampilkan daftar buku awal
        updateDaftarBuku(daftarBukuArea);
    }

    private void updateDaftarBuku(JTextArea daftarBukuArea) {
        daftarBukuArea.setText("");
        for (BukuGUI buku : daftarBuku) {
            daftarBukuArea.append(buku.getStatus() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SistemPeminjamanBukuGUI().setVisible(true);
            }
        });
    }
}
