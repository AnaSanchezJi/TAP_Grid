import java.awt.*;
import javax.swing.*;
   public class calculadora extends JFrame {
   JButton button1, button2, button3;
   JLabel label1 , label2, label3, label4, label5;

   public calculadora (){
    setLayout (new GridLayout (5,4));
/*Pantalla de resultados*/
          label1 = new JLabel("  ");
              add(label1);     
         label2 = new JLabel("  ");
              add(label2);
         label3 = new JLabel("  ");
              add(label3);
          label4 = new JLabel("  ");
              add(label4);
          label5 = new JLabel("  ");
              add(label5);
//-----------------------
  
    }
 public static void main(String args[]){
calculadora abc = new calculadora();
abc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
abc.setVisible(true);
abc.pack();
abc.setTitle("TAP_GridLout");
}
}
