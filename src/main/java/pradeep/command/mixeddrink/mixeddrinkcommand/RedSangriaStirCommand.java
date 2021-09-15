
package pradeep.command.mixeddrink.mixeddrinkcommand;


public class RedSangriaStirCommand implements Command{
    RedSangria redSangria;
    public RedSangriaStirCommand( RedSangria redSangria ){
        this.redSangria = redSangria;
    }
    public void execute(){
        this.redSangria.stir();
    }
}
