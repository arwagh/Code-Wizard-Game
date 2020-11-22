
package login;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class PrintStatementController implements Initializable {
    
      Player newPlayer = new Player() ;
    @FXML
    private ImageView backArrow;
    @FXML
    private Text questionnText;
    @FXML
    private Text ScreenCodeText;
    @FXML
    private TextArea printTextArea;
    @FXML
    private ImageView QuestionImage;
    @FXML
    private JFXButton runButton;
    @FXML
    private ImageView QuestionImage2;

    
    @FXML
     private void QUestionMark(MouseEvent event) throws IOException {   
     if(questionnText.getText() == "" ){  
         System.out.println(" IS  NULL");
         questionnText.setText("عند الطباعة نستخدم الأمر (اطبع) ثم يليه قوسين وبينهما نكتب ما نريد أن يظهر على الشاشة  "); 
         QuestionImage2.setVisible(true);
         QuestionImage.setVisible(false);
     }else{
         questionnText.setText(""); 
         System.out.println("IS not NULL ");
         QuestionImage2.setVisible(false);
         QuestionImage.setVisible(true);
     } 
     
     }     
            
            
    @FXML
     private void runPrintStatement(ActionEvent event) throws IOException {             

         System.out.println("RUN PRINT STATEMENT ");
         String textScreen = ScreenCodeText.getText();  
         System.out.println("ScreenCodeText : "+textScreen);
         System.out.println(" TEXTAREA : "+printTextArea.getText());
         ScreenCodeText.setText(printTextArea.getText()); 
      //   ScreenCodeText.textProperty().bind(printTextArea.textProperty());       
       
     
     }
    
    
    
    @FXML
    public void back(MouseEvent event) throws IOException {
        
            System.out.println("BBBBBBAAAAAACCCCCKKKKK");

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
         
        newPlayer = player;
        QuestionImage2.setVisible(false);
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
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
