
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class BloodyMaryStopShakeCommand implements Command{
    BloodyMary bloodyMary;
    
    public BloodyMaryStopShakeCommand(BloodyMary bloodyMary){
        this.bloodyMary = bloodyMary;
    }
    public void execute(){
        bloodyMary.stopShake();
    }
}
