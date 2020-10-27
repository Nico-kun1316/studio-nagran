import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Home {
    public TextField source;
    public TextField target;
    public Label label;

    @FXML
    public void initialize() {
        target.textProperty().bind(source.textProperty());
    }

    public void makeBlue(ActionEvent event) {
        label.getStyleClass().removeIf(className -> className.equals("red"));
        label.getStyleClass().add("blue");
    }
}
