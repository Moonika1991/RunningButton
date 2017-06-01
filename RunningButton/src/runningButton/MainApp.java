package runningButton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Running Button");
        this.primaryStage.setMinHeight(200);
        this.primaryStage.setMinWidth(200);
        this.primaryStage.initStyle(StageStyle.UNDECORATED);

        showWindow();
    }

    public void showWindow(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/Window.fxml"));
            AnchorPane window = (AnchorPane) loader.load();

            Scene scene = new Scene(window);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main (String[] args){
        launch(args);
    }
}