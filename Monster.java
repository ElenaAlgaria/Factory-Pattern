package factory.design.pattern;



/**
 *
 * @author Elena
 */
public abstract class Monster {
    
   private String name;
 
   
   
   public String getName(){
       return name;
   }
   
   public void setName(String newName){
       this.name = newName;
   }

    
    public void produceMonster(){
        System.out.println(getName() + " is currently being produced");
    }   
    
}
