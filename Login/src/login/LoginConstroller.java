
package login;




import com.jfoenix.controls.JFXButton;
import javafx.scene.input.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.util.Duration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
///import com.mysql.cj.protocol.Resultset;
import javafx.scene.input.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
//import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class LoginConstroller implements Initializable {
        Player player = new Player();
          Player newPlayer = new Player(); //00000000000000000000
@FXML
private AnchorPane ap;
     @FXML
    private JFXTextField UserNameDB;
    @FXML
    private JFXPasswordField passwordDB;
    @FXML
    private Label errorDB;
       @FXML
    private JFXTextField newUseDB;
    @FXML
    private JFXTextField newEmailDB;
    @FXML
    private JFXButton creatAccountDB;
    @FXML
    private JFXPasswordField newPasswordDB;
    @FXML
    private JFXPasswordField newPasswordCDB;
    @FXML
    private Label labelmsg;

    
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


        Timeline t = new Timeline();
        Timeline t2 = new Timeline();
        Timeline t3 = new Timeline();
        Timeline t4 = new Timeline();
        Timeline t5 = new Timeline();
        
    
 /*   @FXML
    private void toLogin(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Login.fxml"));
         Scene gameScene = new Scene(pane);
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
           window.setScene(gameScene);
           window.show();
    }*/
    /*
    @FXML
    private void toLogin2(MouseEvent  event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Login.fxml"));
         Scene gameScene = new Scene(pane);
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
           
           window.setScene(gameScene);
           window.show();
    }
   */
          private boolean loginDB() {
        System.out.println(" ARWA AL_MASHI");
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
        String username = UserNameDB.getText();
        String password = passwordDB.getText();       
       // if(username.equals("") || password.equals("")){
        if(username.trim().isEmpty() || password.trim().isEmpty() ){
            System.out.println("EEEEEEMMMMMMMMMPPPPPPPPPTTTTTTYYYYYYY");
             errorDB.setText(" الرجاء تعبئة جميع الحقول ");
          return false ;   
        }
        else{
            
        Player playernew = new Player(username, password);
        Player p = (Player) session.get(Player.class, username);
        player = p;
        this.initData(player);
        System.out.println("p : " + p.getUsername() + " ," + p.getPassword());
        System.out.println("player : " + playernew.getUsername() + " ," + playernew.getPassword());
          
            if (!p.getPassword().equals(playernew.getPassword())) {
            errorDB.setText("تحقق من كلمة المرور  ");
            transaction.commit();
            session.close();
            return false;
        } else {
            System.out.println("SUCCESS");
            transaction.commit();
            session.close();
            return true;
        }
        }
    }
          catch(Exception exp) {
        
        }
         return false;
          }

    
    @FXML
    private void toSignup(MouseEvent event) throws IOException {
       AnchorPane signupPane = FXMLLoader.load(getClass().getResource("signup.fxml"));
         Scene signupScene = new Scene(signupPane);
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
           window.setScene(signupScene);
           window.show();
    }
    
    @FXML
    private void toMainMenu(ActionEvent event) throws IOException {
         if (Login.mute == false) { playAudioSelect(); }
                if (loginDB() == true) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Main menu.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            MainMenuController controller = loader.getController();
            controller.initData(player);
            /*
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Main menu.fxml"));
        Scene gameScene = new Scene(pane);*/
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        root.getChildren().add(catl);

           window.setScene(scene);
           window.show();
        System.out.println("TO MAIN MENU ACTION");
        
                }
        
    }
    
    
     @FXML
    public void close(MouseEvent event) {
    System.exit(0);
   }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // Thread.currentThread().countStackFrames()
                   
        System.out.println("LOGIN INIT");
        // TODO
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
        
        t.setCycleCount(Timeline.INDEFINITE);
        t2.setCycleCount(Timeline.INDEFINITE);
        t3.setCycleCount(Timeline.INDEFINITE);
        t4.setCycleCount(Timeline.INDEFINITE);
        t5.setCycleCount(Timeline.INDEFINITE);

         
        
        
        
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
      
 
    }
public void initData(Player player) {
    this.player = player;
    this.player = player;
    this.player.setName(player.getName());
    this.player.setAwardName(player.getAwardName());
    this.player.setAwards(player.getAwards());
    this.player.setEmail(player.getEmail());
    this.player.setLevel(player.getLevel());
    this.player.setLevelCode(player.getLevelCode());
    this.player.setPassword(player.getPassword());
    this.player.setUsername(player.getUsername());
    this.player.setScore(player.getScore());
}

void playAudioSelect(){
       AudioClip a1 = new AudioClip(this.getClass().getResource("select.mp3").toString());
       a1.play();
    } 
 
}
