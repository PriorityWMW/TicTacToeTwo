/*  Tic Tac Toe's main code
    Wiggins, William
    THIS IS MY OWN WORK
    09/03/16
    Revised 09/16/18
*/
package Game;

import java.util.Scanner;
import javax.swing.*;

public class Main 
{
    public static boolean playerTurn = true;
    public static boolean xWins = false;
    public static boolean yWins = false;
    public static boolean playing = true;
    public static boolean playAgain = false;
    

    
    public static Scanner scan = new Scanner(System.in); 
    
    public static TicTacToe board = new TicTacToe();
    
    
    public static void main(String [] args )
    {
        if(board.isVisible() == false)
        {
            board.setVisible(true);
        }
      
        board.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );    

    }
    
    public static void whoWon()
    {
        if(board.button1.getText().equals("X"))
        {
            if(board.button4.getText().equals("X"))
            {
                if(board.button7.getText().equals("X"))
                {
                    xWins = true;
                    yWins = false;
                    JOptionPane.showMessageDialog(null, "Player X Wins!");
                }
            }

        }
        if(board.button1.getText().equals("X"))
        {
            if(board.button5.getText().equals("X"))
            {
                if(board.button9.getText().equals("X"))
                {
                    xWins = true;
                    yWins = false;
                    JOptionPane.showMessageDialog(null, "Player X Wins!");
                }
            }

        }
        if(board.button1.getText().equals("X"))
        {
            if(board.button2.getText().equals("X"))
            {
                if(board.button3.getText().equals("X"))
                {
                    xWins = true;
                    yWins = false;
                    JOptionPane.showMessageDialog(null, "Player X Wins!");
                }
            }

        }
        if(board.button3.getText().equals("X"))
        {
            if(board.button5.getText().equals("X"))
            {
                if(board.button7.getText().equals("X"))
                {
                    xWins = true;
                    yWins = false;
                    JOptionPane.showMessageDialog(null, "Player X Wins!");
                }
            }

        }
        if(board.button3.getText().equals("X"))
        {
            if(board.button6.getText().equals("X"))
            {
                if(board.button9.getText().equals("X"))
                {
                    xWins = true;
                    yWins = false;
                    JOptionPane.showMessageDialog(null, "Player X Wins!");
                }
            }

        }
        if(board.button7.getText().equals("X"))
        {
            if(board.button8.getText().equals("X"))
            {
                if(board.button9.getText().equals("X"))
                {
                    xWins = true;
                    yWins = false;
                    JOptionPane.showMessageDialog(null, "Player X Wins!");
                }
            }

        }
        if(board.button4.getText().equals("X"))
        {
            if(board.button5.getText().equals("X"))
            {
                if(board.button6.getText().equals("X"))
                {
                    xWins = true;
                    yWins = false;
                    JOptionPane.showMessageDialog(null, "Player X Wins!");
                }
            }

        }
        if(board.button2.getText().equals("X"))
        {
            if(board.button5.getText().equals("X"))
            {
                if(board.button8.getText().equals("X"))
                {
                    xWins = true;
                    yWins = false;
                    JOptionPane.showMessageDialog(null, "Player X Wins!");
                }
            }

        }
        if(board.button1.getText().equals("O"))
        {
            if(board.button4.getText().equals("O"))
            {
                if(board.button7.getText().equals("O"))
                {
                    xWins = false;
                    yWins = true;
                    JOptionPane.showMessageDialog(null, "Player Y Wins!");
                }
            }

        }
        if(board.button1.getText().equals("O"))
        {
            if(board.button5.getText().equals("O"))
            {
                if(board.button9.getText().equals("O"))
                {
                    xWins = false;
                    yWins = true;
                    JOptionPane.showMessageDialog(null, "Player Y Wins!");
                }
            }

        }
        if(board.button1.getText().equals("O"))
        {
            if(board.button2.getText().equals("O"))
            {
                if(board.button3.getText().equals("O"))
                {
                    xWins = false;
                    yWins = true;
                    JOptionPane.showMessageDialog(null, "Player Y Wins!");
                }
            }

        }
        if(board.button3.getText().equals("O"))
        {
            if(board.button5.getText().equals("O"))
            {
                if(board.button7.getText().equals("O"))
                {
                    xWins = false;
                    yWins = true;
                    JOptionPane.showMessageDialog(null, "Player Y Wins!");
                }
            }

        }
        if(board.button3.getText().equals("O"))
        {
            if(board.button6.getText().equals("O"))
            {
                if(board.button9.getText().equals("O"))
                {
                    xWins = false;
                    yWins = true;
                    JOptionPane.showMessageDialog(null, "Player Y Wins!");
                }
            }

        }
        if(board.button7.getText().equals("O"))
        {
            if(board.button8.getText().equals("O"))
            {
                if(board.button9.getText().equals("O"))
                {
                    xWins = false;
                    yWins = true;
                    JOptionPane.showMessageDialog(null, "Player Y Wins!");
                }
            }

        }
        if(board.button4.getText().equals("O"))
        {
            if(board.button5.getText().equals("O"))
            {
                if(board.button6.getText().equals("O"))
                {
                    xWins = false;
                    yWins = true;
                    JOptionPane.showMessageDialog(null, "Player Y Wins!");
                }
            }

        }
        if(board.button2.getText().equals("O"))
        {
            if(board.button5.getText().equals("O"))
            {
                if(board.button8.getText().equals("O"))
                {
                    xWins = false;
                    yWins = true;
                    JOptionPane.showMessageDialog(null, "Player Y Wins!");
                }
            }

        }
        if( xWins == true || yWins == true)
        {
            
            JOptionPane.showMessageDialog(null, "I am now wiping the board. If you want to play again, feel free. If not, use the X button or the Quit button. Thanks for playing!");

                board.button1.setText("");
                board.button2.setText("");
                board.button3.setText("");
                board.button4.setText("");
                board.button5.setText("");
                board.button6.setText("");
                board.button7.setText("");
                board.button8.setText("");
                board.button9.setText("");
                board.button10.setText("Quit");
                board.button11.setText("Reset");
                playerTurn = true;
                xWins = false;
                yWins = false;

        }

    }
}

        
        