import java.awt.*;
import javax.swing.*;
   public class calculadora extends JFrame {
   JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button11, button12, button13, button14, button15, button16;
   JLabel label1 , label2, label3, label4;

   public calculadora (){
    setLayout (new GridLayout (5,4,8,8));
/*Pantalla de resultados*/
         label1 = new JLabel("  ");
              add(label1);     
         label2 = new JLabel("  ");
              add(label2);
         label3 = new JLabel("  ");
              add(label3);
          label4 = new JLabel("  ");
              add(label4);
       
//botones del- 1,2,3,4

button1= new JButton("1");  
 
button2= new JButton("2");  

button3= new JButton("3");  

button4= new JButton("4");  
	

//Botones 5,6,7,8,9 

	button5 = new JButton("5");

	button6 = new JButton("6");
	
	button7 = new JButton("7");

	button8 = new JButton("8");

	button9 = new JButton("9");

	button0= new JButton("0"); 
	
	button11= new JButton("/"); 
	button12= new JButton("*"); 
	button13= new JButton("-"); 
	button14= new JButton("+"); 
	button15= new JButton("="); 
	button16= new JButton("."); 
	add(button7);
	add(button8);
	add(button9);
	add(button11);
	add(button4);
	add(button5);
	add(button6);
	add(button12);
	add(button1);
	add(button2);
	add(button3);
	add(button13);
	add(button16);
	add(button0);
	add(button15);
	add(button14);

 }
 public static void main(String args[]){
calculadora abc = new calculadora();
abc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
abc.setVisible(true);
abc.pack();
abc.setTitle("TAP_GridLout");
abc.setSize(400,400);
}
}
