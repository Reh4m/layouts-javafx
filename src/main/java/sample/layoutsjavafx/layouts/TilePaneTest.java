package sample.layoutsjavafx.layouts;

import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneTest extends Stage {
    private Scene scene;
    private TilePane tile_pane;

    public TilePaneTest() {
        createUI();
        this.setTitle("TilePane");
        this.setScene(scene);
        this.show();
    }

    private void createUI() {
        tile_pane = new TilePane(Orientation.VERTICAL);

        tile_pane.setPrefColumns(6);
        tile_pane.setPrefRows(4);

        for(int i = 0; i < 20; i++) {
            tile_pane.getChildren().add(new Button("Boton "+ i));
        }

        scene = new Scene(tile_pane);
    }
}
