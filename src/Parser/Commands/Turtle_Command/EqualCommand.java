package Parser.Commands.Turtle_Command;


import Parser.BackendController;
import Parser.Commands.Command;

/**
 * @author kunalupadya
 */
public class EqualCommand extends BooleanCommand{

    public EqualCommand(){
        setNumParameters(2);
    }

    public void performAction(BackendController backendController){
        setReturnValue(returnValue(getChildren().get(0).getReturnValue() ==  getChildren().get(1).getReturnValue()));
    }

    @Override
    public Command copy() {
        return new EqualCommand();
    }
}
