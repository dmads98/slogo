package GUI.Modules;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: need to get list of available variables from somewhere along the backend
 */

public class AvailableVars extends Module{
    private VBox container;
    private List<String> availableVars;
    private ListView<String> availableVarsDisplay;
    private ObservableList<String> availableVarsCollection;
    private int listviewWidth = 120;
    private int listviewHeight = 100;

    public AvailableVars(int width, int height) {
        super(width, height);
        availableVars = new ArrayList<>();
        availableVars.add("Hi");
        availableVars.add("Bye");
        //updateAvailableVars();
        setContent();
    }

    @Override
    protected void setLayout() {
    }

    @Override
    protected void setStyle(){
    }

    @Override
    protected void setContent() {
        content.setContent(container);
        if (availableVars != null) {
            availableVarsCollection = FXCollections.<String>observableArrayList(availableVars);
            availableVarsDisplay = new ListView<>(availableVarsCollection);
            availableVarsDisplay.setOrientation(Orientation.VERTICAL);
            availableVarsDisplay.setPrefSize(listviewWidth, listviewHeight);
        }
    }

    private void updateAvailableVars() {
        //availableVars = ___.getList
    }
}
