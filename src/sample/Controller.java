package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Controller extends Stage {
    public Controller(){
        Button button = new Button("HP");
        button.setTranslateX(15);
        button.setTranslateY(15);
        Pane root = new Pane();
        root.getChildren().add(button);

        this.setScene(new Scene(root,500,500));
        this.hide();
    }
}
