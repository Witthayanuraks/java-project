package Simulatedbankin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleBankingApp extends JFrame {
    private double balance = 1000.00000;  // Saldo awal
    private JLabel balanceLabel;
    private JTextField amountField;
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton checkBalanceButton;

    public SimpleBankingApp() {
        setTitle("Aplikasi Perbankan Sederhana");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel utama
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        // Komponen GUI
        balanceLabel = new JLabel("Saldo saat ini: Rp " + balance);
        amountField = new JTextField();
        depositButton = new JButton("Setor");
        withdrawButton = new JButton("Tarik");
        checkBalanceButton = new JButton("Cek Saldo");

        //  Action button  "Setor"
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(amountField.getText());
                    if (amount > 0) {
                        balance += amount;
                        updateBalance();
                        JOptionPane.showMessageDialog(null, "Setoran berhasil! Saldo bertambah Rp " + amount);
                    } else {
                        JOptionPane.showMessageDialog(null, "Jumlah setoran harus positif.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan jumlah yang valid.");
                }
            }
        });

        //  Action button "Tarik"
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(amountField.getText());
                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        updateBalance();
                        JOptionPane.showMessageDialog(null, "Penarikan berhasil! Saldo berkurang Rp " + amount);
                    } else if (amount > balance) {
                        JOptionPane.showMessageDialog(null, "Saldo tidak mencukupi.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Jumlah penarikan harus positif.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan jumlah yang valid.");
                }
            }
        });

        // Action button "Cek Saldo"
        checkBalanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Saldo saat ini: Rp " + balance);
            }
        });

        // Menambahkan komponen ke panel
        panel.add(new JLabel("Jumlah:"));
        panel.add(amountField);
        panel.add(depositButton);
        panel.add(withdrawButton);
        panel.add(checkBalanceButton);
        panel.add(balanceLabel);

        add(panel);

        // Menampilkan frame
        setVisible(true);
    }

    private void updateBalance() {
        balanceLabel.setText("===============================");
        balanceLabel.setText("Saldo saat ini: Rp " + balance);
        balanceLabel.setText("===============================");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleBankingApp();
            }
        });
    }
}
