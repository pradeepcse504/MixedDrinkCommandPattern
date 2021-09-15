
package pradeep.command.mixeddrink.mixeddrinkcommand;


public class RedSangriaStopServingCommand implements Command{
    RedSangria redSangria;
    public RedSangriaStopServingCommand( RedSangria redSangria ){
        this.redSangria = redSangria;
    }
    public void execute(){
        this.redSangria.stopServing();
    }    
}
