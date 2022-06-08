package sample.layoutsjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.layoutsjavafx.layouts.*;

import java.io.IOException;

public class Main extends Application {
    private VBox v_box;
    private MenuBar menu_bar;
    private Menu layouts;
    private MenuItem
        border_pane_menu,
        flow_pane_menu,
        v_box_menu,
        grid_pane_menu,
        stack_pane_menu,
        tile_pane_menu,
        anchor_pane_menu;

    @Override
    public void start(Stage stage) throws IOException {
        menu_bar = new MenuBar();

        layouts = new Menu("Layouts");

        border_pane_menu = new MenuItem("BorderPane");
        border_pane_menu.setOnAction(actionEvent -> {
            new BorderPaneTest();
        });

        flow_pane_menu = new MenuItem("FlowPane");
        flow_pane_menu.setOnAction(actionEvent -> {
            new FlowPaneTest();
        });

        v_box_menu = new MenuItem("VBox");
        v_box_menu.setOnAction(actionEvent -> {
            new VBoxTest();
        });

        grid_pane_menu = new MenuItem("GridPane");
        grid_pane_menu.setOnAction(actionEvent -> {
            new GridPaneTest();
        });

        stack_pane_menu = new MenuItem("StackPane");
        stack_pane_menu.setOnAction(actionEvent -> {
            new StackPaneTest();
        });

        tile_pane_menu = new MenuItem("TilePane");
        tile_pane_menu.setOnAction(actionEvent -> {
            new TilePaneTest();
        });

        anchor_pane_menu = new MenuItem("AnchorPane");
        anchor_pane_menu.setOnAction(actionEvent -> {
            new AnchorPaneTest();
        });

        layouts.getItems().addAll(
            border_pane_menu,
            flow_pane_menu,
            v_box_menu,
            grid_pane_menu,
            stack_pane_menu,
            tile_pane_menu,
            anchor_pane_menu
        );

        menu_bar.getMenus().addAll(layouts);

        v_box = new VBox();
        v_box.getChildren().addAll(menu_bar);

        Scene scene = new Scene(v_box, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
