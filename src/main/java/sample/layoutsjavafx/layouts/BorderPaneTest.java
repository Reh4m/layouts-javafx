package sample.layoutsjavafx.layouts;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneTest extends Stage {

    private Scene scene;

    public BorderPaneTest() {
        createUI();
        this.setTitle("BorderPane");
        this.setScene(scene);
        this.show();
    }

    private void createUI() {
        BorderPane border_pane = new BorderPane();

        border_pane.setTop(new Button("top"));
        border_pane.setBottom(new Button("bottom"));
        border_pane.setLeft(new Button("left"));
        border_pane.setRight(new Button("right"));
        border_pane.setCenter(new Button("center"));

        scene = new Scene(border_pane);
    }
}
