
package login;

import com.jfoenix.controls.JFXToggleButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Font;


public class SettingsController implements Initializable {

    @FXML
    private Font x1;
    @FXML
    private JFXToggleButton toggleBtn;

    @FXML
    private void isMute(ActionEvent event)  { Login.mute = true; }
        
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
