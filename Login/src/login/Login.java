package login;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;


public class Login extends Application {
    
    public static Boolean mute = false;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SplashScreen.fxml"));      
        PauseTransition wait = new PauseTransition(Duration.seconds(5));
        stage.initStyle(StageStyle.UNDECORATED);        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        playAudioIntro();
        
     //     PauseTransition pause = new PauseTransition(Duration.seconds(30));
wait.setOnFinished(e -> {
    stage.hide();
    FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Login.fxml"));
            AnchorPane rootLogin = null;
            try {
                rootLogin = loader.load();
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            Scene sceneLogin = new Scene(rootLogin);
            LoginConstroller controller = loader.getController();
            /*
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Main menu.fxml"));
        Scene gameScene = new Scene(pane);*/
          

           stage.setScene(sceneLogin);
           stage.show();
        });
           wait.play();
             // stage.close();

            /*
        stage.initStyle(StageStyle.UNDECORATED);        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/
            
            
    }
    
    void playAudioIntro(){
       AudioClip a1 = new AudioClip(this.getClass().getResource("intro3.mp3").toString());
       a1.play();
    }

 
    public static void main(String[] args) {
        launch(args);
    }
    
}
