/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;


import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation.Status;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Draggable node sample.
 * 
 * @author Michael Hoffer <info@michaelhoffer.de>
 */
public class DragDropHandler {
    
    StartPlayingController startPlaying;
    int targetId;
    int noLoops;
    JFXButton prevNode;
    boolean isDraggedDropped = false;
     // load image from the image folder 
        // profile left
    final static javafx.scene.image.Image Cat_1 = new javafx.scene.image.Image(FXMLDocumentController.class.getResource("/images/1.png").toString());
    final static javafx.scene.image.Image Cat_2 = new javafx.scene.image.Image(FXMLDocumentController.class.getResource("/images/2.png").toString());
    final static javafx.scene.image.Image Cat_3 = new javafx.scene.image.Image(FXMLDocumentController.class.getResource("/images/3.png").toString());
    final static javafx.scene.image.Image Cat_4 = new javafx.scene.image.Image(FXMLDocumentController.class.getResource("/images/4.png").toString());
    final static javafx.scene.image.Image Cat_5 = new javafx.scene.image.Image(FXMLDocumentController.class.getResource("/images/5.png").toString());
    final static javafx.scene.image.Image Cat_6 = new javafx.scene.image.Image(FXMLDocumentController.class.getResource("/images/6.png").toString());
    final static javafx.scene.image.Image Cat_7 = new javafx.scene.image.Image(FXMLDocumentController.class.getResource("/images/7.png").toString());
    
    
    //profile right 
    final static javafx.scene.image.Image Cat_h1 = new javafx.scene.image.Image(FXMLDocumentController.class.getResource("/images/h1.png").toString());
    final static javafx.scene.image.Image Cat_h2 = new javafx.scene.image.Image(FXMLDocumentController.class.getResource("/images/h2.png").toString());
    final static javafx.scene.image.Image Cat_h3 = new javafx.scene.image.Image(Animation.class.getResource("/images/h3.png").toString());
    final static javafx.scene.image.Image Cat_h4 = new javafx.scene.image.Image(Animation.class.getResource("/images/h4.png").toString());
    final static javafx.scene.image.Image Cat_h5 = new javafx.scene.image.Image(Animation.class.getResource("/images/h5.png").toString());
    final static javafx.scene.image.Image Cat_h6 = new javafx.scene.image.Image(Animation.class.getResource("/images/h6.png").toString());
    final static javafx.scene.image.Image Cat_h7 = new javafx.scene.image.Image(Animation.class.getResource("/images/h7.png").toString());

// front cat
    final static javafx.scene.image.Image Cat_f1 = new javafx.scene.image.Image(Animation.class.getResource("/images/f1.png").toString());
    final static javafx.scene.image.Image Cat_f2 = new javafx.scene.image.Image(Animation.class.getResource("/images/f2.png").toString());
    final static javafx.scene.image.Image Cat_f3 = new javafx.scene.image.Image(Animation.class.getResource("/images/f3.png").toString());
    final static javafx.scene.image.Image Cat_f4 = new javafx.scene.image.Image(Animation.class.getResource("/images/f4.png").toString());
    final static javafx.scene.image.Image Cat_f5 = new javafx.scene.image.Image(Animation.class.getResource("/images/f5.png").toString());

    //intro 
    final static javafx.scene.image.Image Cat_i1 = new javafx.scene.image.Image(Animation.class.getResource("/images/i1.png").toString());
    final static javafx.scene.image.Image Cat_i2 = new javafx.scene.image.Image(Animation.class.getResource("/images/i2.png").toString());
    final static javafx.scene.image.Image Cat_i3 = new javafx.scene.image.Image(Animation.class.getResource("/images/i3.png").toString());
    final static javafx.scene.image.Image Cat_i4 = new javafx.scene.image.Image(Animation.class.getResource("/images/i4.png").toString());
    final static javafx.scene.image.Image Cat_i5 = new javafx.scene.image.Image(Animation.class.getResource("/images/i5.png").toString());
    final static javafx.scene.image.Image Cat_i6 = new javafx.scene.image.Image(Animation.class.getResource("/images/i6.png").toString());
    final static javafx.scene.image.Image Cat_i7 = new javafx.scene.image.Image(Animation.class.getResource("/images/i7.png").toString());
    final static javafx.scene.image.Image Cat_i8 = new javafx.scene.image.Image(Animation.class.getResource("/images/i8.png").toString());
    final static javafx.scene.image.Image Cat_i9 = new javafx.scene.image.Image(Animation.class.getResource("/images/i9.png").toString());
    final static javafx.scene.image.Image Cat_i10 = new javafx.scene.image.Image(Animation.class.getResource("/images/i10.png").toString());
    final static javafx.scene.image.Image Cat_i11 = new javafx.scene.image.Image(Animation.class.getResource("/images/i11.png").toString());
    final static javafx.scene.image.Image Cat_ii1 = new javafx.scene.image.Image(Animation.class.getResource("/images/f1.png").toString());
    final static javafx.scene.image.Image Cat_ii2 = new javafx.scene.image.Image(Animation.class.getResource("/images/f2.png").toString());
    final static javafx.scene.image.Image Cat_ii3 = new javafx.scene.image.Image(Animation.class.getResource("/images/f3.png").toString());
    final static javafx.scene.image.Image Cat_ii4 = new javafx.scene.image.Image(Animation.class.getResource("/images/f4.png").toString());
    final static javafx.scene.image.Image Cat_ii5 = new javafx.scene.image.Image(Animation.class.getResource("/images/f5.png").toString());

    
    //login cat
    final static javafx.scene.image.Image Cat_l1 = new javafx.scene.image.Image(Animation.class.getResource("/images/l1.png").toString());
    final static javafx.scene.image.Image Cat_l2 = new javafx.scene.image.Image(Animation.class.getResource("/images/l2.png").toString());
    final static javafx.scene.image.Image Cat_l3 = new javafx.scene.image.Image(Animation.class.getResource("/images/l3.png").toString());
    final static javafx.scene.image.Image Cat_l4 = new javafx.scene.image.Image(Animation.class.getResource("/images/l4.png").toString());
    final static javafx.scene.image.Image Cat_l5 = new javafx.scene.image.Image(Animation.class.getResource("/images/l5.png").toString());
    final static javafx.scene.image.Image Cat_l6 = new javafx.scene.image.Image(Animation.class.getResource("/images/l6.png").toString());
    final static javafx.scene.image.Image Cat_l7 = new javafx.scene.image.Image(Animation.class.getResource("/images/l7.png").toString());
    final static javafx.scene.image.Image Cat_l8 = new javafx.scene.image.Image(Animation.class.getResource("/images/l8.png").toString());
public 
    

    // place the images into new ImageView Node (to desplay it on the scene)
        //cat profile Right 
        final ImageView cat1 = new ImageView(Cat_1);
        final ImageView cat2 = new ImageView(Cat_2);
        final ImageView cat3 = new ImageView(Cat_3);
        final ImageView cat4 = new ImageView(Cat_4);
        final ImageView cat5 = new ImageView(Cat_5);
        final ImageView cat6 = new ImageView(Cat_6);
        final ImageView cat7 = new ImageView(Cat_7);
        //cat Profile left  
        final ImageView cath1 = new ImageView(Cat_h1);
        final ImageView cath2 = new ImageView(Cat_h2);
        final ImageView cath3 = new ImageView(Cat_h3);
        final ImageView cath4 = new ImageView(Cat_h4);
        final ImageView cath5 = new ImageView(Cat_h5);
        final ImageView cath6 = new ImageView(Cat_h6);
        final ImageView cath7 = new ImageView(Cat_h7);

        //cat front 
        final ImageView catf1 = new ImageView(Cat_f1);
        final ImageView catf2 = new ImageView(Cat_f2);
        final ImageView catf3 = new ImageView(Cat_f3);
        final ImageView catf4 = new ImageView(Cat_f4);
        final ImageView catf5 = new ImageView(Cat_f5);

        //cat intro
        final ImageView cati1 = new ImageView(Cat_i1);
        final ImageView cati2 = new ImageView(Cat_i2);
        final ImageView cati3 = new ImageView(Cat_i3);
        final ImageView cati4 = new ImageView(Cat_i4);
        final ImageView cati5 = new ImageView(Cat_i5);
        final ImageView cati6 = new ImageView(Cat_i6);
        final ImageView cati7 = new ImageView(Cat_i7);
        final ImageView cati8 = new ImageView(Cat_i8);
        final ImageView cati9 = new ImageView(Cat_i9);
        final ImageView cati10 = new ImageView(Cat_i10);
        final ImageView cati11 = new ImageView(Cat_i11);
        final ImageView catii1 = new ImageView(Cat_ii1);
        final ImageView catii2 = new ImageView(Cat_ii2);
        final ImageView catii3 = new ImageView(Cat_ii3);
        final ImageView catii4 = new ImageView(Cat_ii4);
        final ImageView catii5 = new ImageView(Cat_ii5);
        
        //cat login 
        final ImageView catl1 = new ImageView(Cat_l1);
        final ImageView catl2 = new ImageView(Cat_l2);
        final ImageView catl3 = new ImageView(Cat_l3);
        final ImageView catl4 = new ImageView(Cat_l4);
        final ImageView catl5 = new ImageView(Cat_l5);
        final ImageView catl6 = new ImageView(Cat_l6);
        final ImageView catl7 = new ImageView(Cat_l7);
        final ImageView catl8 = new ImageView(Cat_l8);
// create a node group
    public Group cat=new Group(cat1);
    public Group cath= new Group(cath1);
    public  Group catf= new Group(catf1);
    public Group cati= new Group(cati1);
    public Group catl= new Group(catl1);
    public Group g = new Group();
    
    public final ArrayList<ImageView> right = new ArrayList<>();
    
    
    public final Group resultGroup = new Group();


        Timeline t = new Timeline();
        Timeline t2 = new Timeline();
        Timeline t3 = new Timeline();
        Timeline t4 = new Timeline();
        Timeline t5 = new Timeline();
        Timeline resultTimeline = new Timeline();
        
        Timeline resultTimeline1 = new Timeline();
        Timeline resultTimeline2 = new Timeline();
        Timeline resultTimeline3 = new Timeline();
        Timeline resultTimeline4 = new Timeline();
        Timeline resultTimeline5 = new Timeline();
        Timeline resultTimeline6 = new Timeline();
        Timeline resultTimeline7 = new Timeline();
        Timeline resultTimeline8 = new Timeline();
        Timeline resultTimeline9 = new Timeline();
        Timeline resultTimeline10 = new Timeline();
        Timeline resultTimeline11 = new Timeline();
        Timeline resultTimeline12 = new Timeline();
        Timeline resultTimeline13 = new Timeline();
        Timeline resultTimeline14 = new Timeline();
        Timeline resultTimeline15 = new Timeline();
        Timeline resultTimeline16 = new Timeline();
        Timeline resultTimeline17 = new Timeline();
        Timeline resultTimeline18 = new Timeline();
        Timeline resultTimeline19 = new Timeline();
        Timeline resultTimeline20 = new Timeline();

int i = 0;
    
    
    JFXButton source = new JFXButton("");
    JFXButton target = new JFXButton("");
    ArrayList<Command> playerArr = new ArrayList<Command>();
    
    public void setPlayerArr(ArrayList<Command> playerArr) {
        this.playerArr = playerArr;     
    }
    
    public  ArrayList<Command>  getPlayerArr( ArrayList<Command>  playerArr) {
    return playerArr;
    }

    final EventHandler<MouseEvent> myHandlerDetected = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
        ////    System.out.println("DETECTED");
            source = (JFXButton) event.getSource();
   
            /* drag was detected, start drag-and-drop gesture */
            System.out.println("onDragDetected");
            
            if (Login.mute == false) { playAudioDrag(); }

            /* allow any transfer mode */
            Dragboard db = source.startDragAndDrop(TransferMode.MOVE);

            /* put a string on dragboard */
            ClipboardContent content = new ClipboardContent();
            content.putString(source.getText());
            db.setContent(content);

            event.consume();
            // onDragAction(tf1, tf4);

        }

    };

    final EventHandler<DragEvent> myHandlerOver = new EventHandler<DragEvent>() {
        @Override
        public void handle(DragEvent event) {
            target = (JFXButton) event.getSource();
            
           // source.setTranslateX(event.getX()+source.getPrefWidth()/2);
           // source.setTranslateY(event.getX()+source.getPrefWidth()/2);
           // node1.setLayoutX(20 * (1 + 1) + node1.getPrefWidth() * 1);
           // node1.setTranslateX(scene.getX());
           // node1.setTranslateY(scene.getY());
            /* data is dragged over the target */
            System.out.println("onDragOver");

            /*
             * accept it only if it is not dragged from the same node and if it has a string
             * data
             */
            if (event.getGestureSource() != target && (event.getDragboard().hasString())
                    )
                     {
                /* allow for both copying and moving, whatever user chooses */
                /////move only? (I changed it)
                event.acceptTransferModes(TransferMode.MOVE);
            }

            event.consume();

        }
    };

    final EventHandler<DragEvent> myHandlerEntered = new EventHandler<DragEvent>() {
        @Override
        public void handle(DragEvent event) {
            target = (JFXButton) event.getSource();
           
            /* the drag-and-drop gesture entered the target */
            System.out.println("onDragEntered");
            /* show to the user that it is an actual gesture target */
            if (event.getGestureSource() != target && event.getDragboard().hasString()) {
                // tf4.setFill(Color.GREEN);
               // target.setFill(Color.PINK);
            }

            event.consume();

        }

    };

    final EventHandler<DragEvent> myHandlerExited = new EventHandler<DragEvent>() {
        @Override
        public void handle(DragEvent event) {
            target = (JFXButton) event.getSource();
            /* mouse moved away, remove the graphical cues */
        //    target.setFill(Color.BLACK);
          
            event.consume();

        }

    };

    final EventHandler<DragEvent> myHandlerDropped = new EventHandler<DragEvent>() {
        
        @Override
        public void handle(DragEvent event) {
            System.out.println("In handle of dropped");
       /* target = (JFXButton) event.getSource();
        
        targetId = Integer.parseInt(target.getId());
        
        JFXButton prevNode = (JFXButton) StageController.vbox2.getChildren().get(targetId-1);
        System.out.println("prev node id = " + prevNode.getId());*/
            /* data dropped */
            /* if there is a string data on dragboard, read it and use it */
                      ///////////////////  target = (JFXButton) event.getSource();
                      
            Dragboard db = event.getDragboard();
            boolean success = false;
            if (db.hasString()&& target.getText().trim().isEmpty() && !(source.getParent()==StageController.vbox2 &&
                  target.getParent()==StageController.vbox2)) {
                target.setText(db.getString());
                success = true;
                isDraggedDropped = true;
            }
            /*
             * let the source know whether the string was successfully transferred and used
             */
            event.setDropCompleted(success);
            System.out.println("myHandlerDropped");

            event.consume();

        }

    };

    final EventHandler<DragEvent> myHandlerDone = new EventHandler<DragEvent>() {
        @Override
        public void handle(DragEvent ev) {
            
        cat.setTranslateX(400);
        cat.setTranslateY(270);

        cath.setTranslateX(400);
        cath.setTranslateY(270);
        
     

        catf.setTranslateX(200);
        catf.setTranslateY(220);

        cati.setTranslateX(200);
        cati.setTranslateY(220);
        
        catl.setTranslateX(-150);
        catl.setTranslateY(-100);
     
          
      
        t.setCycleCount(1);
        t2.setCycleCount(1);
        t3.setCycleCount(Timeline.INDEFINITE);
        t4.setCycleCount(Timeline.INDEFINITE);
        t5.setCycleCount(Timeline.INDEFINITE);
        resultTimeline.setCycleCount(1);
        

        

        // add image into the timeline 
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    cat.getChildren().setAll(cat2);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(300),
                (ActionEvent event) -> {
                    cat.getChildren().setAll(cat3);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(400),
                (ActionEvent event) -> {
                    cat.getChildren().setAll(cat4);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(500),
                (ActionEvent event) -> {
                    cat.getChildren().setAll(cat5);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(600),
                (ActionEvent event) -> {
                    cat.getChildren().setAll(cat6);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(700),
                (ActionEvent event) -> {
                    cat.getChildren().setAll(cat7);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(800),
                (ActionEvent event) -> {
                    cat.getChildren().setAll(cat6);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(900),
                (ActionEvent event) -> {
                    cat.getChildren().setAll(cat5);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1000),
                (ActionEvent event) -> {
                    cat.getChildren().setAll(cat4);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1100),
                (ActionEvent event) -> {
                    cat.getChildren().setAll(cat3);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1200),
                (ActionEvent event) -> {
                    cat.getChildren().setAll(cat2);
                }
        ));

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1300),
                (ActionEvent event) -> {
                    cat.getChildren().setAll(cat1);
                }
        ));

     ///   t.play();

        // flip horizon 
        // add image into the timeline 
        t2.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    cath.getChildren().setAll(cath2);
                }
        ));

        t2.getKeyFrames().add(new KeyFrame(
                Duration.millis(300),
                (ActionEvent event) -> {
                    cath.getChildren().setAll(cath3);
                }
        ));

        t2.getKeyFrames().add(new KeyFrame(
                Duration.millis(400),
                (ActionEvent event) -> {
                    cath.getChildren().setAll(cath4);
                }
        ));
        t2.getKeyFrames().add(new KeyFrame(
                Duration.millis(500),
                (ActionEvent event) -> {
                    cath.getChildren().setAll(cath5);
                }
        ));

        t2.getKeyFrames().add(new KeyFrame(
                Duration.millis(600),
                (ActionEvent event) -> {
                    cath.getChildren().setAll(cath6);
                }
        ));
        t2.getKeyFrames().add(new KeyFrame(
                Duration.millis(700),
                (ActionEvent event) -> {
                    cath.getChildren().setAll(cath7);
                }
        ));

        t2.getKeyFrames().add(new KeyFrame(
                Duration.millis(800),
                (ActionEvent event) -> {
                    cath.getChildren().setAll(cath6);
                }
        ));
        t2.getKeyFrames().add(new KeyFrame(
                Duration.millis(900),
                (ActionEvent event) -> {
                    cath.getChildren().setAll(cath5);
                }
        ));

        t2.getKeyFrames().add(new KeyFrame(
                Duration.millis(1000),
                (ActionEvent event) -> {
                    cath.getChildren().setAll(cath4);
                }
        ));

        t2.getKeyFrames().add(new KeyFrame(
                Duration.millis(1100),
                (ActionEvent event) -> {
                    cath.getChildren().setAll(cath3);
                }
        ));
        t2.getKeyFrames().add(new KeyFrame(
                Duration.millis(1200),
                (ActionEvent event) -> {
                    cath.getChildren().setAll(cath2);
                }
        ));

        t2.getKeyFrames().add(new KeyFrame(
                Duration.millis(1300),
                (ActionEvent event) -> {
                    cath.getChildren().setAll(cath1);
                }
        ));

        //play timeline 
    ///    t2.play();

        // cat front
        // add image into the timeline 
        t3.getKeyFrames().add(new KeyFrame(
                Duration.millis(900),
                (ActionEvent event) -> {
                    catf.getChildren().setAll(catf2);
                }
        ));

        t3.getKeyFrames().add(new KeyFrame(
                Duration.millis(1000),
                (ActionEvent event) -> {
                    catf.getChildren().setAll(catf3);
                }
        ));

        t3.getKeyFrames().add(new KeyFrame(
                Duration.millis(1100),
                (ActionEvent event) -> {
                    catf.getChildren().setAll(catf4);
                }
        ));
        t3.getKeyFrames().add(new KeyFrame(
                Duration.millis(1200),
                (ActionEvent event) -> {
                    catf.getChildren().setAll(catf5);
                }
        ));

        t3.getKeyFrames().add(new KeyFrame(
                Duration.millis(1300),
                (ActionEvent event) -> {
                    catf.getChildren().setAll(catf4);
                }
        ));
        t3.getKeyFrames().add(new KeyFrame(
                Duration.millis(1400),
                (ActionEvent event) -> {
                    catf.getChildren().setAll(catf3);
                }
        ));

        t3.getKeyFrames().add(new KeyFrame(
                Duration.millis(1500),
                (ActionEvent event) -> {
                    catf.getChildren().setAll(catf2);
                }
        ));
        t3.getKeyFrames().add(new KeyFrame(
                Duration.millis(1600),
                (ActionEvent event) -> {
                    catf.getChildren().setAll(catf1);
                }
        ));

        //play timeline 
        t3.play();

        // cat intro
        t4.getKeyFrames().add(new KeyFrame(
                Duration.millis(900),
                (ActionEvent event) -> {
                    cati.getChildren().setAll(catii2);
                }
        ));

        t4.getKeyFrames().add(new KeyFrame(
                Duration.millis(1000),
                (ActionEvent event) -> {
                    cati.getChildren().setAll(catii3);
                }
        ));

        t4.getKeyFrames().add(new KeyFrame(
                Duration.millis(1100),
                (ActionEvent event) -> {
                    cati.getChildren().setAll(catii4);
                }
        ));
        t4.getKeyFrames().add(new KeyFrame(
                Duration.millis(1200),
                (ActionEvent event) -> {
                    cati.getChildren().setAll(catii5);
                }
        ));

        t4.getKeyFrames().add(new KeyFrame(
                Duration.millis(1300),
                (ActionEvent event) -> {
                    cati.getChildren().setAll(cati2);
                }
        ));

        t4.getKeyFrames().add(new KeyFrame(
                Duration.millis(1400),
                (ActionEvent event) -> {
                    cati.getChildren().setAll(cati3);
                }
        ));
        t4.getKeyFrames().add(new KeyFrame(
                Duration.millis(1500),
                (ActionEvent event) -> {
                    cati.getChildren().setAll(cati4);
                }
        ));
        t4.getKeyFrames().add(new KeyFrame(
                Duration.millis(1600),
                (ActionEvent event) -> {
                    cati.getChildren().setAll(cati5);
                }
        ));
        t4.getKeyFrames().add(new KeyFrame(
                Duration.millis(1700),
                (ActionEvent event) -> {
                    cati.getChildren().setAll(cati6);
                }
        ));
        t4.getKeyFrames().add(new KeyFrame(
                Duration.millis(1800),
                (ActionEvent event) -> {
                    cati.getChildren().setAll(cati7);
                }
        ));
        t4.getKeyFrames().add(new KeyFrame(
                Duration.millis(1900),
                (ActionEvent event) -> {
                    cati.getChildren().setAll(cati8);
                }
        ));
        t4.getKeyFrames().add(new KeyFrame(
                Duration.millis(2000),
                (ActionEvent event) -> {
                    cati.getChildren().setAll(cati9);
                }
        ));
        t4.getKeyFrames().add(new KeyFrame(
                Duration.millis(2100),
                (ActionEvent event) -> {
                    cati.getChildren().setAll(cati10);
                }
        ));
        t4.getKeyFrames().add(new KeyFrame(
                Duration.millis(2200),
                (ActionEvent event) -> {
                    cati.getChildren().setAll(cati11);

                }
        ));
        
        t4.getKeyFrames().add(new KeyFrame(
                Duration.millis(2300),
                (ActionEvent event) -> {
  FadeTransition ft = new FadeTransition();
      ft.setNode(cati11);
      ft.setDuration(new Duration(2300));
      ft.setFromValue(1.0);
      ft.setToValue(0.0);
      ft.setCycleCount(1);
      ft.setAutoReverse(true);
      
t4.stop();

       ft.play();

                }
        ));
        //play timeline 
     ///   t4.play();
        
              
t5.getKeyFrames().add(new KeyFrame(
                Duration.millis(900),
                (ActionEvent event) -> {
                    catl.getChildren().setAll(catl2);
                }
        ));

        t5.getKeyFrames().add(new KeyFrame(
                Duration.millis(1000),
                (ActionEvent event) -> {
                    catl.getChildren().setAll(catl3);
                }
        ));

        t5.getKeyFrames().add(new KeyFrame(
                Duration.millis(1100),
                (ActionEvent event) -> {
                    catl.getChildren().setAll(catl4);
                }
        ));
        t5.getKeyFrames().add(new KeyFrame(
                Duration.millis(1200),
                (ActionEvent event) -> {
                    catl.getChildren().setAll(catl5);
                }
        ));

        t5.getKeyFrames().add(new KeyFrame(
                Duration.millis(1300),
                (ActionEvent event) -> {
                    catl.getChildren().setAll(catl4);
                }
        ));
        t5.getKeyFrames().add(new KeyFrame(
                Duration.millis(1400),
                (ActionEvent event) -> {
                    catl.getChildren().setAll(catl3);
                }
        ));

        t5.getKeyFrames().add(new KeyFrame(
                Duration.millis(1500),
                (ActionEvent event) -> {
                    catl.getChildren().setAll(catl2);
                }
        ));
        t5.getKeyFrames().add(new KeyFrame(
                Duration.millis(1600),
                (ActionEvent event) -> {
                    catl.getChildren().setAll(catl1);
                }
        ));

        //play timeline 
      ///  t5.play();
        
      
 
                     //   source = (Text) event.getSource();

            /* the drag and drop gesture ended */
            /* if the data was successfully moved, clear it */
            if (ev.getTransferMode() == TransferMode.MOVE) {
                //FXMLDocumentController.playerSol.add(new Command(new JFXButton(source.getText())));
              //  playerArr.add(new Command(new JFXButton(source.getText())));
                source.setText("");
           //////    ((Pane) source.getParent()).getChildren().remove(source);
                //root.getChildren().remove(node1);
                
            }
                    
          System.out.println("myHandlerDone");
          AnchorPane root = (AnchorPane)((Node)ev.getSource()).getScene().getRoot();
          //root.getChildren().remove(cat);
          if(((Node)ev.getSource()).getParent().getParent()==StageController.rootG1S1 
                  || ((Node)ev.getSource()).getParent().getParent()==StageController.rootG1S3
                  && isDraggedDropped) {
          if((source.getParent()==StageController.vbox1 &&
                  target.getParent()==StageController.vbox2) ||
                  (source.getParent()==StageController.vbox2 &&
                  target.getParent()==StageController.vbox1)) {
              System.out.println("Source: " + source.getText());
              System.out.println("Target: " + target.getText());
         /// temp.getChildren().add(cat);
          System.out.println(source.getParent().toString());
          System.out.println("Source ID: " + source.getId());
          
          /// Scene gameScene = (Scene) ((Node)ev.getSource()).getScene();
          Scene gameScene = (Scene) ((Node)ev.getSource()).getScene();
                           
          Stage window = (Stage) ((Node)ev.getSource()).getScene().getWindow();
            if(target.getText().equalsIgnoreCase("تحرك للخلف")){
                             System.out.println("تحرك للخلف");
          if(startPlaying==null) {
              System.out.println("Start playing is null!! drag & drop");
            }
          if(source.getParent()==StageController.vbox2&&target.getParent()==StageController.vbox1) {
          StageController.temp.getChildren().clear();
          StageController.temp.getChildren().add(cat);
          startPlaying.AnimationFront();
          t.play();
          }
          else {
          StageController.temp.getChildren().clear();
          StageController.temp.getChildren().add(cath);
          startPlaying.AnimationBack();
          t2.play();
          }
          
          
          ///////////jump
          
          
         // root.getChildren().add(temp);
       //   gameScene.setRoot(root);
         // if(t2.getStatus()==Status.STOPPED) {
          //startPlaying.AnimationStop();
          //}
         // i++;
          }
            
            
            /////jump
               if(target.getText().equalsIgnoreCase("اقفز") && target.getParent()!=StageController.vbox1){
                             System.out.println("اقفز");
          if(startPlaying==null) {
              System.out.println("Start playing is null!! drag & drop");
            }
          if(source.getParent()==StageController.vbox2&&target.getParent()==StageController.vbox1) {
          StageController.temp.getChildren().clear();
          StageController.temp.getChildren().add(cat);
          startPlaying.animationJump();
          t.play();
          if (Login.mute == false) { playAudioJump(); }
          }
          else {
          StageController.temp.getChildren().clear();
          StageController.temp.getChildren().add(cat);
          //double backTempX = startPlaying.g
          startPlaying.animationJump();
          t.play();
          if (Login.mute == false) { playAudioJump(); }
          }
          
          
          ///////////jump
          
          
         // root.getChildren().add(temp);
       //   gameScene.setRoot(root);
         // if(t2.getStatus()==Status.STOPPED) {
          //startPlaying.AnimationStop();
          //}
         // i++;
          }
         // if(i==2) {target.setText("تحرك لليسار");  i=1;}
           if(target.getText().equalsIgnoreCase("تحرك للأمام" ) & target.getParent().getParent()
                   !=StageController.rootG1S3){

               System.out.println("تحرك للأمام");
               if(source.getParent()==StageController.vbox2&&target.getParent()==StageController.vbox1) {
               StageController.temp.getChildren().clear();
          StageController.temp.getChildren().add(cath);
          //double backTempX = startPlaying.g
          startPlaying.AnimationBack();
          
         // root.getChildren().add(temp);
       //   gameScene.setRoot(root);
          t2.play();
               }
               else {
          StageController.temp.getChildren().clear();
          StageController.temp.getChildren().add(cat);
          startPlaying .AnimationFront();
          t.play();
               }
          }
                 
           //////////loop
           try {
            JFXButton prevLoop = (JFXButton)StageController.vbox2.getChildren().get(Integer.parseInt(target.getId())-1);
           if(target.getText().equalsIgnoreCase("تكرار" )&&prevLoop.getText().equalsIgnoreCase("تحرك للأمام")){
               System.out.println("تكرار");
               if(source.getParent()==StageController.vbox2&&target.getParent()==StageController.vbox1) {
               StageController.temp.getChildren().clear();
          StageController.temp.getChildren().add(cath);
          //double backTempX = startPlaying.g
       //   startPlaying.AnimationBack();
           if(!startPlaying.noLoopsTf.getText().trim().isEmpty()) {
          int loops = startPlaying.noOfLoopsBack();      
          t2.setCycleCount(loops);
          t2.play();
               }
          else {
          System.out.println("TF IS EMPTY");
          }
         // root.getChildren().add(temp);
       //   gameScene.setRoot(root);
          //t2.setCycleCount(5);
            //t2.play();
               }
               else {
          StageController.temp.getChildren().clear();
          StageController.temp.getChildren().add(cat);
          if(!startPlaying.noLoopsTf.getText().trim().isEmpty()) {
          int loops = startPlaying.noOfLoops();      
          t.setCycleCount(loops);
          t.play();
               }
          else {
          System.out.println("TF IS EMPTY");
          }
               }
          }
           }
           catch(Exception exp) {
           System.out.println("Prev node is empty");
           }
           
            
//          root.getChildren().add(StageController.temp);
         // gameScene.setRoot(root);
          window.setScene(gameScene);
          //   startPlayingStage.setScene(gameScene);
          window.show();
          System.out.println("After cat to pane");
               
          }
          }
          if(target.getParent()==StageController.vbox1)
              System.out.println("Target Vbox 1");
          else if(target.getParent()==StageController.vbox2)
               System.out.println("Target Vbox 2");
          else
               System.out.println("Target NO VBOX!");
          try {
            //  System.out.println("Next node: " +  StageController.vbox2.getChildren().get(Integer.parseInt(source.getId()+1)));
          if(target.getParent()==StageController.vbox1)
              StageController.vbox2.getChildren().get(Integer.parseInt(source.getId())+1).setDisable(true);
          else if (source.getParent()==StageController.vbox1 &&
                  (target.getId()!=null&&!target.getId().trim().isEmpty()))
          StageController.vbox2.getChildren().get(Integer.parseInt(target.getId())+1).setDisable(false);
          isDraggedDropped = false;
          ev.consume();
          }
          catch(Exception exp) {
          System.out.println(" StageController.vbox2.getChildren().get(Integer.parseInt(source.getId()+1)) or else is null");
          }

        }

    };

public void setAnimtation(StartPlayingController s) {
startPlaying=s;

}

void playAudioJump(){
       AudioClip a1 = new AudioClip(this.getClass().getResource("jump.mp3").toString());
       a1.play();
    }

void playAudioDrag(){
       AudioClip a1 = new AudioClip(this.getClass().getResource("drag.mp3").toString());
       a1.play();
    } 

}

