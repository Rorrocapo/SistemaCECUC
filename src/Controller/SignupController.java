package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;
import Model.SignUp;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SignupController implements Initializable{
    Stage stage;
    private String user,psswd,psswdCon;

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password,passConfirm;

    @FXML
    private void backButtonActtion(ActionEvent event) throws IOException{
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    private void signUpButtonAction(ActionEvent event){
        user=username.getText().toString();
        psswd=password.getText().toString();
        psswdCon=passConfirm.getText().toString();

        if(user.isEmpty()||psswd.isEmpty()||psswdCon.isEmpty()){
            JOptionPane.showMessageDialog(null, "No puede dejar ningun campo vacio");
        }else if(psswd.equals(psswdCon)){
            new SignUp(user, psswd);
        }else JOptionPane.showMessageDialog(null, "Contraseñas no coinciden");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
