import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen extends JFrame {
    private JPanel rootPanel;
    private JLabel welcome;
    private JButton continueButton;

    public WelcomeScreen(){
        add(rootPanel);
        setTitle("Welcome Screen");
        setSize(400,400);
        JFrame frame=this;
        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                TicTacToe game=new TicTacToe();
                game.setVisible(true);
            }
        });

    }

}
