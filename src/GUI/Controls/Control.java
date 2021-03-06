package GUI.Controls;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.EventHandler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Abstract superclass for all controls. This class is extended by ButtonControl and MenuButtonControl to work for
 * buttons and menu buttons.
 */
public abstract class Control {
    ImageView myImage;

    /**
     * Sets graphic for button.
     *
     * @param image graphic for button.
     */
    public Control(Image image) {
        myImage = new ImageView(image);
        myImage.setFitHeight(20.0);
        myImage.setFitWidth(20.0);
    }

    /**
     * Abstract EventHandler method to be flushed out in subclasses. There is no set EventHandler type because MenuButtton
     * and Button use different kinds of events. Lambdas are recommended.
     *
     * Example:
     * return event -> context.certainAction(parameter);
     *
     * @return an EventHandler for when button is clicked.
     */
    abstract EventHandler<?> action();

    /**
     * Setter method to change the myImage displayed on the myButton. In order for myImage to be compatible with the style
     * of the preset images, it should be a .png with a transparent background.
     *
     * @param file myImage file to replace myButton myImage
     */
    public void setImage(File file, ButtonBase button) {
        try {
            myImage = new ImageView(new Image(new FileInputStream(file.getPath())));
            myImage.setFitHeight(20.0);
            myImage.setFitWidth(20.0);
            button.setGraphic(myImage);
        } catch (FileNotFoundException e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "File not found.", ButtonType.OK);
            alert.showAndWait();
        }
    }
}
