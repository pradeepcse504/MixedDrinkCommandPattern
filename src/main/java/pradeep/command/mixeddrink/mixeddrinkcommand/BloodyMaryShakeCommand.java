
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class BloodyMaryShakeCommand implements Command{
    BloodyMary bloodyMary;
    
    public BloodyMaryShakeCommand(BloodyMary bloodyMary){
        this.bloodyMary = bloodyMary;
    }
    public void execute(){
        bloodyMary.shake();
    }
    
}
