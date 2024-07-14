import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingExample {

    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Event Handling Example");

        // Create a JButton
        JButton button = new JButton("Click Me");

        // Add an ActionListener using an anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This code will be executed when the button is clicked
                System.out.println("Button Clicked!");
            }
        });

        // Add the button to the JFrame
        frame.getContentPane().add(button);

        // Set up the JFrame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
