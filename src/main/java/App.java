import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        var root = new StackPane();
        root.getChildren().add(new Button("Hello"));
        var scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
