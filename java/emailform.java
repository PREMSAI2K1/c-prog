import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class emailform
{ 
public static void main(String[] args) 
{ 
Frame f=new Frame("Email Registration Form"); 
JLabel jl1,jl2,jl3,jl4; 
JButton jb;
JTextField t1,t2;
JPasswordField p;
JRadioButton r1,r2;
jl1=new JLabel("Username");
jl1.setBounds(50,50,200,30);
t1=new JTextField(); 
t1.setBounds(50,100,200,30); 
jl2=new JLabel("Password");
jl2.setBounds(50,150,200,30); 
p=new JPasswordField(); 
p.setBounds(50,200,200,30);
jl3=new JLabel("Mobile no.");
jl3.setBounds(50,250,200,30);
t2=new JTextField();
t2.setBounds(50,300,200,30);
jl4=new JLabel("Gender");
jl4.setBounds(50,350,200,30);
r1=new JRadioButton("A) Male");
r1.setBounds(50,400,200,30);
r2=new JRadioButton("B) Female");
r2.setBounds(50,450,200,30);
jb=new JButton("submit");
jb.setBounds(50,500,200,30);
ButtonGroup bg=new ButtonGroup(); 
bg.add(r1);bg.add(r2); 
f.add(jl1);f.add(jl2);f.add(jl3);f.add(jl4);
f.add(t1);f.add(t2);f.add(p);f.add(jb);f.add(r1);f.add(r2);
f.setSize(1000,1000);
f.setLayout(null);
f.setVisible(true);
f.addWindowListener(new WindowAdapter() 
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}
}