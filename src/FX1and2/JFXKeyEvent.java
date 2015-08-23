package FX1and2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by carolchen on 16/08/2015.
 */
public class JFXKeyEvent extends Application {
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Key Event");
        // Group root = new Group();
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        Text hi = new Text("Type Something!");
        hi.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
        hi.setFill(Color.RED);
        hi.setOpacity(1.0);
        root.getChildren().add(hi);
        scene.setOnKeyTyped(event -> {
            String a = "";
            if (event.getCharacter().equals("Q")) {
                System.out.println("OK, I am done");
                Platform.exit();
            } else {
                a += event.getCharacter();
                System.out.println("You typed a " + a);
            }
        });

        primaryStage.show();




    }

}
