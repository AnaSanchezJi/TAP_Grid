import java.awt.*;
import javax.swing.*;
   public class layout extends JFrame {
   JButton button1, button2, button3;
   JLabel label1 , label2, label3;

   public layout (){
    setLayout (new GridLayout (2,3));
    
    button1 = new JButton("Button 1");
    add(button1);
   
    label1 = new JLabel("Label 1");
    add(label1);
  //---------------------------------------
    button2 = new JButton("Button 2");
    add(button2);
   
    label2 = new JLabel ("Label 2");
    add(label2);
   //----------------------------------
    button3= new JButton("Button 3");
    add(button3);
   
    label3 = new JLabel ("Label 3");
    add(label3);
   //----------------------------------
                   }
 public static void main(String args[]){
layout abc = new layout();
abc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
abc.setVisible(true);
abc.pack();
abc.setTitle("TAP_GridLout");
}
}
