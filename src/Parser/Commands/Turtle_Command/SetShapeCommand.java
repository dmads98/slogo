package Parser.Commands.Turtle_Command;

import GraphicsBackend.Turtle;
import Parser.Commands.Command;
import Parser.Commands.TurtleCommand;

public class SetShapeCommand extends TurtleCommand {

    public SetShapeCommand(){
        setIsEvaluated(false);
        setNumParameters(1);
    }

    @Override
    protected void turtleAction(Turtle turtle){
       turtle.setMyShape((int)getChildren().get(0).getReturnValue());
    }

    @Override
    public Command copy() {
        return new SetShapeCommand();
    }
}
