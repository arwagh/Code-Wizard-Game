/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation.Status;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.scene.media.MediaPlayer;
/**
 * FXML Controller class
 *
 * @author linahchan
 */

public class SplashScreenController implements Initializable {

    /**
     * Initializes the controller class.
     */
      @FXML 
              private AnchorPane ap;

    class ShowSplashScreen extends Thread{
        
        
     
     //    @Override
       // public void run(){
                  
      /*      
            try {
                
 
      
                Thread.sleep(5000);
                
                Platform.runLater(() -> {
                    Stage stage = new Stage();
                    Parent root = null;
                    try {
                        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
                                stage.initStyle(StageStyle.UNDECORATED);

                    } catch (IOException ex) {
                       // Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                     //  Thread.currentThread().interrupt();//preserve the message
                       
                        return;//Stop doing whatever I am doing and terminate
                    }
                    //Scene scene = new Scene(root);
                   // stage.setScene(scene);
                 //   stage.show();
                   // ap.getScene().getWindow().hide();
                   // this.setDaemon(false);
                    System.out.println(this.getState());
                   
                 //   if(this.getState()==State.TERMINATED){
                       
                   // }
                    ///stage.close();
                    //stage.getScene().getWindow().hide();
                });                
            } catch (InterruptedException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
        
    }
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      

                 
       

      //  new ShowSplashScreen().start();
         
                 
     
                
    }   
}