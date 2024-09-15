/*Initialize  */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


/**
 * Started? Yessir ' github.com/Watthayanuraks/ '
 */
public class GuessNumberSwing {

    private static final int MIN = 1;
    private static final int MAX = 100;
    private static int numberToGuess;
    private static int numberOfTries = 0;

    public static void main(String[] args) {
        // Set up frame
        JFrame frame = new JFrame("Guess the Number Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        // Create components
        JTextField guessInput = new JTextField(10);
        JButton guessButton = new JButton("Guess");
        JLabel feedbackLabel = new JLabel("Guess a number between " + MIN + " and " + MAX + ".");
        JPanel panel = new JPanel();
        panel.add(new JLabel("Your Guess:"));
        panel.add(guessInput);
        panel.add(guessButton);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(feedbackLabel, BorderLayout.CENTER);

        // Initialize game
        Random random = new Random();
        numberToGuess = random.nextInt(MAX - MIN + 1) + MIN;

        // Set up button action
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int userGuess = Integer.parseInt(guessInput.getText());
                    numberOfTries++;

                    if (userGuess < numberToGuess) {
                        // feedbackLabel.setText("==================================================");
                        feedbackLabel.setText("Too low || Almost.  Try again.");
                        // feedbackLabel.setText("==================================================");
                    } else if (userGuess > numberToGuess) {
                        feedbackLabel.setText("Too high || Almost.  Try again.");
                    } else {
                        // feedbackLabel.setText("==================================================");
                        feedbackLabel.setText("Congratulations! You've guessed the number in " + numberOfTries + " tries 😎");
                        // feedbackLabel.setText("==================================================");
                        guessButton.setEnabled(false);
                    }
                } catch (NumberFormatException ex) {
                    feedbackLabel.setText("Invalid input. Please enter a number.");
                }
            }
        });

        // Show frame
        frame.setVisible(true);
    }
}
