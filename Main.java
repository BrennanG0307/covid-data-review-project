import javax.swing.*;
import java.awt.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
  
  
  //String data = importer.importFile("covid19dataexport.txt");
  //importer.dataSplitter(data);
    JFrame frame = new JFrame("My Drawing");
    Canvas canvas = new testGraphics();
    canvas.setSize(400, 400);
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);
  }
  public void paint(Graphics g) {
    g.setColor(Color.red);
    g.fillOval(100, 100, 200, 200);
    g.drawRect(100,100,100,100);
  }

}