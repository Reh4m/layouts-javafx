package sample.layoutsjavafx.layouts;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneTest extends Stage {
    private Scene scene;
    private GridPane grid_pane;

    public GridPaneTest() {
        createUI();
        this.setTitle("GridPane");
        this.setScene(scene);
        this.show();
    }

    private void createUI() {
        grid_pane = new GridPane();

        grid_pane.setVgap(10);
        grid_pane.setHgap(10);
        grid_pane.add(new Button("Posicion 0, 0"), 0, 0);
        grid_pane.add(new Button("Posicion 1, 0"), 1, 0 );
        grid_pane.add(new Button("Posicion 0, 1"), 0, 1);
        grid_pane.add(new Button("Posicion 1, 1"), 1, 1);
        grid_pane.add(new Button("Posicion 0, 2"), 0, 2);
        grid_pane.add(new Button("Posicion 1, 2"), 1, 2);

        grid_pane.add(new Button("Posicion Col 9 Fila 2"), 9, 2);

        scene = new Scene(grid_pane);
    }
}
