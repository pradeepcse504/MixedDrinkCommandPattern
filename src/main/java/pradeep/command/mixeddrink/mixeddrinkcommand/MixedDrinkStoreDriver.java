
package pradeep.command.mixeddrink.mixeddrinkcommand;

public class MixedDrinkStoreDriver {

    public static void main(String args[]) {
        MixedDrinkStore mixedDrinkStore = new MixedDrinkStore();
        
        BloodyMary bloodyMary = new BloodyMary("BloodyMary");
        ChocolateMartini chocolateMartini = new ChocolateMartini("Chocolate Martini");
        French75 french75 = new French75("French75");
        FreshLimeMargaritas freshLimeMargaritas = new FreshLimeMargaritas("Fresh Lime Margaritas");
        RedSangria redSangria = new RedSangria("RedSangria");
        
        BloodyMaryShakeCommand bloodyMaryShakeCommand = new BloodyMaryShakeCommand(bloodyMary);
        ChocolateMartiniStirCommand chocolateMartiniStirCommand = new ChocolateMartiniStirCommand(chocolateMartini);
        French75ShakeCommand french75ShakeCommand = new French75ShakeCommand(french75);
        FreshLimeMargaritasStirCommand freshLimeMargaritasStirCommand = new FreshLimeMargaritasStirCommand(freshLimeMargaritas);
        RedSangriaStirCommand redSangriaStirCommand = new RedSangriaStirCommand(redSangria);
        
        BloodyMaryStopShakeCommand bloodyMaryStopShakeCommand = new BloodyMaryStopShakeCommand(bloodyMary);
        ChocolateMartiniStopStirCommand chocolateMartiniStopStirCommand = new ChocolateMartiniStopStirCommand(chocolateMartini);
        French75StopShakeCommand french75StopShakeCommand = new French75StopShakeCommand(french75);
        FreshLimeMargaritasStopStirCommand freshLimeMargaritasStopStirCommand = new FreshLimeMargaritasStopStirCommand(freshLimeMargaritas);
        RedSangriaStopStirCommand redSangriaStopStirCommand = new RedSangriaStopStirCommand(redSangria);        
        
        Command[] prepare = { bloodyMaryShakeCommand, chocolateMartiniStirCommand, french75ShakeCommand, freshLimeMargaritasStirCommand, redSangriaStirCommand };
        Command[] stopPrepare = { bloodyMaryStopShakeCommand, chocolateMartiniStopStirCommand, french75StopShakeCommand, freshLimeMargaritasStopStirCommand, redSangriaStopStirCommand };
        
        MacroCommand prepareMacro = new MacroCommand(prepare);
        MacroCommand stopPrepareMacro = new MacroCommand(stopPrepare);
        
        mixedDrinkStore.setCommand(0, prepareMacro, stopPrepareMacro);
        
        System.out.println(mixedDrinkStore);
        System.out.println("----------------Processing Macro on -----------------");
        
        mixedDrinkStore.orderPlaced(0);
        System.out.println("----------------Unprocessing Macro off -------------");
        mixedDrinkStore.unPlaceOrder(0);
        
        
        BloodyMaryServeCommand bloodyMaryServeCommand = new BloodyMaryServeCommand(bloodyMary);
        ChocolateMartiniServeCommand chocolateMartiniServeCommand = new ChocolateMartiniServeCommand(chocolateMartini);
        French75ServeCommand french75ServeCommand = new French75ServeCommand(french75);
        FreshLimeMargaritasServeCommand freshLimeMargaritasServeCommand = new FreshLimeMargaritasServeCommand(freshLimeMargaritas);
        RedSangriaServeCommand redSangriaServeCommand = new RedSangriaServeCommand(redSangria);
        
        BloodyMaryStopServingCommand bloodyMaryStopServingCommand = new BloodyMaryStopServingCommand(bloodyMary);
        ChocolateMartiniStopServingCommand chocolateMartiniStopServingCommand = new ChocolateMartiniStopServingCommand(chocolateMartini);
        French75StopServingCommand french75StopServingCommand = new French75StopServingCommand(french75);
        FreshLimeMargaritasStopServingCommand freshLimeMargaritasStopServingCommand = new FreshLimeMargaritasStopServingCommand(freshLimeMargaritas);
        RedSangriaStopServingCommand redSangriaStopServingCommand = new RedSangriaStopServingCommand(redSangria);        
        
        Command[] serve = { bloodyMaryServeCommand, chocolateMartiniServeCommand, french75ServeCommand, freshLimeMargaritasServeCommand, redSangriaServeCommand };
        Command[] stopServing = { bloodyMaryStopServingCommand, chocolateMartiniStopServingCommand, french75StopServingCommand, freshLimeMargaritasStopServingCommand, redSangriaStopServingCommand };
        
        MacroCommand serveMacro = new MacroCommand(serve);
        MacroCommand stopServingMacro = new MacroCommand(stopServing);   

        mixedDrinkStore.setCommand(0, serveMacro, stopServingMacro);
        
        System.out.println(mixedDrinkStore);
        System.out.println("----------------Serving Macro on -----------------");
        
        mixedDrinkStore.orderPlaced(0);
        System.out.println("----------------Stop Serving Macro off -------------");
        mixedDrinkStore.unPlaceOrder(0);        
    }
}
