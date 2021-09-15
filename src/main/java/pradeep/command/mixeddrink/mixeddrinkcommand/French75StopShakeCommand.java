
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class French75StopShakeCommand implements Command{
    French75 french75;
    public French75StopShakeCommand( French75 french75 ){
        this.french75 = french75;
    }
    public void execute() {
        french75.stopShake();
    }
}
