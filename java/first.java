import java.applet.*;
import java.awt.*;
public class first extends Applet
{
public void init()
{
setBackground(Color.blue);
}
public void paint(Graphics g)
{
g.setColor(Color.black);
g.drawString("welcome to applet",100,150);
}
}
/*
<applet code="first.class"width="300"height="300">
</applet>*/
