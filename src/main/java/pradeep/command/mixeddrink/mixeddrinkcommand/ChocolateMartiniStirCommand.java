
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class ChocolateMartiniStirCommand implements Command{
    ChocolateMartini chocolateMartini;
    public ChocolateMartiniStirCommand(ChocolateMartini chocolateMartini){
        this.chocolateMartini = chocolateMartini;
    }
    public void execute(){
        chocolateMartini.stir();
    }
}
