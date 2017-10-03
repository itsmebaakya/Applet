import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="sb"width=500 height=200>
</applet>
*/
public class sb extends Applet implements AdjustmentListener,MouseMotionListener
{
String msg=" ";
Scrollbar vert,horz;
public  void init()
{
int width=Integer.parseInt(getParameter("width"));
int height=Integer.parseInt(getParameter("height"));
vert=new Scrollbar(Scrollbar.VERTICAL,0,1,0,height);
horz=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,width);
add(vert);
add(horz);
vert.addAdjustmentListener(this);
horz.addAdjustmentListener(this);
}
public void adjustmentValueChanged(AdjustmentEvent me)
{
repaint();
}
public void mouseDragged(MouseEvent me)
{
int X=me.getX();
int Y=me.getY();
vert.getValue();
horz.getValue();
repaint();
}
public void mouseMoved(MouseEvent me)
{
}
public void paint(Graphics g)
{
msg="Vertical"+vert.getValue();
msg+="Horizental"+horz.getValue();
g.drawString(msg,6,160);
g.drawString("*",horz.getValue(),vert.getValue());
}
}


