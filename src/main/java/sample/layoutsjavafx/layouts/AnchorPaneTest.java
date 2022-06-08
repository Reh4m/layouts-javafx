package sample.layoutsjavafx.layouts;

import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class AnchorPaneTest extends Stage {
    private Scene scene;
    private AnchorPane anchor_pane;

    public AnchorPaneTest() {
        createUI();
        this.setTitle("AnchorPane");
        this.setScene(scene);
        this.show();
    }

    private void createUI() {
        anchor_pane  = new AnchorPane();

        Button button_2  = new Button("Boton 2");
        Button button_3 = new Button("Boton 3");
        AnchorPane.setTopAnchor(button_2, 10.0);
        AnchorPane.setRightAnchor(button_2, 10.0);

        AnchorPane.setBottomAnchor(button_3, 20.0);
        AnchorPane.setLeftAnchor(button_3, 20.0);

        anchor_pane.getChildren().addAll(new Button("Boton 1"), button_2, button_3);

        scene = new Scene(anchor_pane);
    }
}
