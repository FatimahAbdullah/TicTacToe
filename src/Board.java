public class Board {
    private int[][] matrix;
    public Board(){
        matrix=new int[3][3];
        for(int[] row: matrix){
            for(int col: row)
                col=0;
        }
    }
    public void makeMove(int player, int x, int y){
        matrix[x][y]=player;
        TicTacToe.moveMade(x,y);
    }
    public boolean moveExists(int x, int y){
        return matrix[x][y]==0;
    }
    public boolean check() {
        //check rows
        for(int[] row: matrix){
            if(row[0]!=0 && row[0]==row[1] && row[0]==row[2]){
                    return true;
            }
        }
        //check columns
        for(int i=0; i<3; i++){
            if(matrix[i][0]!=0 && matrix[i][0]==matrix[i][1] && matrix[i][0]==matrix[i][2]){
                return true;
            }
        }
        //check right diagonal
        if(matrix[0][0]!=0 && matrix[0][0]==matrix[1][1] && matrix[1][1]==matrix[2][2]){
            return true;
        }
        //check left diagonal
        if(matrix[0][2]!=0 && matrix[0][2]==matrix[1][1] && matrix[1][1]==matrix[2][0]){
            return true;
        }
        return false;
    }
}
