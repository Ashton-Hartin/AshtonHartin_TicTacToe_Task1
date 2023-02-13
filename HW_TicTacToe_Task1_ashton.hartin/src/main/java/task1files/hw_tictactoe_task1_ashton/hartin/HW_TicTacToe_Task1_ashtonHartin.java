package task1files.hw_tictactoe_task1_ashton.hartin;

public class HW_TicTacToe_Task1_ashtonHartin 
{
    public static void main(String[] args) 
    {
        char[][] board = {{' ', '|', ' ', '|', ' '},
                          {'-', '+', '-', '+', '-'},
                          {' ', '|', ' ', '|', ' '},
                          {'-', '+', '-', '+', '-'},
                          {' ', '|', ' ', '|', ' '}};
        
        printGame(board);
    }
    
    public static void printGame(char[][] board)
    {
        for(char[] row : board)
        {
            for(char i : row)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
