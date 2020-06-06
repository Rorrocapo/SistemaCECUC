package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginController implements Initializable {

    @FXML
    private Label comprobar;

    @FXML
    private void loginButtonAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/Principal.fxml"));
        Stage principalWindow = new Stage();
        //principalWindow.initStyle(StageStyle.UNDECORATED);
        Scene scene =  new Scene(root);
        principalWindow.setScene(scene);
        //principalWindow.setMaximized(true);
        principalWindow.show();
    }

    @FXML
    private void registerButtonAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/SignUp.fxml"));
        Stage signUpWindow = new Stage();
        signUpWindow.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(root);

        signUpWindow.setScene(scene);
        signUpWindow.show();
    }

    @FXML
    private void closeButtonAction(ActionEvent event) throws IOException{
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.close();
        System.exit(0);
    }

    @FXML
    private void minimizeButtonAction(ActionEvent event) throws IOException{
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}