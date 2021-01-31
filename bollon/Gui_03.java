import javax.swing.*;
import java.awt.*;

class myPanel_03 extends JPanel {

    @Override
    public void setBackground(Color bg) {
        super.setBackground(Color.lightGray);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int i,x,y,width=600,cn;
        Color co;
        g.drawRect(0,0,width,width);
        for (i=0;i<200;i++){
            x = (int)(width*Math.random());
            y = (int)(width*Math.random());
            cn = (int) (10*Math.random()+1);
            switch (cn){
                case 1: co=new Color(0,0,255);break;
                case 2: co=new Color(0,255,0);break;
                case 3: co=new Color(0,255,255);break;
                case 4: co=new Color(255,0,0);break;
                case 5: co=new Color(255,0,255);break;
                case 6: co=new Color(255,255,0);break;
                case 7: co=new Color(255,255,255);break;
                case 8: co=new Color(255,102,255);break;
                case 9: co=new Color(153,102,0);break;
                case 10: co=new Color(255,102,0);break;
                default: co=new Color(0,0,0);
            }
            g.setColor(co);
            g.fillOval(x,y,50,50);
        }
    }
}
public class Gui_03 extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Gui_03");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);
        Container contentPane = f.getContentPane();
        myPanel_03 p = new myPanel_03();
        contentPane.add(p);

        f.setVisible(true);
    }
}
