
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class ChocolateMartiniServeCommand implements Command{
    ChocolateMartini chocolateMartini;
    public ChocolateMartiniServeCommand(ChocolateMartini chocolateMartini){
        this.chocolateMartini = chocolateMartini;
        
    }
    public void execute(){
        chocolateMartini.serve();
    }
}
