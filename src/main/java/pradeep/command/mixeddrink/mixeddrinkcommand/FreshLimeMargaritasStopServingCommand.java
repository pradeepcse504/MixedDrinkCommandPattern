
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class FreshLimeMargaritasStopServingCommand implements Command{
    FreshLimeMargaritas freshLimeMargaritas;
                
    public FreshLimeMargaritasStopServingCommand( FreshLimeMargaritas freshLimeMargaritas ) {
        this.freshLimeMargaritas = freshLimeMargaritas;
    }
    public void execute(){
        freshLimeMargaritas.stopServing();
    }
}
