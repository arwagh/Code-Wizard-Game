/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;

/**
 *
 * @author Arwa
 */
public class AlertExitGame extends Alert {

    public AlertExitGame(AlertType alertType) {
        super(alertType);
        this.setContentText("Are you sure you want to exit game?\nYour process will be lost!");
        ButtonType okButton = new ButtonType("Yes", ButtonBar.ButtonData.YES);
        ButtonType cancelButton = new ButtonType("Cancel", ButtonBar.ButtonData.NO);
        this.getButtonTypes().setAll(okButton, cancelButton);
        DialogPane dialogPane = this.getDialogPane();
        dialogPane.getStylesheets().add(
        getClass().getResource("myDialogs.css").toExternalForm());
        dialogPane.getStyleClass().add("myDialog");
    }
    
 
}
