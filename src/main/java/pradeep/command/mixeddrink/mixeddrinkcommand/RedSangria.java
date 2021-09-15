
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class RedSangria {
    String name;
    
    public RedSangria( String name ){
        this.name = name;
    }
    public void stir(){
        System.out.println(name + " stiring ");
    }
    public void stopStir(){
        System.out.println(name + " stopped stirring");
    }
    public void serve(){
        System.out.println("Serving " + name);
    }
    public void stopServing(){
        System.out.println("Serving " + name + " stopped");
    }
    
}
