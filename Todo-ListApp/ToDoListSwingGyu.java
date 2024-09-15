/* Initialize */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * github.com/Watthayanuraks/
 */
public class ToDoListSwingGyu {

    // Model daftar tugas
    private static DefaultListModel<String> listModel = new DefaultListModel<>();
    private static JList<String> taskList = new JList<>(listModel);

    public static void main(String[] args) {
        // Proccess the frame
        JFrame frame = new JFrame("To-Do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Create panel and component
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        
        JTextField taskInput = new JTextField(20);
        JButton addButton = new JButton("Add Task");
        JButton removeButton = new JButton("Remove Task");
        JButton editButton = new JButton("Edit Task");

        // Component to panel
        panel.add(taskInput);
        panel.add(addButton);
        panel.add(removeButton);
        panel.add(editButton);

        // Add  panel and list to frame
        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(taskList), BorderLayout.CENTER);

        // Action button  "Add Task"
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = taskInput.getText();
                if (!task.isEmpty()) {
                    listModel.addElement(task);
                    taskInput.setText("");
                }
            }
        });

        // Action button  "Remove Task"
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                }
            }
        });

        // Action button "Edit Task"
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    String newTask = JOptionPane.showInputDialog(frame, "Edit Task:", listModel.get(selectedIndex));
                    if (newTask != null && !newTask.isEmpty()) {
                        listModel.set(selectedIndex, newTask);
                    }
                }
            }
        });

        // 
        frame.setVisible(true);
    }
}
