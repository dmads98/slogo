package GUI.Modules;

import GUI.FrontendController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * TODO: get available variables text from a resource file, not hardcoded
 */

public class AvailableVars extends CommandsAndVars{
    private VBox container;

    public AvailableVars(int width, int height, FrontendController myFrontendController) {
        super(width, height, "Available Variables", myFrontendController);
        setClick();
    }

    @Override
    public void setClick() {
        listDisplay.setCellFactory(lv -> {
            ListCell<String> cell = new ListCell<String>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    setText(item);
                }
            };
            cell.setOnMouseClicked(e -> {
                if (!cell.isEmpty()) {
                    context.addToConsole(":" + cell.getItem());
                }
            });
            return cell;
        });
    }

    @Override
    public void setPlaceholder() {
        listDisplay.setPlaceholder(new Label("Available Variables"));
    }
}
