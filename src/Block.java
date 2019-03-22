import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Block extends JButton implements ActionListener {
    ImageIcon tick,cross, none;
    TicTacToe controller;
    byte value=0;
    public Block(JFrame controller){
        this.controller=(TicTacToe) controller;
        tick=new ImageIcon(this.getClass().getResource("tick.png"));
        cross=new ImageIcon(this.getClass().getResource("cancel.png"));
        none=new ImageIcon(this.getClass().getResource("none.png"));
        setIcon(none);
        this.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int n=Integer.parseInt(this.getName());
        controller.move(n);
        this.setEnabled(false);
    }
    public void changeIcon(int player){
        switch(player){
            case 1:
                setIcon(tick);
                break;
            case 2:
                setIcon(cross);
                break;
        }
    }

}