package factory.design.pattern;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
/*
 *
 * @author Elena
 */
public class Main extends JFrame{
 
    /**
     * @param args the command line arguments
     * @throws
     */
    public static void main(String[] args) throws IOException  {
    
         Scanner input = new Scanner(System.in);    
       
        String user ;
      String pass ;
           
        System.out.println("Only logged users can create a monster! ");
       
      do{
        System.out.println("\nEnter your username (user): ");
        
        user = input.nextLine();
        
        System.out.println("Enter your password (123): ");
        pass = input.nextLine();
       
       
        
        if (user.equals("user") && pass.equals("123")) {
            System.out.println("You are logged in. Have fun!");
          
            break;
            
             
            }else{ 
            System.out.println("Wrong login!");
            
        }
       } while(!"user".equals(user) && !"123".equals(pass));
       
       
             MonsterFactory monster = new MonsterFactory();
         
    
  Monster m = null;
   MonsterFactory gui = new MonsterFactory();
  String word = "cute / ugly / bad";
  Scanner userInput = new Scanner(System.in);
        System.out.println("");
  
        while ("cute / ugly / bad".equals(word)){
            
     System.out.print("\nWhat type monster is it? (cute / ugly / bad) " );
  
   
     
        if (userInput.hasNextLine()) {
        
           
        String typeOfMonster = userInput.nextLine();
           
                            
        m = monster.makeMonster(typeOfMonster);
         gui.makeMonster(typeOfMonster);
             
             }
        
        if(m != null){
            
            monster(m);
           
       System.out.println("\nTo see your monster press enter!");  
            
              System.in.read();
        System.out.println("One moment please!");
           
                    
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setAlwaysOnTop(true);
            
       break;
       
       
        }
       
        }        
        
       
 
    }
 
  
    public static void monster(Monster monster){
        
        monster.produceMonster();
       
        
    }  
  
    
    }
