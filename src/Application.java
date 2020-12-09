import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application {
    private JButton button;
    private JPanel panel;
    private MessageSet messageSet = new MessageSet();

    public Application() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, messageSet.getRandomMessage());

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Application");
        frame.setContentPane(new Application().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
