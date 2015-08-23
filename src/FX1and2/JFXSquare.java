package FX1and2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by carolchen on 16/08/2015.
 */
public class JFXSquare extends Application {
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Square");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
        javafx.scene.shape.Rectangle r = new javafx.scene.shape.Rectangle(100, 100, 100, 100);
        r.setFill(javafx.scene.paint.Color.RED);
        root.getChildren().add(r);
    }

}
