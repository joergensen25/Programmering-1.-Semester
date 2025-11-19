package ekstraPRO.lektion6.eksamensopgave2023.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Jan2023Gui extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Handelsplatform");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfKøber = new TextField();
    // TODO

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        // column 0
        pane.add(new Label("Aktive annoncer"), 0, 0);
        // TODO

        // column 1
        pane.add(new Label("Varer"), 1, 0);
        // TODO

        // column 2
        pane.add(new Label("Køber"), 2, 1);
        // TODO

        //column 3
        pane.add(txfKøber, 3, 1);
        // TODO

    }
}
