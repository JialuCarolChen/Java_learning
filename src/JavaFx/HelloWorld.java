package JavaFx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;


/**
 * Created by carolchen on 27/08/2015.
 */
public class HelloWorld extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        //set stage
        primaryStage.setTitle("Hello World!");
        //set scene
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        //set things in scene
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Text hi = new Text("Hello World");
                hi.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
                hi.setFill(Color.RED);
                hi.setOpacity(1.0);
                root.getChildren().add(hi);
                btn.setOpacity(0);
            }
        });
        root.getChildren().add(btn);
        primaryStage.show();



    }




}
