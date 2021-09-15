
package pradeep.command.mixeddrink.mixeddrinkcommand;


public class French75ShakeCommand implements Command{
    French75 french75;
    public French75ShakeCommand( French75 french75 ){
        this.french75 = french75;
    }
    public void execute(){
        french75.shake();
    }
}
