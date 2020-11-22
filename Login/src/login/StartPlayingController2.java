
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
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
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
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import javafx.util.Duration;


public class StartPlayingController2 extends Thread implements Initializable {
    
    Player newPlayer = new Player();
    int stageNo = 0;
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
     private ImageView stage1Bt;
         
    @FXML
    private AnchorPane tempPane;
    
    @FXML
    private JFXButton game1;
    
    @FXML
    private JFXButton game2;
    
     @FXML
    private ImageView stage5Bt;
     
     @FXML
    private ImageView stage5BtLock;
     @FXML
    private StackPane stage5BtLockStack;
     
     @FXML
     private ImageView backArrow;
     
     @FXML
     private HBox cmdsPane;
     @FXML
     private ImageView questionMark;
     /*
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
    }*/
      //0000000000000000000000000000000000
       @FXML
    private void toGames(ActionEvent event) throws IOException {
           /*AnchorPane pane = FXMLLoader.load(getClass().getResource("Games.fxml"));
           Scene gameScene = new Scene(pane);
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();  
          
           window.setScene(gameScene);
           window.show();
           System.out.println("Games!");*/
        FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Games.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            GamesController controller = loader.getController();
            controller.initData(newPlayer);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
           window.show();
        
           if(backArrow==null) {
           System.out.println("NULL");
           }
    }
    /*
        @FXML
        private void startPlaying(MouseEvent event) throws IOException {
           AnchorPane pane = FXMLLoader.load(getClass().getResource("StartPlaying.fxml"));
           Scene gameScene = new Scene(pane);
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
           window.setScene(gameScene);
           window.show();
           //tempPane.getChildren().setAll(pane);
           System.out.println("من عند ستارت بلاينج");
           
                       
            Command cmd1 = new Command(new JFXButton("تحرك للأمام"));
            Command cmd2 = new Command(new JFXButton(("تحرك لليمين")));
            Command cmd3 = new Command(new JFXButton(("تحرك لليمين")));
            Command cmd4 = new Command(new JFXButton(("تحرك لليمين")));
            Command cmd5 = new Command(new JFXButton(("تحرك لليمين")));
            sol.add(cmd1);
            //sol.add(cmd2);
            //sol.add(cmd3);
          //  sol.add(cmd4);
        //    sol.add(cmd5);
                      
          
     
        
        Font font = Font.font("☞Tanseek Modern Pro Arabic Bold", 20); 
               
         // rootPane.getChildren().setAll(pane);
    ///   pane.getChildren().setAll(new Text("YESSS"));
         HBox root = new HBox();

    ///    Scene scene = new Scene(root, 800, 600, Color.rgb(160, 160, 160));

        DragDropHandler dragDropHandler = new DragDropHandler();
        
   /////    final int numNodes   =  6; // number of nodes to add
        final double spacing = 5; // spacing between nodes
        
         ArrayList<JFXButton> givenNodes = new ArrayList<>();
        ArrayList<JFXButton> playerNodes = new ArrayList<>();
        VBox vbox1 = new VBox();
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setSpacing(10);
       /// vbox1.getChildren().addAll(node1,node2,node3);
        
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
       /// vbox2.getChildren().addAll(node4,node5,node6, doneBt);
        
               for(int i = 0; i < sol.size(); i++) {
               givenNodes.add(new JFXButton("تحرك للأمام"));
               vbox1.getChildren().add(givenNodes.get(i));
               playerNodes.add(new JFXButton(sol.get(i).getName()));
               vbox2.getChildren().add(playerNodes.get(i));
               }
               vbox2.getChildren().add(doneBt);
        /*
        final JFXButton node1 = new JFXButton("تحرك لليمين");
        final JFXButton node2 = new JFXButton("تحرك للأمام");
        final JFXButton node3 = new JFXButton("تحرك لليمين");
               */
        /*
        final JFXButton node4 = new JFXButton("");
        final JFXButton node5 = new JFXButton("");
        final JFXButton node6 = new JFXButton("");
        */
        /*
        givenNodes.add(node1);
        givenNodes.add(node2);
        givenNodes.add(node3);
        
        
        playerNodes.add(node4);
        playerNodes.add(node5);
        playerNodes.add(node6);
        */
    /*
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

        
       
        
    //   root.setAlignment(Pos.CENTER);
      // root.setSpacing(10);
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
        /*
         //Creating a rotate transition    
      RotateTransition rotateTransition = new RotateTransition(); 
      
      //Setting the duration for the transition 
      rotateTransition.setDuration(Duration.millis(1000)); 
      
      //Setting the node for the transition 
      rotateTransition.setNode(givenNodes.get(0));       
      
      //Setting the angle of the rotation 
      rotateTransition.setByAngle(360); 
      
      //Setting the cycle count for the transition 
      rotateTransition.setCycleCount(50); 
      
      //Setting auto reverse value to false 
      rotateTransition.setAutoReverse(false); 
      
      //Playing the animation 
      rotateTransition.play(); 
      */
    /*
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
     /*    for(int i = 0; i < sol.size(); i++) {
             playerSol.clear();
             
             playerSol.add(new Command(new JFXButton(node4.getText())));
             playerSol.add(new Command(new JFXButton(node5.getText())));
             playerSol.add(new Command(new JFXButton(node6.getText())));
        }*/
    /*
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
    /*
   
    */
    /*
        });
        
          
//        rootPane.getChildren().setAll(pane4);
        }
    */

      @FXML
    private void stages(MouseEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Stage.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            StageController controller = loader.getController();
            controller.initData(newPlayer);
            /*
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Main menu.fxml"));
        Scene gameScene = new Scene(pane);*/
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
           window.show();
        /*
         FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Stage.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            StageController controller = loader.getController();
            controller.initData(newPlayer);*/
            /*
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Main menu.fxml"));
        Scene gameScene = new Scene(pane);*/
            /*
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
           window.show();*/
        /*
           AnchorPane pane = FXMLLoader.load(getClass().getResource("Stage.fxml"));
           Scene gameScene = new Scene(pane);
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            
           window.setScene(gameScene);
           window.show();
        */
        
      
    }
    
     @FXML
    public void close(MouseEvent event) {
    System.exit(0);
   }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      ///  cmdsPane.getChildren().add(new Text("HI"));
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
        
      
  ScaleTransition scaleTransition = 
            new ScaleTransition(Duration.millis(2000), questionMark);
        scaleTransition.setFromX(1);
        scaleTransition.setFromY(1);
        scaleTransition.setToX(1.5);
        scaleTransition.setToY(1.5);
        scaleTransition.setCycleCount(2);
        scaleTransition.setAutoReverse(true);

SequentialTransition sequentialTransition = new SequentialTransition();
sequentialTransition.getChildren().addAll(scaleTransition);
sequentialTransition.setCycleCount(1);
//sequentialTransition.setAutoReverse(true);

sequentialTransition.play();
     
   
    }    
    
   
          @FXML
    private void toQuestion(MouseEvent event) throws IOException {
          Stage stage; 
    Parent root;

    stage = new Stage();
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Question.fxml"));
    root = (Parent) loader.load();
    stage.setScene(new Scene(root));
    stage.initModality(Modality.APPLICATION_MODAL);
    stage.setResizable(false);
    //stage.initOwner(submenuSettings.getScene().getWindow());
    stage.showAndWait();
           System.out.println("Question!");
    }
    
     public void initData(Player player) {
   // newGame = game;
    //newGame.setGameID(game.getGameID());
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
     
     public void setStage(int i) {
     
     }
    }
    
    

