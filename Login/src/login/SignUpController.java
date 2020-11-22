/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Arwa
 */
public class SignUpController implements Initializable {
    
    //000000000000000000000000
    Player newPlayer = new Player(); 
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
    
    
    Player player = new Player();
    
    @FXML
    private JFXTextField newUseDB;
    @FXML
    private JFXTextField newEmailDB;
    @FXML
    private JFXPasswordField newPasswordDB;
    @FXML
    private JFXPasswordField newPasswordCDB;
    @FXML
    private Label labelmsg;
    @FXML
    private AnchorPane rootPane;
    @FXML
    private JFXTextField nameS;
      @FXML
    public void close(MouseEvent event) {
    System.exit(0);
   }
    
    @FXML
    private void toLogin(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Login.fxml"));
         Scene gameScene = new Scene(pane);
           javafx.stage.Stage window = (javafx.stage.Stage) ((Node)event.getSource()).getScene().getWindow();
           window.setScene(gameScene);
           window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
        
    }
    @FXML
    private void toMainMenu(ActionEvent event) throws IOException {
        System.out.println("SIGN UP CONTROLLER");
                if (signUpDB() == true) {
                    
        AnchorPane signupPane2 = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene signupScene2 = new Scene(signupPane2);
        javafx.stage.Stage window = (javafx.stage.Stage) ((Node)event.getSource()).getScene().getWindow();

           window.setScene(signupScene2);
           window.show();
        System.out.println("TO MAIN MENU ACTION");
        
                }
        
    }
    
    public boolean signUpDB() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("signUpDB entered");
        String name = nameS.getText() ; 
        String nUser = newUseDB.getText();
        String nEmail = newEmailDB.getText();
        String nPassword = newPasswordDB.getText(); 
        String nPasswordC = newPasswordCDB.getText();
        
      
        Player tempPlayer = (Player) session.get(Player.class, nUser);
        
        if (tempPlayer == null  ){
            System.out.print("NUUUUUUUUUUUULLLLLLLLLL"); 
   
         if (newUseDB.getText().equalsIgnoreCase("") ||
                newEmailDB.getText().equalsIgnoreCase("")|| 
                newPasswordDB.getText().equalsIgnoreCase("")|| 
                newPasswordCDB.getText().equalsIgnoreCase("") || nameS.getText().equalsIgnoreCase("")){
                labelmsg.setText("الرجاء تعبئة جميع الحقول");
                return false;
        }
        else if(!nPassword.equals(nPasswordC)) {
        labelmsg.setText("تأكد من مطابقة كلمة المرور ");
        return false;
        }
    
        else{
        Player playerDB = new Player(nUser , nPassword); 
        playerDB.setEmail(nEmail);
        playerDB.setLevelCode(1);
        playerDB.setAwardName("award0"); 
        playerDB.setName(name);
        session.save(playerDB);
        transaction.commit();
        session.close();
        return true ; 
        }
        }
        else if(tempPlayer.getUsername().equals(nUser)) {
        System.out.println("NO!! Duplicated");
        labelmsg.setText("اسم المستخدم موجود بالفعل");
        return false;
        }
        return false ; 
             

    }   

    @FXML
    private void toMainMenu(MouseEvent event) {
    }
}
