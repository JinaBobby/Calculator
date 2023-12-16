import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener{
static JFrame f;
String msg="";
static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;;
static JTextField t;
String temp,t2;
public static void main(String args[]){
Calculator c = new Calculator();
f = new JFrame();
t = new JTextField();
t.setBounds(50,150,200,50);
f.add(t);
b1=new JButton("1");
b2=new JButton("2");
b3=new JButton("3");
b4=new JButton("4");
b5=new JButton("5");
b6=new JButton("6");
b7=new JButton("7");
b8=new JButton("8");
b9=new JButton("9");
b10=new JButton("0");
b11=new JButton("+");
b12=new JButton("-");
b13=new JButton("*");
b14=new JButton("/");
b15=new JButton("C");
b16=new JButton(".");
b17=new JButton("=");
b1.setBounds(50,200,50,50);
b2.setBounds(100,200,50,50);
b3.setBounds(150,200,50,50);
b4.setBounds(50,250,50,50);
b5.setBounds(100,250,50,50);
b6.setBounds(150,250,50,50);
b7.setBounds(50,300,50,50);
b8.setBounds(100,300,50,50);
b9.setBounds(150,300,50,50);
b10.setBounds(50,350,50,50);
b11.setBounds(200,200,50,50);
b12.setBounds(200,250,50,50);
b13.setBounds(200,300,50,50);
b14.setBounds(200,350,50,50);
b15.setBounds(50,400,50,50);
b16.setBounds(100,350,50,50);
b17.setBounds(150,350,50,50);
b1.addActionListener(c);
b2.addActionListener(c);
b3.addActionListener(c);
b4.addActionListener(c);
b5.addActionListener(c);
b6.addActionListener(c);
b7.addActionListener(c);
b8.addActionListener(c);
b9.addActionListener(c);
b10.addActionListener(c);
b11.addActionListener(c);
b12.addActionListener(c);
b13.addActionListener(c);
b14.addActionListener(c);
b15.addActionListener(c);
b16.addActionListener(c);
b17.addActionListener(c);
f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);
f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);
f.add(b13);f.add(b14);f.add(b15);f.add(b16);f.add(b17);
f.setSize(500,600);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){
double r=0,a,b;
String str=ae.getActionCommand();
if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/")){
msg="";
temp=str;
t2=t.getText();
t.setText("");
}
else if(str.equals("C")){
msg="";
t.setText("");
}
else if(str.equals("=")){
a=Double.parseDouble(t2);
if(temp.equals("+")){
b=Double.parseDouble(t.getText());
r=a+b;
}
else if(temp.equals("-")){
b=Double.parseDouble(t.getText());
r=a-b;
}
else if(temp.equals("*")){
                                                      b=Double.parseDouble(t.getText());
r=a*b;

}
else {
                                                b=Double.parseDouble(t.getText());
r=a/b;
}
t.setText(Double.toString(r));
}
else{
msg=msg+str;
t.setText(msg);
}
}
}

