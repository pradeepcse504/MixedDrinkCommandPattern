
package pradeep.command.mixeddrink.mixeddrinkcommand;


public class BloodyMaryStopServingCommand implements Command{
    BloodyMary bloodyMary;
    public BloodyMaryStopServingCommand(BloodyMary bloodyMary){
        this.bloodyMary = bloodyMary;
    }
    public void execute(){
        bloodyMary.stopServing();
    }
}
