package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Model.Database;
import javafx.stage.StageStyle;

public class Main extends Application {

    Database connection;
    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
        connection=new Database();
        window=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("/View/Login.fxml"));

        Scene scene = new Scene(root);

        primaryStage.initStyle(StageStyle.UNDECORATED);


        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
