import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame{
    private JPanel rootPanel;
    private JPanel GamePanel;
    Block buttons[]=new Block[9];
    public TicTacToe(){
        add(rootPanel);
        setTitle("TicTacToe");
        setSize(400,400);

        GamePanel.setLayout(new GridLayout(3,3));
        for(int i=0;i<9;i++){
            buttons[i]=new Block();
            GamePanel.add(buttons[i]);
        }
//
//        MouseAdapter myadapter =new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent e) {
//                super.mousePressed(e);
//                JLabel tmp= (JLabel) e.getSource();
//                System.out.println("hii i have a label" + tmp.get);
//
//                //labelClicked(tmp.getName());
//            }
//        };
//
//        field00.addMouseListener(myadapter);
//        field01.addMouseListener(myadapter);
//        field02.addMouseListener(myadapter);
//        field10.addMouseListener(myadapter);
//        field11.addMouseListener(myadapter);
//        field12.addMouseListener(myadapter);
//        field20.addMouseListener(myadapter);
//        field21.addMouseListener(myadapter);
//        field22.addMouseListener(myadapter);
//        System.out.println("Added listeners");
    }
    public void labelClicked(String label){
        int x = label.charAt(label.length()-1);
        int y = label.charAt(label.length()-2);

        System.out.format("%d  %d %n",x,y);

    }

}
