import java.awt.*;
import javax.swing.*;
   public class calculadora extends JFrame {
   JButton button1, button2, button3;
   JLabel label1 , label2, label3;

   public calculadora (){
    setLayout (new GridLayout (5,4));


                   }
 public static void main(String args[]){
calculadora abc = new calculadora();
abc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
abc.setVisible(true);
abc.pack();
abc.setTitle("TAP_GridLout");
}
}
