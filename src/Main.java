import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e){
            e.printStackTrace();
        }

        WelcomeScreen screen = new WelcomeScreen();
        screen.setVisible(true);
        screen.setResizable(false);
        screen.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}
