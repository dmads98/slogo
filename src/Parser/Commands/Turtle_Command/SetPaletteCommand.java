package Parser.Commands.Turtle_Command;

import GraphicsBackend.Turtle;
import Main.BackendController;
import Parser.Commands.TurtleCommand;
import javafx.scene.paint.Color;

public class SetPaletteCommand extends TurtleCommand {

    public SetPaletteCommand(){
        isConstant = false;
        numParameters = 4;
    }

    @Override
    protected void performAction(BackendController backendController){

        int index = (int) getChildren().get(0).getReturnValue();
        int r = (int) getChildren().get(1).getReturnValue();
        int g = (int) getChildren().get(2).getReturnValue();
        int b = (int) getChildren().get(3).getReturnValue();
        backendController.setMyPalette(index, Color.rgb(r,g,b));
        returnValue = index;
        System.out.println(backendController.getColorPalette(index));
    }

    @Override
    protected void turtleAction(Turtle turtle) {
    }

}
