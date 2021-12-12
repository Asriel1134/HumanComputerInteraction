package com.HCInteraction.javaFX;

import com.HCInteraction.javaFX.Controller.IndexController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author Asriel
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Index.fxml"));
        Parent root = loader.load();
        IndexController controller = loader.getController();
        stage.setTitle("MailRetrieval");
        stage.getIcons().add(new Image("/icon/logoMini.png"));
        stage.setResizable(false);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(new Scene(root));
        stage.getScene().setFill(null);
//        controller.init();
        stage.show();
    }
}
