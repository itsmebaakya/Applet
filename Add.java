import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Add extends Applet implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2;
public void init()
{
 l1=new Label("Number1");
l2=new Label("Number2");
l3=new Label("Result");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
b1=new Button("Add");
b2=new Button("Clear");
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(b1);add(b2);
setLayout(null);
l1.setBounds(100,100,100,20);t1.setBounds(220,100,100,20);
l2.setBounds(100,140,100,20);t2.setBounds(220,140,100,20);
l3.setBounds(100,180,100,20);t3.setBounds(220,180,100,20);
b1.setBounds(150,220,50,20);b2.setBounds(220,220,50,20);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
int a,b,c;
if(ae.getSource()==b1)
{
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a+b;
t3.setText(String.valueOf(c));
}
if(ae.getSource()==b2)
{
t1.setText("");
t2.setText("");
t3.setText("");
t1.requestFocus();
}
}
}
//<applet code=Add width=500 height=500></applet>