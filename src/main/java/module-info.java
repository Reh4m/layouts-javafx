module sample.layoutsjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.layoutsjavafx to javafx.fxml;
    exports sample.layoutsjavafx;
}
