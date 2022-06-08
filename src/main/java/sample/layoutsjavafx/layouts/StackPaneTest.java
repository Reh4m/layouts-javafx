package sample.layoutsjavafx.layouts;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPaneTest extends Stage {
    private Scene scene;
    private StackPane stack_pane;
    private Button button_1, button_2, button_3;

    public StackPaneTest() {
        createUI();
        this.setTitle("StackPane");
        this.setScene(scene);
        this.show();
    }

    private void createUI() {
        stack_pane = new StackPane();

        button_1 = new Button("Boton 1");
        button_2 = new Button("Boton 2");
        button_3 = new Button("Boton 3");

        StackPane.setAlignment(button_1, Pos.CENTER);
        StackPane.setAlignment(button_2, Pos.BOTTOM_CENTER);
        StackPane.setAlignment(button_3, Pos.TOP_RIGHT);

        stack_pane.getChildren().addAll(button_1, button_2, button_3);

        scene = new Scene(stack_pane);
    }
}
