
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class FreshLimeMargaritasStirCommand implements Command{
    FreshLimeMargaritas freshLimeMargaritas;
    public FreshLimeMargaritasStirCommand( FreshLimeMargaritas freshLimeMargaritas ){
        this.freshLimeMargaritas = freshLimeMargaritas;
    }
    public void execute(){
        freshLimeMargaritas.stir();
    }
}
