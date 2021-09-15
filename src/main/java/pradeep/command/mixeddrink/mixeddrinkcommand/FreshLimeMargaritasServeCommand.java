
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class FreshLimeMargaritasServeCommand implements Command {
    FreshLimeMargaritas freshLimeMargaritas;
    public FreshLimeMargaritasServeCommand( FreshLimeMargaritas freshLimeMargaritas ) {
        this.freshLimeMargaritas = freshLimeMargaritas;
    }
    public void execute(){
        freshLimeMargaritas.serve();
    }
}
