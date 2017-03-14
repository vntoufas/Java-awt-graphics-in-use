
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Start extends JFrame {
    
JComboBox CMB1 = new JComboBox();
   
    
    
    public static void main(String[] args) {
        int choice;
        String GreenString="green";
        String RedString="red";
        String color;
         JFrame frame = new JFrame();
        String[] options={"Draw minion" , "Draw polygons"};
        //String[] ColorPallet={"green","red"};
        //String[] AnglesNumber={"3","4","5","6"};
        choice=JOptionPane.showOptionDialog(null,"Make your choice","Simple drawings application",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);

              if (choice==0){          
        JFrame window = new JFrame();//δημιουργία νεου JFrame
        DrawMinion minion=new DrawMinion();
        window.setSize(300, 500);//ορισμός διαστασεων παραθύρου minion 
        window.setTitle("Draw This Minion !");//τιτλος παραθυρου
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//default λειτουργια Χ κουμπιου παραθυρου        
        window.add(minion);
        window.setVisible(true); 
        }     
     else if (choice==1){
         JFrame window = new JFrame();//φτιαχνω νεο frame
         int x;
         do {String angles=JOptionPane.showInputDialog("Enter how many corners :");// ζηταω αριθμο γωνιων
         x=Integer.parseInt(angles);//μετατρεπω το string σε int
         }while ((x>7)||(x<3));//ελεγχος για τιμες απο 3 μεχρι 6
         DrawPolygon polygon=new DrawPolygon();//δημιουργω instance της κλασσης DrawPolygon
         polygon.set_angles(x);//στελνω στην κλασση τον αριθμο των γωνιων του πολυγωνου
         do{color=JOptionPane.showInputDialog("Enter color (red,green) :");//ζηταω χρωμα πλυγωνου
           }while(!(color.equalsIgnoreCase(GreenString))&&(!(color.equalsIgnoreCase(RedString))));//ελεγχος για red ή green χρωμα ΜΟΝΟ
         polygon.set_color(color);//στελνω στην DrawPolygon το χρωμα του πολυγωνου
         
         window.setSize(300, 500);//οριζω διαστασεις παραθυρου
         window.setTitle("Draw This Polygon !");//οριζω τιτλο παραθυρου
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//default λειτουργια Χ κουμπιου παραθυρου        
         window.add(polygon);//προσθετο στο παραθυρο μου το αποτελεσμα της DrawPolygon
         window.setVisible(true); //θετω visible το παραθυρο μου .
              }         
    }
}
