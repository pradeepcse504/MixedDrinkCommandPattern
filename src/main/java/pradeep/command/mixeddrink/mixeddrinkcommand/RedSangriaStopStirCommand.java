
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class RedSangriaStopStirCommand implements Command{
    RedSangria redSangria;
    public RedSangriaStopStirCommand( RedSangria redSangria ){
        this.redSangria = redSangria;
    }
    public void execute(){
        this.redSangria.stir();
    }
}