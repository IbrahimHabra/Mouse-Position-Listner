package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Group;

import javax.swing.event.MenuEvent;
import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        Controller c = new Controller();
        Button button = new Button("HI");
        button.setTranslateX(50);
        button.setTranslateY(50);
        button.setOnAction((ActionEvent e) -> {
            c.show();
        });
        Group root = new Group();
        root.getChildren().add(button);
        Scene scene = new Scene(root,500,500);
        scene.setFill(Color.SILVER);

        primaryStage.setScene(scene);
        primaryStage.show();



    scene.setOnMouseMoved((MouseDragEvent) -> {

       System.out.println(/*System.getProperty("user.name")*/MouseInfo.getPointerInfo().getLocation().x + " " + MouseInfo.getPointerInfo().getLocation().y);
    });
    }


    public static void main(String[] args) {
        launch(args);
    }
}
