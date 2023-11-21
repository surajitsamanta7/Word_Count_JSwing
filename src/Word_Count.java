import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Word_Count {
    Word_Count(){
        //Create Jframe
        JFrame jf=new JFrame();
        jf.setSize(300,300);
        jf.setTitle("Word Count");
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setLocation(500,100);
//Create JLabel
        JLabel jlab=new JLabel();
        jlab.setText("Enter word");
        jlab.setBounds(10,10,230,30);
        jf.add(jlab);
//create Textarea
        JTextArea jta=new JTextArea();
        jta.setBounds(20,50,230,56);
        jta.setBackground(Color.white);
        jta.setForeground(Color.BLUE);
        jf.add(jta);
//create Button
        JButton jb=new JButton();
        jb.setBounds(100,110,69,40);
        jb.setText("Count");
        jf.add(jb);
        //use Another label
        JLabel jLabel=new JLabel();
        jLabel.setBounds(40,170,230,30);
        jf.add(jLabel);
        jb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String etex=jta.getText();
                jLabel.setText("No of Character: "+etex.length());
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");

            }
        });
    }
    public static void main(String[] args) {
        Word_Count wc = new Word_Count();
    }
}

