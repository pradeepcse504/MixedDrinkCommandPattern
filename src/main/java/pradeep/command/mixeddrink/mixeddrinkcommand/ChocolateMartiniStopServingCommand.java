
package pradeep.command.mixeddrink.mixeddrinkcommand;


public class ChocolateMartiniStopServingCommand implements Command{
    ChocolateMartini chocolateMartini;
    public ChocolateMartiniStopServingCommand( ChocolateMartini chocolateMartini){
        this.chocolateMartini = chocolateMartini;
    }
    public void execute(){
        chocolateMartini.stopServing();
    }
}
