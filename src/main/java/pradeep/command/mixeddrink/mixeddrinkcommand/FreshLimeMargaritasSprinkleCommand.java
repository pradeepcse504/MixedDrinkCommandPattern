
package pradeep.command.mixeddrink.mixeddrinkcommand;


public class FreshLimeMargaritasSprinkleCommand implements Command{
    FreshLimeMargaritas freshLimeMargaritas;
    public FreshLimeMargaritasSprinkleCommand( FreshLimeMargaritas freshLimeMargaritas ){
        this.freshLimeMargaritas = freshLimeMargaritas;
    }
    public void execute(){
        freshLimeMargaritas.sprinkle();
    }
}
