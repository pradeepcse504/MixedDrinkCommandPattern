
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class BloodyMary {
    String name;
    
    public BloodyMary(String name){
        this.name = name;
    }
    public void shake(){
        System.out.println("Shaking " + name);
    }
    public void stopShake(){
        System.out.println("Shaking " + name + " stopped");
    }
    public void serve(){
        System.out.println("Serving " + name);
    }
    public void stopServing(){
        System.out.println("Serving " + name + " stopped");
    }    
}
