import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
public class Tic_Tac_Toe_Board extends JFrame
{
    private Container pane;
    private String PLAYER;
    private String SYSTEM;
    private JButton [][] gameBoard;
    
    public Tic_Tac_Toe_Board() 
    {
        super();
        pane = this.getContentPane();
        pane.setLayout(new GridLayout(3,3));
        setTitle("Tic Tac Toe");
        setSize(650,650);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        PLAYER = "X";
        SYSTEM = "O";
        gameBoard = new JButton[3][3];
        intializeBoard();
    }
    
    private void intializeBoard() 
    {
        for(int a = 0; a < 3; a++)
        {
            for(int b = 0; b < 3; b++)
            {
                JButton btn = new JButton();
                gameBoard[a][b] = btn;
                btn.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        
                    }
                }
            }
        }
    }
    private void togglePLAYER() {}
    private void toggleSYSTEM() {}
    
    
}
