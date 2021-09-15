
package pradeep.command.mixeddrink.mixeddrinkcommand;


public class ChocolateMartiniStopStirCommand implements Command{
    ChocolateMartini chocolateMartini;
    public ChocolateMartiniStopStirCommand(ChocolateMartini chocolateMartini){
        this.chocolateMartini = chocolateMartini;
    }
    public void execute(){
        chocolateMartini.stopStir();
    }
}
