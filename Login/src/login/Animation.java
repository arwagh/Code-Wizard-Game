
package login;

import javafx.animation.KeyFrame;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;

/**
 *
 * @author linahchan
 */
public class Animation extends Application {

    // load image from the image folder 
        // profile left
    final static javafx.scene.image.Image Cat_1 = new javafx.scene.image.Image(Animation.class.getResource("/images/1.png").toString());
    final static javafx.scene.image.Image Cat_2 = new javafx.scene.image.Image(Animation.class.getResource("/images/2.png").toString());
    final static javafx.scene.image.Image Cat_3 = new javafx.scene.image.Image(Animation.class.getResource("/images/3.png").toString());
    final static javafx.scene.image.Image Cat_4 = new javafx.scene.image.Image(Animation.class.getResource("/images/4.png").toString());
    final static javafx.scene.image.Image Cat_5 = new javafx.scene.image.Image(Animation.class.getResource("/images/5.png").toString());
    final static javafx.scene.image.Image Cat_6 = new javafx.scene.image.Image(Animation.class.getResource("/images/6.png").toString());
    final static javafx.scene.image.Image Cat_7 = new javafx.scene.image.Image(Animation.class.getResource("/images/7.png").toString());
    
    
    //profile right 
    final static javafx.scene.image.Image Cat_h1 = new javafx.scene.image.Image(Animation.class.getResource("/images/h1.png").toString());
    final static javafx.scene.image.Image Cat_h2 = new javafx.scene.image.Image(Animation.class.getResource("/images/h2.png").toString());
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

    // create a node group
    public Group cat;
    public Group cath;
    public static Group catf;
    public Group cati;
    public Group catl;

    public Group g;
    public static Group all;

    public void start(Stage primaryStage) {

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


        // initial object called cat
        cat = new Group(cat1);
        cath = new Group(cath1);
        catf = new Group(catf1);
        cati = new Group(cati1);
        catl = new Group(catl1);

        all = new Group();
        g = new Group();

        // place cat at specific coordinates 
        cat.setTranslateX(200);
        cat.setTranslateY(220);

        cath.setTranslateX(200);
        cath.setTranslateY(220);

        catf.setTranslateX(200);
        catf.setTranslateY(220);

        cati.setTranslateX(200);
        cati.setTranslateY(220);
        
        catl.setTranslateX(-150);
        catl.setTranslateY(-100);
        

        // animate cat Images in loop
        Timeline t = new Timeline();
        Timeline t2 = new Timeline();
        Timeline t3 = new Timeline();
        Timeline t4 = new Timeline();
        Timeline t5 = new Timeline();


        t.setCycleCount(Timeline.INDEFINITE);
        t2.setCycleCount(Timeline.INDEFINITE);
        t3.setCycleCount(Timeline.INDEFINITE);
        t4.setCycleCount(Timeline.INDEFINITE);
        t5.setCycleCount(Timeline.INDEFINITE);

        //button
        Button btnL = new Button();
        btnL.setText("L");
        
        Button btnR = new Button();
        btnR.setText("R");
        btnR.setTranslateX(100);

        Button btnF = new Button();
        btnF.setText("F");
        btnF.setTranslateX(200);
        
         Button btnLog = new Button();
        btnLog.setText("Login");
        btnLog.setTranslateX(300);
       
        Button btnS = new Button();
        btnS.setText("Start");
        btnS.setTranslateX(700);
        btnS.setTranslateY(400);
        btnS.setMinSize(100, 60);
        
        Button btnE = new Button();
        btnE.setText("Exit");
        btnE.setTranslateX(700);
        btnE.setTranslateY(300);
        btnE.setMinSize(100, 60);
        
        Button btnP = new Button();
        btnP.setText("Profile");
        btnP.setTranslateX(700);
        btnP.setTranslateY(200);
        btnP.setMinSize(100, 60);

        //action button 
        btnL.setOnAction(e -> {
            g.getChildren().clear();
            g.getChildren().addAll(cath);
        });

        btnR.setOnAction(e -> {
            g.getChildren().clear();
            g.getChildren().addAll(cat);

        });

        btnF.setOnAction(e -> {
            g.getChildren().clear();
            g.getChildren().addAll(catf);

        });
        
        btnLog.setOnAction(e -> {
            g.getChildren().clear();
            g.getChildren().addAll(catl);

        });
        
        btnS.setOnMouseEntered(e -> {
            
            catl.getChildren().setAll(catl6);
            t5.stop();

        });
        
        btnS.setOnMouseExited(e -> { 
            
            t5.play();
        });
        
        btnE.setOnMouseEntered(e -> {
            
            catl.getChildren().setAll(catl7);
            t5.stop();

        });
        
        btnE.setOnMouseExited(e -> { 
            
            t5.play();
        });
        
        btnP.setOnMouseEntered(e -> {
            
            catl.getChildren().setAll(catl8);
            t5.stop();

        });
        
        btnP.setOnMouseExited(e -> { 
            
            t5.play();
        });
        
        g.getChildren().addAll(cati);

        all.getChildren().addAll( g,btnP,btnE,btnL, btnR, btnF,btnLog,btnS);

        
        
        
        
        
        
        
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

        t.play();

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
        t2.play();

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
        t4.play();
        
              
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
        t5.play();
        
      
 
        
        Scene scene = new Scene(catf, 939, 615);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        launch(args);
    }

}
