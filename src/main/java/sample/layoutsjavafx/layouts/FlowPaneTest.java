package sample.layoutsjavafx.layouts;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneTest extends Stage {

    private Scene scene;

    public FlowPaneTest() {
        createUI();
        this.setTitle("FlowPane");
        this.setScene(scene);
        this.show();
    }

    private void createUI() {
        FlowPane flow_pane = new FlowPane();

        flow_pane.getChildren().addAll(
                new Button("Boton 1"),
                new Button("Boton 2"),
                new Button("Boton 3")
        );

        scene = new Scene(flow_pane);
    }
}
