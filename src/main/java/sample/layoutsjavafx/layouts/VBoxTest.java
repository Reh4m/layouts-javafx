package sample.layoutsjavafx.layouts;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxTest extends Stage {

    private Scene scene;

    public VBoxTest() {
        createUI();
        this.setTitle("VBox");
        this.setScene(scene);
        this.show();
    }

    private void createUI() {
        VBox vertical_box;

        vertical_box = new VBox(10);
        vertical_box.setPadding(new Insets(15));
        vertical_box.getChildren().addAll(
                new Button("Boton 1"),
                new Button("Boton 2"),
                new Button("Boton 3")
        );

        scene = new Scene(vertical_box);
    }
//        // Layout de tipo VBox.
//        VBox vertical_box = new VBox(10);
//
//        // Nodos hijo de tipo Button.
//        vertical_box.getChildren().add(new Button("Boton 1."));
//        vertical_box.getChildren().add(new Button("Boton 2."));
//        vertical_box.getChildren().add(new Button("Boton 3."));
//
//        // Escena o ventana principal, recibe como parámetros el layout y las dimensiones de la ventana (opcional).
//        Scene scene = new Scene(vertical_box);
//        // Título de la ventana.
//        stage.setTitle("Layouts");
//        // Layout establecido en la ventana.
//        stage.setScene(scene);
//        stage.show();
//
//        BorderPaneTest border_pane = new BorderPaneTest();
}
