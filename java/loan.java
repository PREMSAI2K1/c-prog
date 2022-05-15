import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
class loan implements ActionListener
{
Frame f=new Frame("Loan Calculation");
Label l1=new Label("Total amount");
TextField tf1=new TextField();
Label l2=new Label("No. of months");
TextField tf2=new TextField();
Label l3=new Label("interest");
TextField tf3=new TextField();
Label l4=new Label("EMI");
TextField tf4=new TextField();
Button b=new Button("Done");
loan()
{
l1.setBounds(50,100,100,20);
tf1.setBounds(50,140,100,20);
f.add(l1);f.add(tf1);
l2.setBounds(50,180,100,20);
tf2.setBounds(50,220,100,20);
f.add(l2);f.add(tf2);
l3.setBounds(50,240,100,20);
tf3.setBounds(50,280,100,20);
f.add(l3);f.add(tf3);
l4.setBounds(50,320,100,20);
tf4.setBounds(50,360,100,20);
f.add(l4);f.add(tf4);
b.setBounds(50,400,100,20);
f.add(b);
b.addActionListener(this);
f.setLayout(null);
f.setVisible(true);
f.setSize(1000,1000);
}
public void actionPerformed(ActionEvent e)
{
int n1=Integer.parseInt(tf1.getText());
int n2=Integer.parseInt(tf2.getText());
Double n3=Double.parseDouble(tf3.getText());
n3=(n3/(12*100));
if(e.getSource()==b)
{
tf4.setText(String.valueOf((n1*n3*Math.pow(1+n3,n2))/(Math.pow(1+n3,n2)-
1)));
}
}
public static void main(String[] args)
{
new loan();
}
}
