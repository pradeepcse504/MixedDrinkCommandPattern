
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class FreshLimeMargaritasStopStirCommand implements Command{
    FreshLimeMargaritas freshLimeMargaritas;
    public FreshLimeMargaritasStopStirCommand( FreshLimeMargaritas freshLimeMargaritas ){
        this.freshLimeMargaritas = freshLimeMargaritas;
    }
    public void execute(){
        freshLimeMargaritas.stopStir();
    }
}
