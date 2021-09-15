
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class ChocolateMartini {
    String name;
    public ChocolateMartini( String name){
        this.name = name;
    }
    public void stir(){
        System.out.println("Stirring " + name);
    }
    public void stopStir(){
        System.out.println( name + " stirring stopped");
    }
    public void serve(){
        System.out.println("Serving " + name);
    }
    public void stopServing(){
        System.out.println("Serving " + name + " stopped");
    }    
}
