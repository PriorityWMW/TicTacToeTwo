/*  Tic Tac Toe's GUI code
    Wiggins, William
    THIS IS MY OWN WORK
    09/03/16
    Revised 09/16/18
*/
package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 
 

public class TicTacToe extends JFrame 
{
    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JButton button4;
    public JButton button5;
    public JButton button6;
    public JButton button7;
    public JButton button8;
    public JButton button9;
    public JButton button10;
    public JButton button11;
    public JButton button12;
    
    Main main = new Main();
    public TicTacToe()
    {
        setLayout( new GridLayout(3, 4));
        for(int switchID = 0; switchID < 12; switchID++)
        {
            switch (switchID)
            {
                case 0:
                    button1.setText("");
                    button1.addActionListener((e) ->
            {
                this.button1ActionPerformed(e);
            }); break;
                case 1:
                    button2.setText("");
                    button2.addActionListener((ActionEvent e) ->
                    {
                        button2ActionPerformed(e);
                    }); break;
                case 2:
                    button3.setText("");
                    button3.addActionListener((ActionEvent e) ->
                    {
                        button3ActionPerformed(e);
                    }); break;
                case 3:
                    button4.setText("");
                    button4.addActionListener((ActionEvent e) ->
                    {
                        button4ActionPerformed(e);
                    }); break;
                case 4:
                    button5.setText("");
                    button5.addActionListener((ActionEvent e) ->
                    {
                        button5ActionPerformed(e);
                    }); break;
                case 5:
                    button6.setText("");
                    button6.addActionListener((ActionEvent e) ->
                    {
                        button6ActionPerformed(e);
                    }); break;
                case 6:
                    button7.setText("");
                    button7.addActionListener((ActionEvent e) ->
                    {
                        button7ActionPerformed(e);
                    }); break;
                case 7:
                    button8.setText("");
                    button8.addActionListener((ActionEvent e) ->
                    {
                        button8ActionPerformed(e);
                    }); break;
                case 8:
                    button9.setText("");
                    button9.addActionListener((ActionEvent e) ->
                    {
                        button9ActionPerformed(e);
                    }); break;
                case 9:
                    button10.setText("");
                    button10.addActionListener((ActionEvent e) ->
                    {
                        button10ActionPerformed(e);
                    }); break;
                case 10:
                    button11.setText("");
                    button11.addActionListener((ActionEvent e) ->
                    {
                        button11ActionPerformed(e);
                    }); break;
                case 11:
                    button12.setText("");
                    button12.addActionListener((ActionEvent e) ->
                    {
                        button12ActionPerformed(e);
                    }); break;
                default:
                    break;
            }

        }
        setSize( 350, 350 );
        initComponents();
    }
 
    private void button1ActionPerformed(ActionEvent e) 
    {
        if(button1.getText().equals(""))
        {
            if(Main.playerTurn == true)
            {
                button1.setText("X");
                Main.whoWon();
                Main.playerTurn = false;
            }
            else 
            {
                button1.setText("O");
                Main.whoWon();
                Main.playerTurn = true;
            }
        }
    }
 
    private void button2ActionPerformed(ActionEvent e)
    {
            if(button2.getText().equals(""))
            {
                if(Main.playerTurn == true)
                {
                    button2.setText("X");
                    Main.whoWon();
                    Main.playerTurn = false;
                }
                else 
                {
                    button2.setText("O");
                    Main.whoWon();
                    Main.playerTurn = true;
                }
            }
    }
 
    private void button3ActionPerformed(ActionEvent e)
    {
            if(button3.getText().equals(""))
            {
                if(Main.playerTurn == true)
                {
                    button3.setText("X");
                    Main.whoWon();
                    Main.playerTurn = false;
                }
                else 
                {
                    button3.setText("O");
                    Main.whoWon();
                    Main.playerTurn = true;
                }
            }
    }
 
    private void button4ActionPerformed(ActionEvent e)
    {
            if(button4.getText().equals(""))
            {
                if(Main.playerTurn == true)
                {
                    button4.setText("X");
                    Main.whoWon();
                    Main.playerTurn = false;
                }
                else 
                {
                    button4.setText("O");
                    Main.whoWon();
                    Main.playerTurn = true;
                }
            }        
    }
 
    private void button5ActionPerformed(ActionEvent e) 
    {
            if(button5.getText().equals(""))
            {
                if(Main.playerTurn == true)
                {
                    button5.setText("X");
                    Main.whoWon();
                    Main.playerTurn = false;
                }
                else 
                {
                    button5.setText("O");
                    Main.whoWon();
                    Main.playerTurn = true;
                }
            }        
    }
 
    private void button6ActionPerformed(ActionEvent e) 
    {
            if(button6.getText().equals(""))
            {
                if(Main.playerTurn == true)
                {
                    button6.setText("X");
                    Main.whoWon();
                    Main.playerTurn = false;
                }
                else 
                {
                    button6.setText("O");
                    Main.whoWon();
                    Main.playerTurn = true;
                }
            }        
    }
 
    private void button7ActionPerformed(ActionEvent e) 
    {
            if(button7.getText().equals(""))
            {
                if(Main.playerTurn == true)
                {
                    button7.setText("X");
                    Main.whoWon();
                    Main.playerTurn = false;
                }
                else 
                {
                    button7.setText("O");
                    Main.whoWon();
                    Main.playerTurn = true;
                }
            }        
    }
 
    private void button8ActionPerformed(ActionEvent e) 
    {
            if(button8.getText().equals(""))
            {
                if(Main.playerTurn == true)
                {
                    button8.setText("X");
                    Main.whoWon();
                    Main.playerTurn = false;
                }
                else 
                {
                    button8.setText("O");
                    Main.whoWon();
                    Main.playerTurn = true;
                }
            }        
    }
 
    private void button9ActionPerformed(ActionEvent e) 
    {
            if(button9.getText().equals(""))
            {
                if(Main.playerTurn == true)
                {
                    button9.setText("X");
                    Main.whoWon();
                    Main.playerTurn = false;
                }
                else 
                {
                    button9.setText("O");
                    Main.whoWon();
                    Main.playerTurn = true;
                }
            }        
    }
    public void button10ActionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
    public void button11ActionPerformed(ActionEvent e)
    {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
    }
    public void button12ActionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(null, "I told you this does nothing");
    }
 
    private void initComponents() 
    {
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
 
        //======== this ========
        setTitle("Tic Tac Toe");
        Container contentPane = getContentPane();
 
        //---- button1 ----
        button1.setText("");
        button1.addActionListener((ActionEvent e) -> 
        {
            button1ActionPerformed(e);
        });
 
        //---- button2 ----
        button2.setText("");
        button2.addActionListener((ActionEvent e) -> 
        {
            button2ActionPerformed(e);
        });
 
        //---- button3 ----
        button3.setText("");
        button3.addActionListener((ActionEvent e) -> 
        {
            button3ActionPerformed(e);
        });
 
        //---- button4 ----
        button4.setText("");
        button4.addActionListener((ActionEvent e) ->
        {
            button4ActionPerformed(e);
        });
 
        //---- button5 ----
        button5.setText("");
        button5.addActionListener((ActionEvent e) -> 
        {
            button5ActionPerformed(e);
        });
 
        //---- button6 ----
        button6.setText("");
        button6.addActionListener((ActionEvent e) ->
        {
            button6ActionPerformed(e);
        });
 
        //---- button7 ----
        button7.setText("");
        button7.addActionListener((ActionEvent e) -> 
        {
            button7ActionPerformed(e);
        });
 
        //---- button8 ----
        button8.setText("");
        button8.addActionListener((ActionEvent e) ->
        {
            button8ActionPerformed(e);
        });
 
        //---- button9 ----
        button9.addActionListener((ActionEvent e) -> 
        {
            button9ActionPerformed(e);
        });
        
        //---- button10 ----
        button10.setText("Quit");
        button10.addActionListener((ActionEvent e) ->
        {
            button10ActionPerformed(e);
        });
        
        //---- button11 ----
        button11.setText("Reset");
        button11.addActionListener((ActionEvent e) ->
        {
            button11ActionPerformed(e);
        });
        
        
        //---- button12 ----
        button11.setText("Nothing");
        button11.addActionListener((ActionEvent e) ->
        {
            button12ActionPerformed(e);
        });

    }
}