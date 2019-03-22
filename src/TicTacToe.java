import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame{
    private JPanel rootPanel;
    private JPanel GamePanel;
    private static Block buttons[]=new Block[9];
    private static int player=1;
    private static Board gameBoard=new Board();
    public TicTacToe(){
        add(rootPanel);
        setTitle("TicTacToe");
        setSize(400,400);
        GamePanel.setLayout(new GridLayout(3,3));
        for(int i=0;i<9;i++){
            buttons[i]=new Block();
            buttons[i].setName(Integer.toString(i));
            GamePanel.add(buttons[i]);
        }
    }
    public static void move(int n){
        int x=n/3;
        int y=n%3;
        System.out.println(x);
        System.out.println(y);
        if(gameBoard.moveExists(x,y)){
            gameBoard.makeMove(player, x, y);
            togglePlayer();
        }
    }
    private static void togglePlayer(){
        switch (player){
            case 1:
                player=2;
                break;
            case 2:
                player=1;
                break;
        }
    }

    public static void moveMade(int x, int y){
        int n=x*3+y;
        buttons[n].changeIcon(player);
    }
}
