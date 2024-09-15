package Chats;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatSimulation extends JFrame {
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;

    public ChatSimulation() {
        setTitle("Simulasi Chatting");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel untuk menampilkan chat
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Panel untuk input user
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        inputField = new JTextField();
        sendButton = new JButton("Kirim");

        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        // Tambahkan aksi saat tombol "Kirim" ditekan
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        // Aksi saat tombol Enter ditekan di inputField
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        // Tambahkan panel ke frame
        add(scrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);
    }

    private void sendMessage() {
        String userMessage = inputField.getText();

        if (!userMessage.trim().isEmpty()) {
            chatArea.append("You: " + userMessage + "\n");

            // Simulasi balasan otomatis dari bot
            String botReply = getBotReply(userMessage);
            chatArea.append("Bot: " + botReply + "\n");

            inputField.setText(""); //
        }
    }

    private String getBotReply(String userMessage) {
        // Respon sederhana dari bot berdasarkan input user
        if (userMessage.contains("halo") || userMessage.contains("hi")) {
            return "Halo juga! Ada yang bisa dibantu?";
        } else if (userMessage.contains("apa kabar")) {
            return "Saya adalah bot, saya selalu baik :)";
        } else if (userMessage.contains("terima kasih")) {
            return "Sama-sama!";
        } else {
            return "Wakarimasen, can you repeat?";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChatSimulation().setVisible(true);
            }
        });
    }
}

