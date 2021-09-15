
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class BloodyMaryServeCommand implements Command{
    BloodyMary bloodyMary;
    public BloodyMaryServeCommand(BloodyMary bloodyMary){
        this.bloodyMary = bloodyMary;
    }
    public void execute(){
        bloodyMary.serve();
    }
}
