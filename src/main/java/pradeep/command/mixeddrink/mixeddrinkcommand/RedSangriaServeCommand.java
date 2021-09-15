
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class RedSangriaServeCommand implements Command{
    RedSangria redSangria;
    public RedSangriaServeCommand( RedSangria redSangria ){
        this.redSangria = redSangria;
    }
    public void execute(){
        this.redSangria.serve();
    }    
}
