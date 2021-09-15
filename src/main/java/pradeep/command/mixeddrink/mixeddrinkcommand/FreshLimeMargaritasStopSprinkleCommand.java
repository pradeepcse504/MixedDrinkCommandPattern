
package pradeep.command.mixeddrink.mixeddrinkcommand;


public class FreshLimeMargaritasStopSprinkleCommand implements Command{
    FreshLimeMargaritas freshLimeMargaritas;
    public FreshLimeMargaritasStopSprinkleCommand( FreshLimeMargaritas freshLimeMargaritas){
        this.freshLimeMargaritas = freshLimeMargaritas;
    }
    public void execute(){
        freshLimeMargaritas.stopSprinkle();
    }
}
