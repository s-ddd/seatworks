/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package second_quarter;

/**
 *
 * @author USER
 */
//I LOVE EVENT HANDLERS I LOVE EVENT HANDLERS I LOVE EVENT HANDLERS
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // step 1

public class seatwork4 implements ActionListener { //step 2
    JFrame frame;
    JButton zero, one, two, three, four, five, six, seven, eight, nine, enter, plus, minus, asterisk, fslash, clear;
    JTextField screen;
    
    public seatwork4() {
        frame = new JFrame("THE CALCULATOR");
        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        enter = new JButton("Enter");
        plus = new JButton("+");
        minus = new JButton("-");
        asterisk = new JButton("*");
        fslash = new JButton("/");
        clear = new JButton("C");
        screen = new JTextField();
}
    public void setFrame(){
        frame.setLayout(new GraphPaperLayout(new Dimension(8,10)));
        frame.add(zero, new Rectangle(0,8,2,2)); //x, y, width, height
        frame.add(enter, new Rectangle(4,8,2,2));
        frame.add(one, new Rectangle(0,6,2,2));
        frame.add(two, new Rectangle(2,6,2,2));
        frame.add(three, new Rectangle(4,6,2,2));
        frame.add(four, new Rectangle(0,4,2,2));
        frame.add(five, new Rectangle(2,4,2,2));
        frame.add(six, new Rectangle(4,4,2,2));
        frame.add(seven, new Rectangle(0,2,2,2));
        frame.add(eight, new Rectangle(2,2,2,2));
        frame.add(nine, new Rectangle(4,2,2,2));
        frame.add(clear, new Rectangle(2,8,2,2));
        frame.add(plus, new Rectangle(6,2,2,2));
        frame.add(fslash, new Rectangle(6,6,2,2));
        frame.add(asterisk, new Rectangle(6,8,2,2));
        frame.add(minus, new Rectangle(6,4,2,2));
        frame.add(screen, new Rectangle(0,0,8,2));
        
        zero.addActionListener(this);
        enter.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        clear.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        asterisk.addActionListener(this);
        fslash.addActionListener(this);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setSize(300,350);
    }
    public void actionPerformed(ActionEvent e) { // step 3
            //program goes here when an activated button is clicked
            if (e.getSource()==one) {
                String s=screen.getText();
                screen.setText(s+"1");
            }
            else if (e.getSource()==two) {
                String s=screen.getText();
                screen.setText(s+"2");
            }
            else if (e.getSource()==three) {
                String s=screen.getText();
                screen.setText(s+"3");
            }
            else if (e.getSource()==four) {
                String s=screen.getText();
                screen.setText(s+"4");
            }
            else if (e.getSource()==five) {
                String s=screen.getText();
                screen.setText(s+"5");
            }
            else if (e.getSource()==six) {
                String s=screen.getText();
                screen.setText(s+"6");
            }
            else if (e.getSource()==seven) {
                String s=screen.getText();
                screen.setText(s+"7");
            }
            else if (e.getSource()==eight) {
                String s=screen.getText();
                screen.setText(s+"8");
            }
            else if (e.getSource()==nine) {
                String s=screen.getText();
                screen.setText(s+"9");
            }
            else if (e.getSource()==zero) {
                String s=screen.getText();
                screen.setText(s+"0");
            }
    }
    public static void main(String[] args) {
        seatwork4 THE_CALCULATOR= new seatwork4();
        THE_CALCULATOR.setFrame();
    }
}