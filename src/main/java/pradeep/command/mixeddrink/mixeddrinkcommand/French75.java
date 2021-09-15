
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class French75 {
    String name;
    
    public French75(String name){
        this.name = name;
    }
    public void shake(){
        System.out.println( "Shaking " + name);
    }
    public void stopShake(){
        System.out.println( name + " shaking stopped");
    }
    public void serve(){
        System.out.println("Serving " + name);
    }
    public void stopServing(){
        System.out.println("Serving " + name + " stopped");
    }    
}
