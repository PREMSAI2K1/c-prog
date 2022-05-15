import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class Test implements ActionListener {
 Button b1;
 TextField t1, t2;
 Label lb1, lb2, lb3;
 Frame f;
 Test() {
 f = new Frame("Awt Login Window");
 lb1 = new Label("Enter ID :");
 lb1.setBounds(5, 50, 150, 30);
 f.add(lb1);
 t1 = new TextField();
 t1.setBounds(200, 50, 150, 30);
 f.add(t1);
 t2 = new TextField();
 t2.setBounds(200, 80, 150, 30);
 f.add(t2);
 lb2 = new Label("Enter Password :");
 lb2.setBounds(5, 80, 150, 30);
 t2.addActionListener(this);
 t2.setEchoChar('*');
 f.add(lb2);
 lb3 = new Label("Result :");
 lb3.setBounds(90, 140, 150, 30);
 f.add(lb3);
 b1 = new Button("Login");
 b1.setBounds(90, 200, 100, 30);
 f.add(b1);
 b1.addActionListener(this);
 f.addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent we) {
 System.exit(0);
 }
 });
 f.setLayout(null);
 f.setSize(600, 500);
 f.setVisible(true);
 }
 public void actionPerformed(ActionEvent e) {
 int c = 0;
 if (e.getSource().equals(b1)) {
 if (t1.getText().equals("abc") && (t2.getText().equals("123"))) {
 lb3.setText(String.valueOf("Success login!"));
 } else {
 lb3.setText(String.valueOf("Invalid login!"));
 }
 }
 }
 public static void main(String args[]) {
 Test t = new Test();
 }
 }
