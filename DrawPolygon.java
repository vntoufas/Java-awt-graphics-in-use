import java.awt.Color;
import java.awt.Graphics; 
import javax.swing.JPanel; 

import java.awt.Container;
import java.awt.Polygon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;


public class DrawPolygon extends JPanel {
    private int angles;
    private String hroma;
    public void paintComponent( Graphics g ) {
 
    super.paintComponent(g);
    

    //String color=JOptionPane.showInputDialog("Enter color :");
Polygon p = new Polygon();
    for (int i = 0; i < angles; i++)
      p.addPoint((int) (100 + 50 * Math.cos(i * 2 * Math.PI / angles)),
          (int) (100 + 50 * Math.sin(i * 2 * Math.PI / angles)));
  if (get_color().equals("green"))
            {g.setColor(Color.green);}
  else if (get_color().equals("red"))
            {g.setColor(Color.red);}
    g.fillPolygon(p);
  
    }
void set_angles(int angles){this.angles=angles;}

void set_color(String color){hroma=color;}

String get_color(){return hroma;}
}
   