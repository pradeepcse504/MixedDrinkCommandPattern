
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class FreshLimeMargaritas {
    String name;
    public FreshLimeMargaritas(String name){
        this.name = name;
    }
    public void stir(){
        System.out.println("Stirring " + name);
    }
    public void stopStir(){
        System.out.println( name + " stiring stopped");
    }
    public void sprinkle(){
        System.out.println("Sprinkling " + name);
    }
    public void stopSprinkle(){
        System.out.println("Sprinkling stopped " + name);
    }
    public void serve(){
        System.out.println("Serving " + name);
    }
    public void stopServing(){
        System.out.println("Serving " + name + " stopped");
    }
}
