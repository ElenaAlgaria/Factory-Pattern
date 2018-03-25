package factory.design.pattern;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Elena
 */
public class MonsterFactory extends JFrame{
          private  ImageIcon image1;
    private JLabel label1;
     private ImageIcon image2;
    private JLabel label2;
    private ImageIcon image3;
    private JLabel label3;
          
    MonsterFactory(){          
      
    }
    
    
    public Monster makeMonster(String newMonsterType){
   
       
        
        if(newMonsterType.equalsIgnoreCase("cute")){
            setLayout(new FlowLayout());
            image1 = new ImageIcon(getClass().getResource("/factory/design/pattern/image/cute.jpg"));
        label1 = new JLabel(image1);
        add(label1);
      
                return new MonsterCute();
            
        }else if(newMonsterType.equalsIgnoreCase("ugly")){
            image2 = new ImageIcon(getClass().getResource("/factory/design/pattern/image/ugly.jpg"));
        label2 = new JLabel(image2);
        add(label2);
       
            return new MonsterUgly();
            
        }else if(newMonsterType.equalsIgnoreCase("bad")){
            image3 = new ImageIcon(getClass().getResource("/factory/design/pattern/image/bad.jpg"));
       label3 = new JLabel(image3);
        add(label3);
            return new MonsterBad();
            
        } else return null;
    }
       
}
