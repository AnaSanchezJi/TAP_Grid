import java.awt.*;
import javax.swing.*;
   public class calculadora extends JFrame {
   JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
   JLabel label1 , label2, label3, label4, label5;

   public calculadora (){
    setLayout (new GridLayout (5,5));
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
//botones del- 1,2,3,4
button0= new JButton("0");
add(button0);

button1= new JButton("1");  
add(button1);
 
button2= new JButton("2");  
add(button2);


button3= new JButton("3");  
add(button3);


button4= new JButton("4");  
add(button4);
	

//Botones 4,5,6,7,8,9 

	button5 = new JButton("5");
	add(button5);

	button6 = new JButton("6");
	add(button6);

	button7 = new JButton("7");
	add(button7);

	button8 = new JButton("8");
	add(button8);

	button9 = new JButton("9");
	add(button9); 

  }
 public static void main(String args[]){
calculadora abc = new calculadora();
abc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
abc.setVisible(true);
abc.pack();
abc.setTitle("TAP_GridLout");
}
}
