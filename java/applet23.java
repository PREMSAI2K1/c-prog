import javax.swing.*;
import java.awt.event.*;
public class applet23 implements KeyListener {
JLabel l=new JLabel();
applet23(){
JTextArea ta=new JTextArea("");
JFrame f=new JFrame("program 23");
ta.setBounds(50, 100, 250, 300);
ta.addKeyListener(this);
ta.setLineWrap(true);
ta.setWrapStyleWord(true);
f.add(ta);
l.setBounds(50,50,250,50);
f.add(l);
f.setLayout(null);
f.setSize(500, 500);
f.setVisible(true);
}
public static void main(String args[]) {
new applet23();
}
public void keyTyped(KeyEvent e) {
l.setText("You're typing something!!!");
}
public void keyPressed(KeyEvent e) {
l.setText("You're pressing the arrow button");
}
public void keyReleased(KeyEvent e) {
l.setText("Thank god, You released the key");
}
}
