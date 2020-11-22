
package login;

import com.jfoenix.controls.JFXButton;
import javafx.scene.input.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {
    ArrayList<Command> sol = new ArrayList<>();
    ArrayList<Command> playerSol = new ArrayList<>();
    
    //set the player in log in action :)
    Player player = new Player(new Level(2));
    int levelTemp = 2;
    
    @FXML
    private AnchorPane rootPane;
    
    @FXML
    private HBox hboxGame;
    
    @FXML
    private Label label;
    @FXML
    private JFXButton submitButton;
    
    @FXML
    private AnchorPane gamePane;
    
     @FXML
    private AnchorPane innerPane;
     
     @FXML
     private JFXButton stage1Bt;
         
    @FXML
    private AnchorPane tempPane;
    
    @FXML
    private JFXButton game1;
    
    @FXML
    private JFXButton game2;
    
     @FXML
    private JFXButton stage5Bt;
     
     @FXML
    private ImageView stage5BtLock;
     @FXML
    private StackPane stage5BtLockStack;
     
     @FXML
     private ImageView backArrow;
     
     @FXML
     private HBox cmdsPane;
     
       @FXML
    private void toGames(ActionEvent event) throws IOException {
           AnchorPane pane = FXMLLoader.load(getClass().getResource("Games.fxml"));
           Scene gameScene = new Scene(pane);
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();  
          
           window.setScene(gameScene);
           window.show();
           System.out.println("Games!");
        
           if(backArrow==null) {
           System.out.println("NULL");
           }
    }
    
        @FXML
        private void startPlaying(ActionEvent event) throws IOException {
           AnchorPane pane = FXMLLoader.load(getClass().getResource("StartPlaying.fxml"));
           Scene gameScene = new Scene(pane);
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
           window.setScene(gameScene);
           window.show();
           //tempPane.getChildren().setAll(pane);
           System.out.println("");
           
                       
            Command cmd1 = new Command(new JFXButton("تحرك للأمام"));
            Command cmd2 = new Command(new JFXButton(("تحرك لليمين")));
            Command cmd3 = new Command(new JFXButton(("تحرك لليمين")));
            sol.add(cmd1);
            sol.add(cmd2);
            sol.add(cmd3);
                      
          
     
        
        Font font = Font.font("☞Tanseek Modern Pro Arabic Bold", 20); 
               
         // rootPane.getChildren().setAll(pane);
    ///   pane.getChildren().setAll(new Text("YESSS"));
         HBox root = new HBox();

    ///    Scene scene = new Scene(root, 800, 600, Color.rgb(160, 160, 160));

        DragDropHandler dragDropHandler = new DragDropHandler();
        
   /////    final int numNodes   =  6; // number of nodes to add
        final double spacing = 5; // spacing between nodes
        
       
        final JFXButton node1 = new JFXButton("تحرك لليمين");
        final JFXButton node2 = new JFXButton("تحرك للأمام");
        final JFXButton node3 = new JFXButton("تحرك لليمين");
        
        final JFXButton node4 = new JFXButton("");
        final JFXButton node5 = new JFXButton("");
        final JFXButton node6 = new JFXButton("");
        
        ArrayList<JFXButton> givenNodes = new ArrayList<>();
        givenNodes.add(node1);
        givenNodes.add(node2);
        givenNodes.add(node3);
        
        
        ArrayList<JFXButton> playerNodes = new ArrayList<>();
        playerNodes.add(node4);
        playerNodes.add(node5);
        playerNodes.add(node6);
        
        for(int i = 0; i < givenNodes.size(); i++) {
         givenNodes.get(i).setLayoutX(388.0);
           givenNodes.get(i).setLayoutY(462.0);
           givenNodes.get(i).setPrefHeight(39.0);
           givenNodes.get(i).setPrefWidth(162.0);
           givenNodes.get(i).setStyle("-fx-background-color: #e64072; -fx-border-radius: 5cm; -fx-background-radius: 5cm; ");
           givenNodes.get(i).setAlignment(Pos.CENTER);
           givenNodes.get(i).setTextFill(Color.WHITE);
           givenNodes.get(i).setFont(font);
           
           playerNodes.get(i).setLayoutX(388.0);
           playerNodes.get(i).setLayoutY(462.0);
           playerNodes.get(i).setPrefHeight(39.0);
           playerNodes.get(i).setPrefWidth(162.0);
           playerNodes.get(i).setStyle("-fx-background-color: #e64072; -fx-border-radius: 5cm; -fx-background-radius: 5cm;");
           playerNodes.get(i).setAlignment(Pos.CENTER);
           playerNodes.get(i).setTextFill(Color.WHITE);
           playerNodes.get(i).setFont(font);
           
        }

        VBox vbox1 = new VBox();
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setSpacing(10);
        vbox1.getChildren().addAll(node1,node2,node3);
        
        VBox vbox2 = new VBox();
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setSpacing(10);
        
        Button doneBt = new Button("Done");
        doneBt.setLayoutX(388.0);
        doneBt.setLayoutY(462.0);
        doneBt.setPrefHeight(39.0);
        doneBt.setPrefWidth(162.0);
        doneBt.setStyle("-fx-background-color: #e64072; -fx-border-radius: 5cm; -fx-background-radius: 5cm;");
        doneBt.setAlignment(Pos.CENTER);
        doneBt.setTextFill(Color.WHITE);
        doneBt.setFont(font);
        vbox2.getChildren().addAll(node4,node5,node6, doneBt);
        
       root.setAlignment(Pos.CENTER);
       root.setSpacing(10);
       root.getChildren().addAll(vbox1,vbox2);
       pane.getChildren().add(root);
       
        givenNodes.get(0).setOnDragDetected(dragDropHandler.myHandlerDetected);
        givenNodes.get(1).setOnDragDetected(dragDropHandler.myHandlerDetected);
        givenNodes.get(2).setOnDragDetected(dragDropHandler.myHandlerDetected);
        
        playerNodes.get(0).setOnDragDetected(dragDropHandler.myHandlerDetected);
        playerNodes.get(1).setOnDragDetected(dragDropHandler.myHandlerDetected);
        playerNodes.get(2).setOnDragDetected(dragDropHandler.myHandlerDetected);
        
        playerNodes.get(0).setOnDragOver(dragDropHandler.myHandlerOver);
        playerNodes.get(1).setOnDragOver(dragDropHandler.myHandlerOver);
        playerNodes.get(2).setOnDragOver(dragDropHandler.myHandlerOver);
        
        givenNodes.get(0).setOnDragOver(dragDropHandler.myHandlerOver);
        givenNodes.get(1).setOnDragOver(dragDropHandler.myHandlerOver);
        givenNodes.get(2).setOnDragOver(dragDropHandler.myHandlerOver);
        
        playerNodes.get(0).setOnDragEntered(dragDropHandler.myHandlerEntered);
        playerNodes.get(1).setOnDragEntered(dragDropHandler.myHandlerEntered);
        playerNodes.get(2).setOnDragEntered(dragDropHandler.myHandlerEntered);
        
        givenNodes.get(0).setOnDragEntered(dragDropHandler.myHandlerEntered);
        givenNodes.get(1).setOnDragEntered(dragDropHandler.myHandlerEntered);
        givenNodes.get(2).setOnDragEntered(dragDropHandler.myHandlerEntered);
        
        playerNodes.get(0).setOnDragDropped(dragDropHandler.myHandlerDropped);
        playerNodes.get(1).setOnDragDropped(dragDropHandler.myHandlerDropped);
        playerNodes.get(2).setOnDragDropped(dragDropHandler.myHandlerDropped);
        
        givenNodes.get(0).setOnDragDropped(dragDropHandler.myHandlerDropped);
        givenNodes.get(1).setOnDragDropped(dragDropHandler.myHandlerDropped);
        givenNodes.get(2).setOnDragDropped(dragDropHandler.myHandlerDropped);
        
        playerNodes.get(0).setOnDragExited(dragDropHandler.myHandlerExited);
        playerNodes.get(1).setOnDragExited(dragDropHandler.myHandlerExited);
        playerNodes.get(2).setOnDragExited(dragDropHandler.myHandlerExited);
        
        givenNodes.get(0).setOnDragExited(dragDropHandler.myHandlerExited);
        givenNodes.get(1).setOnDragExited(dragDropHandler.myHandlerExited);
        givenNodes.get(2).setOnDragExited(dragDropHandler.myHandlerExited);
        
        playerNodes.get(0).setOnDragDone(dragDropHandler.myHandlerDone);
        playerNodes.get(1).setOnDragDone(dragDropHandler.myHandlerDone);
        playerNodes.get(2).setOnDragDone(dragDropHandler.myHandlerDone);
        
        givenNodes.get(0).setOnDragDone(dragDropHandler.myHandlerDone);
        givenNodes.get(1).setOnDragDone(dragDropHandler.myHandlerDone);
        givenNodes.get(2).setOnDragDone(dragDropHandler.myHandlerDone);
        
        dragDropHandler.setPlayerArr(playerSol);
        playerSol = dragDropHandler.getPlayerArr(playerSol);
        
         if(player.getLevel().getCode()<=2) {
            stage5Bt.setDisable(false);
           //StackPane tempPane = (StackPane)stage5BtLock.getParent();
           //tempPane.getChildren().remove(stage5BtLock);
          ///// stage5BtLockStack.getChildren().add(new ImageView(new Image("/images/lock4.png")));
            }
         
      //  pane.getChildren().addAll(vbox1,vbox2);
        
     //   COUNT:
        doneBt.setOnAction(e->{
         for(int i = 0; i < sol.size(); i++) {
             playerSol.clear();
             
             playerSol.add(new Command(new JFXButton(node4.getText())));
             playerSol.add(new Command(new JFXButton(node5.getText())));
             playerSol.add(new Command(new JFXButton(node6.getText())));
        }
        for(int i = 0; i < sol.size(); i++) {
        if(sol.get(i).getBt().getText().equalsIgnoreCase(playerSol.get(i).getBt().getText()))
            continue;
        else {
            System.out.println("You Lose :(");
            return;
        }
     
        }
        System.out.println("You Win :D!");
       /* 
         AnchorPane pane2 = null;
                try {
                    pane2 = FXMLLoader.load(getClass().getResource("Stage.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
        rootPane.getChildren().setAll(pane2);
        System.out.println("Stages");
        */
        });
        
          
//        rootPane.getChildren().setAll(pane4);
        }
    
     @FXML
    private void howToPlay(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Main menu.fxml"));
         Scene gameScene = new Scene(pane);
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
           window.setScene(gameScene);
           window.show();
        System.out.println("howToPlay");
        
      
    }
    
    @FXML
    private void toMainMenu(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Main menu.fxml"));
         Scene gameScene = new Scene(pane);
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
           window.setScene(gameScene);
           window.show();
        System.out.println("TO MAIN MENU ACTION");
        
        
    }
    
     @FXML
    private void toMainMenuArrow(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Main menu.fxml"));
        Scene gameScene = new Scene(pane);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(gameScene);
        window.show();
        System.out.println("TO MAIN MENU MOUSE");
        
        
    }
    
    @FXML
    private void toLogin(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Login.fxml"));
         Scene gameScene = new Scene(pane);
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
           window.setScene(gameScene);
           window.show();
    }
    
    @FXML
    private void toLogin2(MouseEvent  event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Login.fxml"));
         Scene gameScene = new Scene(pane);
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
           window.setScene(gameScene);
           window.show();
    }
    
    @FXML
    private void toMyProfile(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("My profile.fxml"));
         Scene gameScene = new Scene(pane);
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
           window.setScene(gameScene);
           window.show();
    }
    
    @FXML
    private void toSignup(MouseEvent event) throws IOException {
       AnchorPane pane = FXMLLoader.load(getClass().getResource("signup.fxml"));
         Scene gameScene = new Scene(pane);
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
           window.setScene(gameScene);
           window.show();
    }
      @FXML
    private void stages(ActionEvent event) throws IOException {
           FlowPane pane = FXMLLoader.load(getClass().getResource("Stage.fxml"));
           Scene gameScene = new Scene(pane);
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
          
           window.setScene(gameScene);
           window.show();
        
      
    }
    /*
    @FXML
     private void toStage(ActionEvent event) throws IOException {
        HBox pane3 = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        rootPane.getChildren().setAll(pane3);
        System.out.println("Game itself");
        
      
    }*/

    
     @FXML
    public void close(MouseEvent event) {
    System.exit(0);
   }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
