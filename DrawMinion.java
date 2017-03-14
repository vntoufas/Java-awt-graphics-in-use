import java.awt.Color;
import java.awt.Graphics; 
import javax.swing.JPanel; 


public class DrawMinion extends JPanel {
    
    public void paintComponent( Graphics g ) {
 
  g.setColor(Color.yellow);
  g.fillRect(40, 40, 170, 360);//κορμος μινιον
  g.setColor(Color.yellow);
  g.fillArc(5, 5, 240, 240, 45,90);//ζωγραφιζω το κεφαλι
  g.fillArc(5, 195, 240, 240, 225, 90);//ζωγραφιζω το κατω μερος του minion
  
  g.setColor(Color.gray);//περιγραμμα ματιων
  g.fillOval(65,120,50,50);//περιγραμμα ματιων γκρι#
  g.fillOval(135,120,50,50);//περιγραμμα ματιων γκρι#
  g.setColor(Color.white);//θετω ασπρο χρωμα , ματια παλι
  g.fillOval(140,125,40,40);//ασπτο ματιου
  g.fillOval(70,125,40,40);//ασπρο ματιου
  g.setColor(Color.black);//μαυρο για την κορη του ματιου
  g.fillOval(80,135,20,20);//κορη ματιου 
  g.fillOval(150,135,20,20);//κορη ματιου
  g.setColor(Color.blue);//διαλεγω μπλε χρωμα για την φορμα του minion
  g.fillRect(40, 210, 170, 15);// η φορμα του minion
  g.fillRect(70, 225, 110, 70);//το μικρο τετραγωνο της φορμα
  g.fillRect(40,295, 170, 100);//το κατω μερος της φορμας
  
    }}
   