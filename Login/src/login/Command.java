package login;

import com.jfoenix.controls.JFXButton;
import java.io.Serializable;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity

@Table (name="command")
public class Command implements Serializable {
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
        final static ImageView cat1 = new ImageView(Cat_1);
        final static ImageView cat2 = new ImageView(Cat_2);
        final static ImageView cat3 = new ImageView(Cat_3);
        final static ImageView cat4 = new ImageView(Cat_4);
        final static ImageView cat5 = new ImageView(Cat_5);
        final static ImageView cat6 = new ImageView(Cat_6);
        final static ImageView cat7 = new ImageView(Cat_7);
        //cat Profile left  
        final static ImageView cath1 = new ImageView(Cat_h1);
        final static ImageView cath2 = new ImageView(Cat_h2);
        final static ImageView cath3 = new ImageView(Cat_h3);
        final static ImageView cath4 = new ImageView(Cat_h4);
        final static ImageView cath5 = new ImageView(Cat_h5);
        final static ImageView cath6 = new ImageView(Cat_h6);
        final static ImageView cath7 = new ImageView(Cat_h7);

        //cat front 
        final static ImageView catf1 = new ImageView(Cat_f1);
        final static ImageView catf2 = new ImageView(Cat_f2);
        final static ImageView catf3 = new ImageView(Cat_f3);
        final static ImageView catf4 = new ImageView(Cat_f4);
        final static ImageView catf5 = new ImageView(Cat_f5);

        //cat intro
        final static ImageView cati1 = new ImageView(Cat_i1);
        final static ImageView cati2 = new ImageView(Cat_i2);
        final static ImageView cati3 = new ImageView(Cat_i3);
        final static ImageView cati4 = new ImageView(Cat_i4);
        final static ImageView cati5 = new ImageView(Cat_i5);
        final static ImageView cati6 = new ImageView(Cat_i6);
        final static ImageView cati7 = new ImageView(Cat_i7);
        final static ImageView cati8 = new ImageView(Cat_i8);
        final static ImageView cati9 = new ImageView(Cat_i9);
        final static ImageView cati10 = new ImageView(Cat_i10);
        final static ImageView cati11 = new ImageView(Cat_i11);
        final static ImageView catii1 = new ImageView(Cat_ii1);
        final static ImageView catii2 = new ImageView(Cat_ii2);
        final static ImageView catii3 = new ImageView(Cat_ii3);
        final static ImageView catii4 = new ImageView(Cat_ii4);
        final static ImageView catii5 = new ImageView(Cat_ii5);
        
        //cat login 
        final static ImageView catl1 = new ImageView(Cat_l1);
        final static ImageView catl2 = new ImageView(Cat_l2);
        final static ImageView catl3 = new ImageView(Cat_l3);
        final static ImageView catl4 = new ImageView(Cat_l4);
        final static ImageView catl5 = new ImageView(Cat_l5);
        final static ImageView catl6 = new ImageView(Cat_l6);
        final static ImageView catl7 = new ImageView(Cat_l7);
        final ImageView catl8 = new ImageView(Cat_l8);
// create a node group
    public static Group cat=new Group(cat1);
    public static Group cath= new Group(cath1);
    public static Group catf= new Group(catf1);
    public static Group cati= new Group(cati1);
    public static Group catl= new Group(catl1);
    public static Group g = new Group();


        static Timeline t = new Timeline();
        static Timeline t2 = new Timeline();
        static Timeline t3 = new Timeline();
        static Timeline t4 = new Timeline();
        static Timeline t5 = new Timeline();
        
    
    
    
    
    
    @Id
    @GeneratedValue
    @Column(name="cmdId")    
    private String cmdId;
    @Transient
    private JFXButton bt;
    @Column(name="cmdName")    
    private String name;
    @Transient
    private ActionEvent action;


    public Command() {
    }
    public Command(JFXButton bt) {
        this.bt = bt;
    }

    public Command(JFXButton bt, String name, ActionEvent action) {
        this.bt = bt;
        this.name = name;
        this.action = action;
    }

    public Button getBt() {
        return this.bt;
    }

    public void setBt(JFXButton bt) {
        this.bt = bt;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionEvent getAction() {
        return this.action;
    }

    public void setAction(ActionEvent action) {
        this.action = action;
    }

    public Command bt(JFXButton bt) {
        this.bt = bt;
        return this;
    }

    public Command name(String name) {
        this.name = name;
        return this;
    }

    public Command action(ActionEvent action) {
        this.action = action;
        return this;
    }

    public static void playAnimation(Command cmd) {
     cat.setTranslateX(200);
       cat.setTranslateY(220);

        
        t.setCycleCount(Timeline.INDEFINITE);     
        
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
    }
    
    
    
}