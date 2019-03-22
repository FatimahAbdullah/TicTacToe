import javax.swing.*;

public class Board {
    TicTacToe controller;
    private int[][] matrix;
    boolean over=false;
    public Board(JFrame controller){
        this.controller=(TicTacToe) controller;
        matrix=new int[3][3];
        for(int[] row: matrix){
            for(int col: row)
                col=0;
        }
    }
    public void makeMove(int player, int x, int y){
        matrix[x][y]=player;
        controller.moveMade(x,y);
    }
    public boolean moveExists(int x, int y){
        return matrix[x][y]==0;
    }
    public boolean checkTie(){
        for(int[] row: matrix){
            for(int col: row){
                if(col==0)
                    return false;
            }
        }
        over=true;
        return true;
    }
    public boolean check() {
        //check rows
        for(int[] row: matrix){
            if(row[0]!=0 && row[0]==row[1] && row[0]==row[2]){
                    over=true;
                    return true;
            }
        }
        //check columns
        for(int i=0; i<3; i++){
            if(matrix[0][i]!=0 && matrix[0][i]==matrix[1][i] && matrix[0][i]==matrix[2][i]){
                over=true;
                return true;
            }
        }
        //check right diagonal
        if(matrix[0][0]!=0 && matrix[0][0]==matrix[1][1] && matrix[1][1]==matrix[2][2]){
            over=true;
            return true;
        }
        //check left diagonal
        if(matrix[0][2]!=0 && matrix[0][2]==matrix[1][1] && matrix[1][1]==matrix[2][0]){
            over=true;
            return true;
        }
        return false;
    }
}
