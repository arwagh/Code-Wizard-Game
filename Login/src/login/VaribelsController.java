
package login;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class VaribelsController implements Initializable{
    Player newPlayer = new Player() ; 
    
    @FXML
    private ImageView backArrow;
     // BBBBBBBBBBBBOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXX 111111111111
    @FXML
    private ImageView openBox1;
    @FXML
    private ImageView closeBox1;
    @FXML
    private JFXButton creatVaribleButton;
    @FXML
    private Label VaribaleNameOne;
    @FXML
    private JFXTextField nameBoxOne;
    @FXML
    private Label VaribleValueOne;
    @FXML
    private JFXTextField valueBoxOne;
    @FXML
    private Label labelBoxOneN;
    @FXML
    private Label labelBoxOneV;
    @FXML
    private JFXButton doneCreate1;
    private String  boxN1 ="" ; 
    private String  boxV1 = ""; /////
    // BBBBBBBBBBBBOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXX 22222222222
    @FXML
    private JFXTextField nameBoxTwo;
    @FXML
    private JFXTextField valueBoxTwo;
    @FXML
    private JFXButton doneCreate2;
    @FXML
    private ImageView openBox2;
    @FXML
    private ImageView closeBox2;
    @FXML
    private Label labelBoxTwoN;
    @FXML
    private Label labelBoxTwoV;
    private String  boxN2 = "" ; 
    private String  boxV2 = "";////
     // BBBBBBBBBBBBOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXX 33333333333
    @FXML
    private ImageView openBox3;
    @FXML
    private ImageView closeBox3;
    @FXML
    private Label labelBoxThreeN;
    @FXML
    private Label labelBoxThreeV;
    @FXML
    private JFXTextField nameBoxThree;
    @FXML
    private JFXTextField valueBoxThree;
    @FXML
    private JFXButton doneCreate3;
    private String  boxN3 = "" ; 
    private String  boxV3 = "" ;
    
    
    // BBBBBBBBBBBBOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXX 111111111111
    @FXML
    public void CreateVaribls(ActionEvent event) throws IOException {    
        
         if (boxN1 == ""){
         openBox1.setVisible(true); // IMAGE
         nameBoxOne.setVisible(true); // TEXTFIELD
         valueBoxOne.setVisible(true); // TEXTFIELD
         VaribaleNameOne.setVisible(true); //LABEL 0000000
         VaribleValueOne.setVisible(true); //LABEL 0000000
         doneCreate1.setVisible(true); // BUTTON
         
         labelBoxOneN.textProperty().bind(nameBoxOne.textProperty());
         labelBoxOneV.textProperty().bind(valueBoxOne.textProperty());  
         }else if(boxN2 == ""){
             
         openBox2.setVisible(true); // IMAGE
         nameBoxTwo.setVisible(true); // TEXTFIELD
         valueBoxTwo.setVisible(true); // TEXTFIELD
         VaribaleNameOne.setVisible(true); //LABEL 00000000
         VaribleValueOne.setVisible(true); //LABEL 00000000
         doneCreate2.setVisible(true); // BUTTON
         
         labelBoxTwoN.textProperty().bind(nameBoxTwo.textProperty());
         labelBoxTwoV.textProperty().bind(valueBoxTwo.textProperty());
         
         }else if(boxN3 == ""){
             
         openBox3.setVisible(true); // IMAGE
         nameBoxThree.setVisible(true); // TEXTFIELD
         valueBoxThree.setVisible(true); // TEXTFIELD
         VaribaleNameOne.setVisible(true); //LABEL 00000000
         VaribleValueOne.setVisible(true); //LABEL 00000000
         doneCreate3.setVisible(true); // BUTTON
         
         labelBoxThreeN.textProperty().bind(nameBoxThree.textProperty());
         labelBoxThreeV.textProperty().bind(valueBoxThree.textProperty());
         
         }
         
        }
    @FXML
    public void toCloseBoxOne(ActionEvent event) throws IOException {
        
        boxN1 =nameBoxOne.getText(); 
        boxV1 =valueBoxOne.getText(); 
        System.out.println(" BOX NAME 1 = "+boxN1+"  BOXVALUE = "+boxV1);
        
        openBox1.setVisible(false); // IMAGE
         
         nameBoxOne.setVisible(false); // TEXTFIELD
         valueBoxOne.setVisible(false); // TEXTFIELD
         
         VaribaleNameOne.setVisible(false); //LABEL
         VaribleValueOne.setVisible(false); //LABEL 
         labelBoxOneV.setVisible(false);   //LABEL
         
          doneCreate1.setVisible(false);   //BUTTON
         
         closeBox1.setVisible(true);   //IMAGE
      
        
    }
    
    @FXML
    public void openCloseBoxOne(MouseEvent event) throws IOException { 
         labelBoxOneV.setVisible(true); 
         openBox1.setVisible(true);        
         closeBox1.setVisible(false);   
    }
    
    @FXML
    public void open1(MouseEvent event) throws IOException { 
         labelBoxOneV.setVisible(false); 
         openBox1.setVisible(false);        
         closeBox1.setVisible(true);   
    }
    // BBBBBBBBBBBBOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXX 222222222222
    public void toCloseBoxTwo(ActionEvent event) throws IOException {
        
        boxN2 = nameBoxTwo.getText(); 
        boxV2 = valueBoxTwo.getText(); 
        System.out.println(" BOX NAME 1 = "+boxN2+"  BOXVALUE = "+boxV2);
        
        openBox2.setVisible(false); // IMAGE
         
         nameBoxTwo.setVisible(false); // TEXTFIELD
         valueBoxTwo.setVisible(false); // TEXTFIELD
         
         VaribaleNameOne.setVisible(false); //LABEL
         VaribleValueOne.setVisible(false); //LABEL 
         labelBoxTwoV.setVisible(false);   //LABEL
         
         doneCreate2.setVisible(false);   //BUTTON
         
         closeBox2.setVisible(true);   //IMAGE
      
        
    }
    
    public void openCloseBoxTwo(MouseEvent event) throws IOException { 
         labelBoxTwoV.setVisible(true); 
         openBox2.setVisible(true);        
         closeBox2.setVisible(false);
        
    
    }
     public void open2(MouseEvent event) throws IOException { 
         labelBoxTwoV.setVisible(false); 
         openBox2.setVisible(false);        
         closeBox2.setVisible(true);   
    }
    // BBBBBBBBBBBBOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXX 333333333   
    
    public void toCloseBoxThree(ActionEvent event) throws IOException {
        
        boxN3 = nameBoxThree.getText(); 
        boxV3 = valueBoxThree.getText(); 
        System.out.println(" BOX NAME 3 = "+boxN3+"  BOXVALUE = "+boxV3);
        
        openBox3.setVisible(false); // IMAGE
         
         nameBoxThree.setVisible(false); // TEXTFIELD
         valueBoxThree.setVisible(false); // TEXTFIELD
         
         VaribaleNameOne.setVisible(false); //LABEL
         VaribleValueOne.setVisible(false); //LABEL 
         labelBoxThreeV.setVisible(false);   //LABEL
         
          doneCreate3.setVisible(false);   //BUTTON
         
         closeBox3.setVisible(true);   //IMAGE
      
        
    }
    
    public void openCloseBoxThree(MouseEvent event) throws IOException { 
         labelBoxThreeV.setVisible(true); 
         openBox3.setVisible(true);        
         closeBox3.setVisible(false);
       
    
    }
     public void open3(MouseEvent event) throws IOException { 
         labelBoxThreeV.setVisible(false); 
         openBox3.setVisible(false);        
         closeBox3.setVisible(true);   
    }
 
/////////////////////////////////////////////////////////////////////////
    
      @FXML
    public void back(MouseEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("StageGame2.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            StageGame2Controller controller = loader.getController();
            controller.initData(newPlayer);
            javafx.stage.Stage window = (javafx.stage.Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene);  
         }
    
      @FXML
    public void close(MouseEvent event) {
    System.exit(0);
        }

     public void initData(Player player) {
        VaribaleNameOne.setVisible(false);
        VaribleValueOne.setVisible(false);
        
        //     (  BOX 1  )
        openBox1.setVisible(false);
        closeBox1.setVisible(false);
        nameBoxOne.setVisible(false);
        valueBoxOne.setVisible(false); 
        doneCreate1.setVisible(false);
        
        //     (  BOX 2  ) 
        openBox2.setVisible(false);
        closeBox2.setVisible(false);
        nameBoxTwo.setVisible(false);
        valueBoxTwo.setVisible(false);
        doneCreate2.setVisible(false);
        
        //     (  BOX 3  ) 
        openBox3.setVisible(false);
        closeBox3.setVisible(false);
        nameBoxThree.setVisible(false);
        valueBoxThree.setVisible(false);
        doneCreate3.setVisible(false);
        
        
        newPlayer = player;
        newPlayer.setName(player.getName());
        newPlayer.setAwardName(player.getAwardName());
        newPlayer.setAwards(player.getAwards());
        newPlayer.setEmail(player.getEmail());
        newPlayer.setLevel(player.getLevel());
        newPlayer.setLevelCode(player.getLevelCode());
        newPlayer.setPassword(player.getPassword());
        newPlayer.setUsername(player.getUsername());

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
