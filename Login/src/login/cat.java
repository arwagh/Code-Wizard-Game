/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.IOException;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author noodm
 */
public class cat extends Application {
    final static javafx.scene.image.Image p1=new javafx.scene.image.Image(cat.class.getResource("/images/1.png").toString());
    final static javafx.scene.image.Image p2=new javafx.scene.image.Image(cat.class.getResource("/images/2.png").toString());       
    final static javafx.scene.image.Image p3=new javafx.scene.image.Image(cat.class.getResource("/images/3.png").toString());
    final static javafx.scene.image.Image p4=new javafx.scene.image.Image(cat.class.getResource("/images/4.png").toString());
    final static javafx.scene.image.Image p5=new javafx.scene.image.Image(cat.class.getResource("/images/5.png").toString());
    final static javafx.scene.image.Image p6=new javafx.scene.image.Image(cat.class.getResource("/images/6.png").toString());
    final static javafx.scene.image.Image p7=new javafx.scene.image.Image(cat.class.getResource("/images/7.png").toString());
    
    private Group move;

    @Override
    public void start(Stage primaryStage) throws IOException {
        //Animation walking
     //1- add images to Image view:
     final ImageView move1=new ImageView(p1);
     final ImageView move2=new ImageView(p2);
     final ImageView move3=new ImageView(p3);
     final ImageView move4=new ImageView(p4);
     final ImageView move5=new ImageView(p5);
     final ImageView move6=new ImageView(p6);
     final ImageView move7=new ImageView(p7);
     //Object of image:
     move=new Group(move1);
     //place  
     move.setTranslateX(200);
     move.setTranslateY(220);
     //Anime in loop:
     Timeline time=new Timeline();
     time.setCycleCount(Timeline.INDEFINITE);
     // Add image to the group:
     time.getKeyFrames().add(new KeyFrame(
             Duration.millis(200),
             (ActionEvent e)->{
                 move.getChildren().setAll(move2);
        
    }
     ));
     time.getKeyFrames().add(new KeyFrame(
             Duration.millis(300),
             (ActionEvent e)->{
                 move.getChildren().setAll(move3);
        
    }
     ));
     time.getKeyFrames().add(new KeyFrame(
             Duration.millis(400),
             (ActionEvent e)->{
                 move.getChildren().setAll(move4);
        
    }
     ));
     
     time.getKeyFrames().add(new KeyFrame(
             Duration.millis(500),
             (ActionEvent e)->{
                 move.getChildren().setAll(move5);
        
    }
     ));
     time.getKeyFrames().add(new KeyFrame(
             Duration.millis(600),
             (ActionEvent e)->{
                 move.getChildren().setAll(move6);
        
    }
     ));
     
     time.getKeyFrames().add(new KeyFrame(
             Duration.millis(700),
             (ActionEvent e)->{
                 move.getChildren().setAll(move7);
        
    }
     ));
     time.play();
  
    //parent
    Parent background=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));


    //SHOW STAGE:
        final Group root=new Group(background,move);
    //set scene
        
        primaryStage.setScene(new Scene(root,939,615));
        primaryStage.setTitle("Hello World!");
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
    }
    
}
