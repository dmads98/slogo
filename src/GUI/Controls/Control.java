package GUI.Controls;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;

/**
 * Abstract superclass to serve as template for all buttons/controls
 *
 * @author Januario Carreiro
 */
public abstract class Control {
    private Button button;

    public Control(Image image) {
        this.button = new Button();

        ImageView img = new ImageView(image);
        img.setFitHeight(20.0);
        img.setFitWidth(20.0);
        this.button.setGraphic(img);

        this.button.setOnMouseClicked(mouseEvent -> action());
    }

    protected abstract void action();

    /**
     * Getter method for the button associated with this class
     * @return Button contained by this class
     */
    public Button getButton() {
        return button;
    }
}

