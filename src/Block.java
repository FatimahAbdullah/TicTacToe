import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Block extends JButton implements ActionListener {
    ImageIcon X,O, none;
    byte value=0;
    public Block(){
        X=new ImageIcon(this.getClass().getResource("tick.png"));
        O=new ImageIcon(this.getClass().getResource("cancel.png"));
        none=new ImageIcon(this.getClass().getResource("none.png"));
        setIcon(none);
        this.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        value++;
        value%=3;
        switch(value){
            case 0:
                setIcon(null);
                break;
            case 1:
                setIcon(X);
                break;
            case 2:
                setIcon(O);
                break;
        }
    }
}