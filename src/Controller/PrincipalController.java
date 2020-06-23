package Controller;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class PrincipalController implements Initializable {

    @FXML
    private Label user;

    @FXML
    private JFXHamburger hb;

    @FXML
    private JFXDrawer drwr;

    @FXML
    private TabPane tabPane;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Dentro del Try Catch creamos el evento para la HAmbuerguer para que pueda mostrar y ocultar el Drawer
        try {
            VBox box = FXMLLoader.load(getClass().getResource("/View/DrawerContent.fxml"));
            drwr.setSidePane(box);

            HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(hb);
            transition.setRate(-1);
            drwr.setDisable(true);
            drwr.setResizeContent(false);
            hb.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
                transition.setRate(transition.getRate() * -1);
                transition.play();

                if (drwr.isOpened()) {
                    drwr.close();
                } else {
                    drwr.open();
                }
            });
        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Aqui termina el evento
    }

    @FXML
    private void onActionUserBtn(ActionEvent event){
        tabPane.getSelectionModel().select(0);//Selecciona los paneles por cada accion de los botones laterales
    }

    @FXML
    private void onActionTableBtn(ActionEvent event){
        tabPane.getSelectionModel().select(1);//Selecciona los paneles por cada accion de los botones laterales
    }

    @FXML
    private void onActionInsertBtn(ActionEvent event){
        tabPane.getSelectionModel().select(2);//Selecciona los paneles por cada accion de los botones laterales
    }


}
