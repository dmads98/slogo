package Parser.Commands.Queries;

import Parser.Commands.TurtleCommand;

public class HeadingCommand extends TurtleCommand {

    public HeadingCommand(){
        isConstant = false;
        numParameters = 0;
    }

    public void execute(){
        returnValue = myTurtle.getMyAngle();

    }
}