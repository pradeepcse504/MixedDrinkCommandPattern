
package pradeep.command.mixeddrink.mixeddrinkcommand;


public class MixedDrinkStore {
    Command[] serveCommands;
    Command[] stopServingCommands;
    
    public MixedDrinkStore(){
        serveCommands = new Command[7];
        stopServingCommands = new Command[7];
        
        Command noCommand = new NoCommand();
        
        for(int i = 0; i< 7; i++){
            serveCommands[i] = noCommand;
            stopServingCommands[i] = noCommand;
        }
    }
    public void setCommand(int slot, Command serveCommand, Command stopServingCommand ){
        serveCommands[slot] = serveCommand;
        stopServingCommands[slot] = stopServingCommand;
    }
    public void orderPlaced( int slot ) {
        serveCommands[slot].execute();
        
    }
    public void unPlaceOrder( int slot ) {
        stopServingCommands[slot].execute();
    }
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        
        stringBuffer.append("\n ------ Donald Store---------\n");
        for( int i = 0; i < serveCommands.length; i++){
            stringBuffer.append("[slot "+i + "]" + serveCommands[i].getClass().getName() + "    " + stopServingCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
