import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame{
    private JPanel rootPanel;
    private JPanel GamePanel;
    private JLabel playerTurn;
    private JLabel status;
    private Block buttons[]=new Block[9];
    private int player=1;
    private Board gameBoard=new Board(this);
    public TicTacToe(){
        add(rootPanel);
        setTitle("TicTacToe");
        setSize(400,400);
        GamePanel.setLayout(new GridLayout(3,3));
        for(int i=0;i<9;i++){
            buttons[i]=new Block(this);
            buttons[i].setName(Integer.toString(i));
            GamePanel.add(buttons[i]);
        }
        playerTurn.setText("Player 1's Turn!");
        playerTurn.setForeground(Color.blue);
    }
    public void move(int n){
        int x=n/3;
        int y=n%3;
        if(gameBoard.moveExists(x,y) && !gameBoard.over){
            gameBoard.makeMove(player, x, y);
            if(!gameBoard.over) {
                togglePlayer();
            }
        }
    }
    private void togglePlayer(){
        switch (player){
            case 1:
                player=2;
                playerTurn.setText("Player 2's Turn!");
                playerTurn.setForeground(Color.green);
                break;
            case 2:
                player=1;
                playerTurn.setText("Player 1's Turn!");
                playerTurn.setForeground(Color.blue);
                break;
        }
    }
    public void moveMade(int x, int y){
        int n=x*3+y;
        buttons[n].changeIcon(player);
        boolean check=gameBoard.check();
        boolean tie=gameBoard.checkTie();
        System.out.println(check);
        if(check){
            String str=String.format("Player %d WON!", player);
            System.out.println(str);
            status.setText(str);
            status.setForeground(Color.RED);
            disableButtons();
        }
        else if(tie){
            System.out.println("Game TIED!");
            status.setText("Game TIED!");
            status.setForeground(Color.RED);
            disableButtons();
        }
    }
    private void disableButtons(){
        for(int i=0; i<9;i++){
            buttons[i].setEnabled(false);
        }
    }
}
