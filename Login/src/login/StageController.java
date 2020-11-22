
package login;

import java.time.LocalTime;
import com.jfoenix.controls.JFXButton;
import javafx.scene.input.MouseEvent;
import java.io.IOException;
import java.net.URL;
import static java.time.temporal.ChronoUnit.SECONDS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;


public class StageController implements Initializable {
    
        Timeline time=new Timeline();

                Game newGame = new Game();
                Player newPlayer = new Player();
                Stage stage = new Stage();

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
         public static  Group temp = new Group();


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

         
            static HBox rootG1S1 = new HBox();
            
            static HBox rootG1S2 = new HBox();

            static HBox rootG1S3 = new HBox();

            static VBox vbox1 = new VBox();

            static VBox vbox2 = new VBox();
    
    
    ArrayList<Command> sol = new ArrayList<>();
    ArrayList<Command> playerSol = new ArrayList<>();
    
    //set the player in log in action :)
    Player player = new Player(new Level(2));
    int levelTemp = 2;
    
   AnchorPane startPlayingPane;
   Scene startPlayingScene;
   Stage startPlayingStage;
   

    LocalTime startTime;
    LocalTime endTime;
    protected long gameTime;

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
     private ImageView stage2Bt;
     @FXML
     private ImageView stage3Bt;
     @FXML
     private ImageView stage4Bt;
     @FXML
     private ImageView stage5Bt;
     @FXML
     private ImageView lock2;
         
     @FXML
     private ImageView lock3;
         
     @FXML
     private ImageView lock4;
         
     @FXML
     private ImageView lock5;
         
         
    @FXML
    private AnchorPane tempPane;
    
    @FXML
    private JFXButton game1;
    
    @FXML
    private JFXButton game2;
    

     @FXML
    private ImageView stage5BtLock;
     @FXML
    private StackPane stage5BtLockStack;
     
     @FXML
     private ImageView backArrow;
     
     @FXML
     private HBox cmdsPane;
     @FXML
     private Label stage1Lb;
     @FXML
     private Label playerScoreLb;
     
     @FXML
     private ImageView playBack;
     
     @FXML
     private ImageView playBack2;
     
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
        private void startPlaying(MouseEvent event) throws IOException {
           
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("StartPlaying.fxml"));
            startPlayingPane = loader.load();
            Scene scene = new Scene(startPlayingPane);
            StartPlayingController controller = loader.getController();
            controller.initData(newPlayer);
            controller.setStage(1);
            
            if (Login.mute == false) { playAudioStage(); }
       
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
           window.show();
           
           if (Login.mute == false) { playAudioQ1(); }
           
           
           rootG1S1.getChildren().clear();
           vbox1.getChildren().clear();
           vbox2.getChildren().clear();
           temp.getChildren().clear();
           startTime = LocalTime.now();
           ArrayList<Command> allGivenCmds = new ArrayList<Command>();
           allGivenCmds.add(new Command(new JFXButton("تحرك للأمام")));
           allGivenCmds.add(new Command(new JFXButton("تحرك للأمام")));
           allGivenCmds.add(new Command(new JFXButton("تحرك للأمام")));
           allGivenCmds.add(new Command(new JFXButton("تحرك للخلف")));
           allGivenCmds.add(new Command(new JFXButton("تحرك للأمام")));
           allGivenCmds.add(new Command(new JFXButton("تحرك للخلف")));
           allGivenCmds.add(new Command(new JFXButton("تحرك للأمام")));
           
          
           
                       
            Command cmd1 = new Command(new JFXButton("تحرك للأمام"));
            Command cmd2 = new Command(new JFXButton(("تحرك للأمام")));
            Command cmd3 = new Command(new JFXButton(("تحرك للأمام")));
            
            sol.add(cmd1);
            sol.add(cmd2);
            sol.add(cmd3);
     
          

        
        Font font = Font.font("☞Tanseek Modern Pro Arabic Bold", 20); 
               
     
        DragDropHandler dragDropHandler = new DragDropHandler();
        
  
        
        ArrayList<Command> givenNodes = new ArrayList<>();
        ArrayList<Command> playerNodes = new ArrayList<>();
        
        givenNodes.add(new Command(new JFXButton("تحرك للأمام")));
        givenNodes.add(new Command(new JFXButton("تحرك للأمام")));
        givenNodes.add(new Command(new JFXButton("تحرك للأمام")));
        givenNodes.add(new Command(new JFXButton("تحرك للخلف")));

        Random randomGenerator = new Random();
        for(int i = 0; i < 2; i++) {
            System.out.println("Random loop");
           Command cmd = allGivenCmds.get((randomGenerator.nextInt(5) + 0));
           if(!(givenNodes.contains(cmd))) {
           givenNodes.add(cmd);
           }
           else {
           i--;
           }
        
        }
       Collections.shuffle(givenNodes);
        playerNodes.add(new Command(new JFXButton("")));
        playerNodes.add(new Command(new JFXButton("")));
        playerNodes.add(new Command(new JFXButton("")));

        vbox1.setAlignment(Pos.CENTER);
        vbox1.setSpacing(10);
      
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setSpacing(10);
         Button doneBt = new Button("تم");
        doneBt.setLayoutX(388.0);
        doneBt.setLayoutY(462.0);
        doneBt.setPrefHeight(39.0);
        doneBt.setPrefWidth(162.0);
        doneBt.setStyle("-fx-background-color: #ff7896; -fx-border-radius: 5cm; -fx-background-radius: 5cm;");
        doneBt.setAlignment(Pos.CENTER);
        doneBt.setTextFill(Color.WHITE);
        doneBt.setFont(font);
     
               for(int i = 0; i < playerNodes.size(); i++) {
                   System.out.println("Player nodes loop: " + i);
               playerNodes.get(i).getBt().setId(String.valueOf(i));
               if(i>=1) 
               playerNodes.get(i).getBt().setDisable(true);
               System.out.println("is button " + i + "disabled? " + playerNodes.get(i).getBt().isDisabled());
               playerNodes.get(i).getBt().setOnDragDetected(dragDropHandler.myHandlerDetected);
               
               playerNodes.get(i).getBt().setOnDragOver(dragDropHandler.myHandlerOver);
               
               playerNodes.get(i).getBt().setOnDragEntered(dragDropHandler.myHandlerEntered);

               playerNodes.get(i).getBt().setOnDragDropped(dragDropHandler.myHandlerDropped);
              
               playerNodes.get(i).getBt().setOnDragExited(dragDropHandler.myHandlerExited);
                          
               playerNodes.get(i).getBt().setOnDragDone(dragDropHandler.myHandlerDone);
                            
               vbox2.getChildren().add(playerNodes.get(i).getBt());
               }
               
               for(int i = 0; i < givenNodes.size(); i++) {
               System.out.println("Given nodes loop: " + i);
               givenNodes.get(i).getBt().setId(String.valueOf(i));
               givenNodes.get(i).getBt().setOnDragDetected(dragDropHandler.myHandlerDetected);              
                               
               givenNodes.get(i).getBt().setOnDragOver(dragDropHandler.myHandlerOver);
             
               givenNodes.get(i).getBt().setOnDragEntered(dragDropHandler.myHandlerEntered);

               givenNodes.get(i).getBt().setOnDragDropped(dragDropHandler.myHandlerDropped);
                           
               givenNodes.get(i).getBt().setOnDragExited(dragDropHandler.myHandlerExited);
                         
               givenNodes.get(i).getBt().setOnDragDone(dragDropHandler.myHandlerDone);
                
               vbox1.getChildren().add(givenNodes.get(i).getBt());
               }
               vbox2.getChildren().add(doneBt);
      
        for(int i = 0; i < givenNodes.size(); i++) {
           givenNodes.get(i).getBt().setLayoutX(388.0);
           givenNodes.get(i).getBt().setLayoutY(462.0);
           givenNodes.get(i).getBt().setPrefHeight(39.0);
           givenNodes.get(i).getBt().setPrefWidth(162.0);
           givenNodes.get(i).getBt().setStyle("-fx-background-color: #ff7896; -fx-border-radius: 5cm; -fx-background-radius: 5cm; ");
           givenNodes.get(i).getBt().setAlignment(Pos.CENTER);
           givenNodes.get(i).getBt().setTextFill(Color.WHITE);
           givenNodes.get(i).getBt().setFont(font);
           
           
        }
        
        for(int i = 0; i < playerNodes.size(); i++) {
         playerNodes.get(i).getBt().setLayoutX(388.0);
           playerNodes.get(i).getBt().setLayoutY(462.0);
           playerNodes.get(i).getBt().setPrefHeight(39.0);
           playerNodes.get(i).getBt().setPrefWidth(162.0);
           playerNodes.get(i).getBt().setStyle("-fx-background-color: #ff7896; -fx-border-radius: 5cm; -fx-background-radius: 5cm;");
           playerNodes.get(i).getBt().setAlignment(Pos.CENTER);
           playerNodes.get(i).getBt().setTextFill(Color.WHITE);
           playerNodes.get(i).getBt().setFont(font);
        }

        
       
       rootG1S1.getChildren().addAll(vbox1,vbox2);
       rootG1S1.setLayoutX(50);
       rootG1S1.setLayoutY(250);
       temp.getChildren().add(cat);
       startPlayingPane.getChildren().add(temp);

   
       startPlayingPane.getChildren().add(rootG1S1);

        dragDropHandler.setPlayerArr(playerSol);
        dragDropHandler.setAnimtation(controller);
        playerSol = dragDropHandler.getPlayerArr(playerSol);
      
        doneBt.setOnAction(e->{
         
            gameTime = 0;
            endTime = LocalTime.now();
            gameTime = SECONDS.between(startTime, endTime);
            System.out.println("You spent " + gameTime + " seconds on the game");
            
        try {
        for(int i = 0; i < sol.size(); i++) {          
        if(sol.get(i).getBt().getText().equalsIgnoreCase(playerNodes.get(i).getBt().getText()))
            continue;
        else {
           
             System.out.println("You Lose :(");
             Stage loseStage; 
             Parent loseRoot = null;
             Scene loseScene;
            loseStage = new Stage();
               try {
            FXMLLoader loseLoader = new FXMLLoader();
            loseLoader.setLocation(getClass().getResource("losingWindow.fxml"));
            loseRoot = (AnchorPane) loseLoader.load();
            loseScene = new Scene(loseRoot);
            
            if (Login.mute == false) { playAudioLose(); }
            
            LosingWindowController loseController = loseLoader.getController();
            System.out.println("At losing " + newPlayer.getScore());
            newPlayer.setScore(newPlayer.getScore());
            loseController.initData(newPlayer);
            System.out.println("After calling losing init");
            loseStage.setScene(loseScene);
            loseStage.initModality(Modality.APPLICATION_MODAL);
            loseStage.setResizable(false);
            loseStage.showAndWait();
            
               } catch (IOException ex) {
                   Logger.getLogger(StageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
               }

    if(!(loseStage.isShowing())) {
        System.out.println("Inside not showing");
         AnchorPane stageLosePane;
         FXMLLoader stageLoaderLose = new FXMLLoader();
                try {
            stageLoaderLose.setLocation(getClass().getResource("Stage.fxml"));
            stageLosePane = stageLoaderLose.load();
            Scene stageSceneLose = new Scene(stageLosePane);
            StageController controller2 = stageLoaderLose.getController();
            controller2.initData(newPlayer);
                        
                    window.setScene(stageSceneLose);
                    window.show();
        
                } catch (IOException ex) {
                    Logger.getLogger(StageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
           
    }
            return;
        }
     
        }
        }
        catch(Exception exp) {
        System.out.println("Solution is empty");
        }
         System.out.println("You Win :D!");
        Stage winStage = null; 
            Parent winRoot = null;
            Scene sceneWin = null;
               try {
            winStage = new Stage();
            FXMLLoader winLoader = new FXMLLoader();
            winLoader.setLocation(getClass().getResource("winningWindow.fxml"));
            winRoot = winLoader.load();
            sceneWin = new Scene(winRoot);
       
            if (Login.mute == false) { playAudioWin(); }
            
            WinningWindowController winController = winLoader.getController();
            newPlayer.setScore(newPlayer.getScore()+20);
            System.out.println("At winning " + newPlayer.getScore());
            
            //Update Player Score in DB
           

            winController.initData(newPlayer);
            winController.updateLeve(newPlayer, 1);
                     winStage.setScene(sceneWin);
            winStage.initModality(Modality.APPLICATION_MODAL);
            winStage.setResizable(false);
            winStage.showAndWait();
               } catch (IOException ex) {
                   Logger.getLogger(WinningWindowController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
               }
          
        
  
        
      if(!(winStage.isShowing())) {
        System.out.println("Inside not showing");
         AnchorPane stageWinPane;
         FXMLLoader stageLoaderWin = new FXMLLoader();
                try {
            stageLoaderWin.setLocation(getClass().getResource("Stage.fxml"));
            stageWinPane = stageLoaderWin.load();
            Scene stageSceneWin = new Scene(stageWinPane);
            StageController controller2 = stageLoaderWin.getController();
            controller2.initData(newPlayer);
                             
                    window.setScene(stageSceneWin);
                    window.show();
        
                } catch (IOException ex) {
                    Logger.getLogger(StageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
           
    }
           
        });
        
                    
        }

    


    
     @FXML
    public void close(MouseEvent event) {
    System.exit(0);
   }
    
    @FXML
    public void back(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Games.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            GamesController controller = loader.getController();
            controller.initData(newPlayer);
      
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
           window.show();
        
      
};
      /*   @FXML
    private void toWin(MouseEvent event) throws IOException {
           Stage stage; 
    Parent root;

    stage = new Stage();
    FXMLLoader loader = new FXMLLoader(getClass().getResource("winningWindow.fxml"));
    root = (Parent) loader.load();
    stage.setScene(new Scene(root));
    stage.initModality(Modality.APPLICATION_MODAL);
    stage.setResizable(false);
    stage.showAndWait();
          
    }  */
    
    public void toMainMenu(MouseEvent event) throws IOException {
           AnchorPane pane = FXMLLoader.load(getClass().getResource("Main menu.fxml"));
           Scene mainScene = new Scene(pane);
           Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
           window.setScene(mainScene);
           window.show();
    }
   public void calculateScore(long time) {
   
   }
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          
        cat.setTranslateX(400);
        cat.setTranslateY(270);

        cath.setTranslateX(400);
        cath.setTranslateY(270);
        
        resultGroup.setTranslateX(200);
        resultGroup.setTranslateY(220);
        

        catf.setTranslateX(200);
        catf.setTranslateY(220);

        cati.setTranslateX(200);
        cati.setTranslateY(220);
        
        catl.setTranslateX(-150);
        catl.setTranslateY(-100);
        
        right.add(cat1);
        right.add(cat2);
        right.add(cat3);
        right.add(cat4);
        right.add(cat5);
        right.add(cat6);
        right.add(cat7);
        
         resultTimeline1.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    resultGroup.getChildren().setAll(cat2);
                }
        ));
         
          resultTimeline2.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    resultGroup.getChildren().setAll(cat3);
                }
        ));
          
          resultTimeline3.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    resultGroup.getChildren().setAll(cat4);
                }
        ));
          
          resultTimeline4.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    resultGroup.getChildren().setAll(cat5);
                }
        ));
          resultTimeline5.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    resultGroup.getChildren().setAll(cat6);
                }
        ));
          resultTimeline6.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    resultGroup.getChildren().setAll(cat7);
                }
        ));
           resultTimeline7.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    resultGroup.getChildren().setAll(cath1);
                }
        ));
            resultTimeline8.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    resultGroup.getChildren().setAll(cath2);
                }
        ));
             resultTimeline9.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    resultGroup.getChildren().setAll(cath3);
                }
        ));
          
        resultTimeline1.setCycleCount(1);
        resultTimeline2.setCycleCount(1);
        resultTimeline3.setCycleCount(1);
        resultTimeline4.setCycleCount(1);
        resultTimeline5.setCycleCount(1);
        resultTimeline6.setCycleCount(1);


        
        t.setCycleCount(1);
        t2.setCycleCount(1);
        t3.setCycleCount(Timeline.INDEFINITE);
        t4.setCycleCount(Timeline.INDEFINITE);
        t5.setCycleCount(Timeline.INDEFINITE);
        resultTimeline.setCycleCount(1);
        
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
       // t4.play();
        
              
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

     
    }    
    public void initData(Player player) {
 
    newPlayer = player;
    newPlayer.setName(player.getName());
    newPlayer.setAwardName(player.getAwardName());
    newPlayer.setAwards(player.getAwards());
    newPlayer.setEmail(player.getEmail());
    newPlayer.setLevel(player.getLevel());
    newPlayer.setLevelCode(player.getLevelCode());
    newPlayer.setPassword(player.getPassword());
    newPlayer.setUsername(player.getUsername());
    if(newPlayer.getLevelCode()==4) {
    lock2.setVisible(false);
    lock3.setVisible(false);
    lock4.setVisible(false);
    stage5Bt.setDisable(true);
   }
    else if(newPlayer.getLevelCode()==3) {
    lock2.setVisible(false);
    lock3.setVisible(false);
    stage4Bt.setDisable(true);
    stage5Bt.setDisable(true);
   }
    else if(newPlayer.getLevelCode()==2) {
    lock2.setVisible(false);    
    stage3Bt.setDisable(true);
    stage4Bt.setDisable(true);
    stage5Bt.setDisable(true);
   }
    else if(newPlayer.getLevelCode()==1) {
    stage2Bt.setDisable(true);
    stage3Bt.setDisable(true);
    stage4Bt.setDisable(true);
    stage5Bt.setDisable(true);
   }
    
    
    }
    
     @FXML
        private void startPlayingStage2(MouseEvent event) throws IOException {
             FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("StartPlaying.fxml"));
            startPlayingPane = loader.load();
            Scene scene = new Scene(startPlayingPane);
            StartPlayingController controller = loader.getController();
            controller.initData(newPlayer);
            controller.setStage(2);
            
            if (Login.mute == false) { playAudioStage(); }
           
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
           window.show();
           
           if (Login.mute == false) { playAudioQ2(); }
           
           rootG1S1.getChildren().clear();
           vbox1.getChildren().clear();
           vbox2.getChildren().clear();
           temp.getChildren().clear();
           startTime = LocalTime.now();
           ArrayList<Command> allGivenCmds = new ArrayList<Command>();
           allGivenCmds.add(new Command(new JFXButton("تحرك للأمام")));
           allGivenCmds.add(new Command(new JFXButton("تحرك للأمام")));
           allGivenCmds.add(new Command(new JFXButton("تحرك للأمام")));
           allGivenCmds.add(new Command(new JFXButton("تحرك للخلف")));
           allGivenCmds.add(new Command(new JFXButton("اقفز")));
           allGivenCmds.add(new Command(new JFXButton("تحرك للخلف")));
           allGivenCmds.add(new Command(new JFXButton("اقفز")));
         
            System.out.println("من عند ستيج-ستارت ميثود ");
           
                       
            Command cmd1 = new Command(new JFXButton("تحرك للأمام"));
            Command cmd2 = new Command(new JFXButton(("إذا")));
            Command cmd3 = new Command(new JFXButton(("صخرة")));
            Command cmd4 = new Command(new JFXButton(("اقفز")));
            Command cmd5 = new Command(new JFXButton(("تحرك للأمام")));
            sol.add(cmd1);
            sol.add(cmd2);
            sol.add(cmd3);
            sol.add(cmd4);
            sol.add(cmd5);
          
        Font font = Font.font("☞Tanseek Modern Pro Arabic Bold", 20); 
     
        DragDropHandler dragDropHandler = new DragDropHandler();
  
        ArrayList<Command> givenNodes = new ArrayList<>();
        ArrayList<Command> playerNodes = new ArrayList<>();
        
        givenNodes.add(new Command(new JFXButton("إذا")));
        givenNodes.add(new Command(new JFXButton("اقفز")));
        givenNodes.add(new Command(new JFXButton("تحرك للأمام")));
        givenNodes.add(new Command(new JFXButton("تحرك للأمام")));
        givenNodes.add(new Command(new JFXButton("صخرة")));
        Random randomGenerator = new Random();
        for(int i = 0; i < 2; i++) {
            System.out.println("Random loop");
           Command cmd = allGivenCmds.get((randomGenerator.nextInt(5) + 0));
           if(!(givenNodes.contains(cmd))) {
           givenNodes.add(cmd);
           }
           else {
           i--;
           }
        
        }
        Collections.shuffle(givenNodes);
        playerNodes.add(new Command(new JFXButton("")));
        playerNodes.add(new Command(new JFXButton("")));
        playerNodes.add(new Command(new JFXButton("")));
        playerNodes.add(new Command(new JFXButton("")));
        playerNodes.add(new Command(new JFXButton("")));
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setSpacing(10);
      
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setSpacing(10);
        Button doneBt = new Button("تم");
        doneBt.setLayoutX(388.0);
        doneBt.setLayoutY(462.0);
        doneBt.setPrefHeight(39.0);
        doneBt.setPrefWidth(162.0);
        doneBt.setStyle("-fx-background-color: #ff7896; -fx-border-radius: 5cm; -fx-background-radius: 5cm;");
        doneBt.setAlignment(Pos.CENTER);
        doneBt.setTextFill(Color.WHITE);
        doneBt.setFont(font);
    
               for(int i = 0; i < playerNodes.size(); i++) {
               System.out.println("Player nodes loop: " + i);
               playerNodes.get(i).getBt().setId(String.valueOf(i));
               playerNodes.get(i).getBt().setOnDragDetected(dragDropHandler.myHandlerDetected);
                if(i>=1) 
               playerNodes.get(i).getBt().setDisable(true);
               System.out.println("is button " + i + "disabled? " + playerNodes.get(i).getBt().isDisabled());
               playerNodes.get(i).getBt().setOnDragOver(dragDropHandler.myHandlerOver);
               
               playerNodes.get(i).getBt().setOnDragEntered(dragDropHandler.myHandlerEntered);

               playerNodes.get(i).getBt().setOnDragDropped(dragDropHandler.myHandlerDropped);
              
               playerNodes.get(i).getBt().setOnDragExited(dragDropHandler.myHandlerExited);
                          
               playerNodes.get(i).getBt().setOnDragDone(dragDropHandler.myHandlerDone);
                            
               vbox2.getChildren().add(playerNodes.get(i).getBt());
               }
               
               for(int i = 0; i < givenNodes.size(); i++) {
               System.out.println("Given nodes loop: " + i);
               
               givenNodes.get(i).getBt().setId(String.valueOf(i));
               
               givenNodes.get(i).getBt().setOnDragDetected(dragDropHandler.myHandlerDetected);              
                               
               givenNodes.get(i).getBt().setOnDragOver(dragDropHandler.myHandlerOver);
             
               givenNodes.get(i).getBt().setOnDragEntered(dragDropHandler.myHandlerEntered);

               givenNodes.get(i).getBt().setOnDragDropped(dragDropHandler.myHandlerDropped);
                           
               givenNodes.get(i).getBt().setOnDragExited(dragDropHandler.myHandlerExited);
                         
               givenNodes.get(i).getBt().setOnDragDone(dragDropHandler.myHandlerDone);
                
               vbox1.getChildren().add(givenNodes.get(i).getBt());
               }
               vbox2.getChildren().add(doneBt);
       
        for(int i = 0; i < givenNodes.size(); i++) {
           givenNodes.get(i).getBt().setLayoutX(388.0);
           givenNodes.get(i).getBt().setLayoutY(462.0);
           givenNodes.get(i).getBt().setPrefHeight(39.0);
           givenNodes.get(i).getBt().setPrefWidth(162.0);
           givenNodes.get(i).getBt().setStyle("-fx-background-color: #ff7896; -fx-border-radius: 5cm; -fx-background-radius: 5cm; ");
           givenNodes.get(i).getBt().setAlignment(Pos.CENTER);
           givenNodes.get(i).getBt().setTextFill(Color.WHITE);
           givenNodes.get(i).getBt().setFont(font);
           
           
        }
        
        for(int i = 0; i < playerNodes.size(); i++) {
         playerNodes.get(i).getBt().setLayoutX(388.0);
           playerNodes.get(i).getBt().setLayoutY(462.0);
           playerNodes.get(i).getBt().setPrefHeight(39.0);
           playerNodes.get(i).getBt().setPrefWidth(162.0);
           playerNodes.get(i).getBt().setStyle("-fx-background-color: #ff7896; -fx-border-radius: 5cm; -fx-background-radius: 5cm;");
           playerNodes.get(i).getBt().setAlignment(Pos.CENTER);
           playerNodes.get(i).getBt().setTextFill(Color.WHITE);
           playerNodes.get(i).getBt().setFont(font);
        }

    
       rootG1S1.getChildren().addAll(vbox1,vbox2);
       rootG1S1.setLayoutX(50);
       rootG1S1.setLayoutY(220);
       temp.getChildren().add(cat);
    
       startPlayingPane.getChildren().addAll(temp);
    
        startPlayingPane.getChildren().add(rootG1S1);

        dragDropHandler.setPlayerArr(playerSol);
        dragDropHandler.setAnimtation(controller);
        playerSol = dragDropHandler.getPlayerArr(playerSol);
       
        doneBt.setOnAction(e->{
       
            gameTime = 0;
            endTime = LocalTime.now();
            gameTime = SECONDS.between(startTime, endTime);
            System.out.println("You spent " + gameTime + " seconds on the game");
         
        try {
        for(int i = 0; i < sol.size(); i++) {          
        if(sol.get(i).getBt().getText().equalsIgnoreCase(playerNodes.get(i).getBt().getText()))
            continue;
        else {
           
             System.out.println("You Lose :(");
             Stage loseStage; 
             Parent loseRoot = null;
             Scene loseScene;
            loseStage = new Stage();
               try {
            FXMLLoader loseLoader = new FXMLLoader();
            loseLoader.setLocation(getClass().getResource("losingWindow.fxml"));
            loseRoot = (AnchorPane) loseLoader.load();
            loseScene = new Scene(loseRoot);
            
            if (Login.mute == false) { playAudioLose(); }
            
            LosingWindowController loseController = loseLoader.getController();
            System.out.println("At losing " + newPlayer.getScore());
            newPlayer.setScore(newPlayer.getScore());
            loseController.initData(newPlayer);
            System.out.println("After calling losing init");
            loseStage.setScene(loseScene);
            loseStage.initModality(Modality.APPLICATION_MODAL);
            loseStage.setResizable(false);
            loseStage.showAndWait();
            
               } catch (IOException ex) {
                   Logger.getLogger(StageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
               }

    if(!(loseStage.isShowing())) {
        System.out.println("Inside not showing");
         AnchorPane stageLosePane;
         FXMLLoader stageLoaderLose = new FXMLLoader();
                try {
            stageLoaderLose.setLocation(getClass().getResource("Stage.fxml"));
            stageLosePane = stageLoaderLose.load();
            Scene stageSceneLose = new Scene(stageLosePane);
            StageController controller2 = stageLoaderLose.getController();
            controller2.initData(newPlayer);
             
                    window.setScene(stageSceneLose);
                    window.show();
        
                } catch (IOException ex) {
                    Logger.getLogger(StageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
           
    }
            return;
        }
     
        }
        }
        catch(Exception exp) {
        System.out.println("Solution is empty");
        }
        System.out.println("You Win :D!");
        Stage winStage = null; 
            Parent winRoot = null;
            Scene sceneWin = null;
               try {
            winStage = new Stage();
            FXMLLoader winLoader = new FXMLLoader();
            winLoader.setLocation(getClass().getResource("winningWindow.fxml"));
             winRoot = winLoader.load();
            sceneWin = new Scene(winRoot);
            
            if (Login.mute == false) { playAudioWin(); }
       
            WinningWindowController winController = winLoader.getController();
            newPlayer.setScore(newPlayer.getScore()+20);
            System.out.println("At winning " + newPlayer.getScore());

            //Update Player Score in DB
           

            winController.initData(newPlayer);
            winController.updateLeve(newPlayer, 2);
                     winStage.setScene(sceneWin);
            winStage.initModality(Modality.APPLICATION_MODAL);
            winStage.setResizable(false);
            winStage.showAndWait();
             
               } catch (IOException ex) {
                   Logger.getLogger(WinningWindowController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
               }
          
        
  
        
    if(!(winStage.isShowing())) {
        System.out.println("Inside not showing");
         AnchorPane stageWinPane;
         FXMLLoader stageLoaderWin = new FXMLLoader();
                try {
            stageLoaderWin.setLocation(getClass().getResource("Stage.fxml"));
            stageWinPane = stageLoaderWin.load();
            Scene stageSceneWin = new Scene(stageWinPane);
            StageController controller2 = stageLoaderWin.getController();
            controller2.initData(newPlayer);
                        
                    window.setScene(stageSceneWin);
                    window.show();
        
                } catch (IOException ex) {
                    Logger.getLogger(StageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
           
    }
           
        });
        
  
        }
        
    
         @FXML
        private void startPlaying3(MouseEvent event) throws IOException {         
            FXMLLoader loader4 = new FXMLLoader();
            loader4.setLocation(getClass().getResource("StartPlaying.fxml"));
            startPlayingPane = loader4.load();
            Scene scene = new Scene(startPlayingPane);
            StartPlayingController controllers2 = loader4.getController();
            controllers2.initData(newPlayer);
            controllers2.setStage(3);
            
            if (Login.mute == false) { playAudioStage(); }

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
           window.show();
           
           if (Login.mute == false) { playAudioQ3(); }
           
           rootG1S3.getChildren().clear();
           vbox1.getChildren().clear();
           vbox2.getChildren().clear();
           temp.getChildren().clear();
           startTime = LocalTime.now();
           ArrayList<Command> allGivenCmds = new ArrayList<Command>();
           allGivenCmds.add(new Command(new JFXButton("تحرك للأمام")));
           allGivenCmds.add(new Command(new JFXButton("تحرك للأمام")));
           allGivenCmds.add(new Command(new JFXButton("تحرك للأمام")));
           allGivenCmds.add(new Command(new JFXButton("تحرك للأمام")));
           allGivenCmds.add(new Command(new JFXButton("اقفز")));
           allGivenCmds.add(new Command(new JFXButton("تكرار")));
           allGivenCmds.add(new Command(new JFXButton("اقفز")));
           
        
            System.out.println("من عند ستيج-ستارت ميثود ");
           
                       
            Command cmd1 = new Command(new JFXButton("تحرك للأمام"));
            Command cmd2 = new Command(new JFXButton(("تكرار")));
            sol.add(cmd1);
            sol.add(cmd2);
          
        Font font = Font.font("☞Tanseek Modern Pro Arabic Bold", 20); 
    

        DragDropHandler dragDropHandler = new DragDropHandler();
  
        ArrayList<Command> givenNodes = new ArrayList<>();
        ArrayList<Command> playerNodes = new ArrayList<>();
        
        givenNodes.add(new Command(new JFXButton("تحرك للأمام")));
        givenNodes.add(new Command(new JFXButton("تكرار")));
        givenNodes.add(new Command(new JFXButton("تحرك للأمام")));
        Random randomGenerator = new Random();
        for(int i = 0; i < 2; i++) {
            System.out.println("Random loop");
           Command cmd = allGivenCmds.get((randomGenerator.nextInt(5) + 0));
           if(!(givenNodes.contains(cmd))) {
           givenNodes.add(cmd);
           }
           else {
           i--;
           }
        
        }
        Collections.shuffle(givenNodes);
        playerNodes.add(new Command(new JFXButton("")));
        playerNodes.add(new Command(new JFXButton("")));
       // playerNodes.add(new Command(new JFXButton("")));

        vbox1.setAlignment(Pos.CENTER);
        vbox1.setSpacing(10);
  
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setSpacing(10);
         Button doneBt = new Button("تم");
        doneBt.setLayoutX(388.0);
        doneBt.setLayoutY(462.0);
        doneBt.setPrefHeight(39.0);
        doneBt.setPrefWidth(162.0);
        doneBt.setStyle("-fx-background-color: #ff7896; -fx-border-radius: 5cm; -fx-background-radius: 5cm;");
        doneBt.setAlignment(Pos.CENTER);
        doneBt.setTextFill(Color.WHITE);
      
               for(int i = 0; i < playerNodes.size(); i++) {
                   System.out.println("Player nodes loop: " + i);
                   playerNodes.get(i).getBt().setId(String.valueOf(i));
                    if(i>=1) 
               playerNodes.get(i).getBt().setDisable(true);
               playerNodes.get(i).getBt().setOnDragDetected(dragDropHandler.myHandlerDetected);
               
               playerNodes.get(i).getBt().setOnDragOver(dragDropHandler.myHandlerOver);
               
               playerNodes.get(i).getBt().setOnDragEntered(dragDropHandler.myHandlerEntered);

               playerNodes.get(i).getBt().setOnDragDropped(dragDropHandler.myHandlerDropped);
              
               playerNodes.get(i).getBt().setOnDragExited(dragDropHandler.myHandlerExited);
                          
               playerNodes.get(i).getBt().setOnDragDone(dragDropHandler.myHandlerDone);
                            
               vbox2.getChildren().add(playerNodes.get(i).getBt());
               }
               
               for(int i = 0; i < givenNodes.size(); i++) {
               System.out.println("Given nodes loop: " + i);
               
               givenNodes.get(i).getBt().setId(String.valueOf(i));

               givenNodes.get(i).getBt().setOnDragDetected(dragDropHandler.myHandlerDetected);              
                               
               givenNodes.get(i).getBt().setOnDragOver(dragDropHandler.myHandlerOver);
             
               givenNodes.get(i).getBt().setOnDragEntered(dragDropHandler.myHandlerEntered);

               givenNodes.get(i).getBt().setOnDragDropped(dragDropHandler.myHandlerDropped);
                           
               givenNodes.get(i).getBt().setOnDragExited(dragDropHandler.myHandlerExited);
                         
               givenNodes.get(i).getBt().setOnDragDone(dragDropHandler.myHandlerDone);
                
               vbox1.getChildren().add(givenNodes.get(i).getBt());
               }
               vbox2.getChildren().add(doneBt);
       
        for(int i = 0; i < givenNodes.size(); i++) {
           givenNodes.get(i).getBt().setId(String.valueOf(i));
           givenNodes.get(i).getBt().setLayoutX(388.0);
           givenNodes.get(i).getBt().setLayoutY(462.0);
           givenNodes.get(i).getBt().setPrefHeight(39.0);
           givenNodes.get(i).getBt().setPrefWidth(162.0);
           givenNodes.get(i).getBt().setStyle("-fx-background-color: #ff7896; -fx-border-radius: 5cm; -fx-background-radius: 5cm; ");
           givenNodes.get(i).getBt().setAlignment(Pos.CENTER);
           givenNodes.get(i).getBt().setTextFill(Color.WHITE);
           givenNodes.get(i).getBt().setFont(font);
                 
        }
        
        for(int i = 0; i < playerNodes.size(); i++) {
         playerNodes.get(i).getBt().setLayoutX(388.0);
           playerNodes.get(i).getBt().setLayoutY(462.0);
           playerNodes.get(i).getBt().setPrefHeight(39.0);
           playerNodes.get(i).getBt().setPrefWidth(162.0);
           playerNodes.get(i).getBt().setStyle("-fx-background-color: #ff7896; -fx-border-radius: 5cm; -fx-background-radius: 5cm;");
           playerNodes.get(i).getBt().setAlignment(Pos.CENTER);
           playerNodes.get(i).getBt().setTextFill(Color.WHITE);
           playerNodes.get(i).getBt().setFont(font);
        }

       rootG1S3.getChildren().addAll(vbox1,vbox2);
       rootG1S3.setLayoutX(50);
       rootG1S3.setLayoutY(250);
       temp.getChildren().add(cat);
       startPlayingPane.getChildren().addAll(temp,rootG1S3);

  
      // startPlayingPane.getChildren().add(rootG1S3);

     

        dragDropHandler.setPlayerArr(playerSol);
        dragDropHandler.setAnimtation(controllers2);
        playerSol = dragDropHandler.getPlayerArr(playerSol);
       
        doneBt.setOnAction(e->{
         
            gameTime = 0;
            endTime = LocalTime.now();
            gameTime = SECONDS.between(startTime, endTime);
            System.out.println("You spent " + gameTime + " seconds on the game");
           
        try {
        for(int i = 0; i < sol.size(); i++) {          
        if(sol.get(i).getBt().getText().equalsIgnoreCase(playerNodes.get(i).getBt().getText()))
            continue;
        else {
             System.out.println("You Lose :(");
             Stage loseStage; 
             Parent loseRoot = null;

            loseStage = new Stage();
            FXMLLoader loseLoader = new FXMLLoader(getClass().getResource("losingWindow.fxml"));
               try {
                   loseRoot = (Parent) loseLoader.load();
               } catch (IOException ex) {
                   Logger.getLogger(StageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
               }
            loseStage.setScene(new Scene(loseRoot));
            
            if (Login.mute == false) { playAudioLose(); }
            
            loseStage.initModality(Modality.APPLICATION_MODAL);
            loseStage.setResizable(false);
            loseStage.showAndWait();
            
   
    if(!(loseStage.isShowing())) {
        System.out.println("Inside not showing");
         AnchorPane stageLosePane;
         FXMLLoader stageLoaderLose = new FXMLLoader();
                try {
            stageLoaderLose.setLocation(getClass().getResource("Stage.fxml"));
            stageLosePane = stageLoaderLose.load();
            Scene stageSceneLose = new Scene(stageLosePane);
            StageController controller2 = stageLoaderLose.getController();
            controller2.initData(newPlayer);
                          
                    window.setScene(stageSceneLose);
                    window.show();
        
                } catch (IOException ex) {
                    Logger.getLogger(StageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
           
    }
            return;
        }
     
        }
        }
        catch(Exception exp) {
        System.out.println("Solution is empty");
        }
        System.out.println("You Win :D!");
        Stage winStage = null; 
            Parent winRoot = null;
            Scene sceneWin = null;
               try {
            winStage = new Stage();
            FXMLLoader winLoader = new FXMLLoader();
            winLoader.setLocation(getClass().getResource("winningWindow.fxml"));
             winRoot = winLoader.load();
            sceneWin = new Scene(winRoot);
            
            if (Login.mute == false) { playAudioWin(); }
            
            
            WinningWindowController winController = winLoader.getController();
            newPlayer.setScore(newPlayer.getScore()+20);
            System.out.println("At winning " + newPlayer.getScore());
 
            winController.initData(newPlayer);
            winController.updateLeve(newPlayer, 3);
             //Update Player Score in DB
           
                     winStage.setScene(sceneWin);
            winStage.initModality(Modality.APPLICATION_MODAL);
            winStage.setResizable(false);
            winStage.showAndWait();
             
               } catch (IOException ex) {
                   Logger.getLogger(WinningWindowController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
               }
          
        
 
    if(!(winStage.isShowing())) {
        System.out.println("Inside not showing");
         AnchorPane stageWinPane;
         FXMLLoader stageLoaderWin = new FXMLLoader();
                try {
            stageLoaderWin.setLocation(getClass().getResource("Stage.fxml"));
            stageWinPane = stageLoaderWin.load();
            Scene stageSceneWin = new Scene(stageWinPane);
            StageController controller2 = stageLoaderWin.getController();
            controller2.initData(newPlayer);
                                
                    window.setScene(stageSceneWin);
                    window.show();
        
                } catch (IOException ex) {
                    Logger.getLogger(StageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
           
    }
           
        });
 
        }
        
        void playAudioWin(){
       AudioClip a1 = new AudioClip(this.getClass().getResource("success1.mp3").toString());
       AudioClip a2 = new AudioClip(this.getClass().getResource("lanaCorrect.m4a").toString());
       a1.play();
       a2.play();
    }
        
void playAudioLose(){
       AudioClip a1 = new AudioClip(this.getClass().getResource("lose2.mp3").toString());
       AudioClip a2 = new AudioClip(this.getClass().getResource("lanaWrong.m4a").toString());
       a1.play();
       a2.play();
    }

void playAudioStage(){
       AudioClip a1 = new AudioClip(this.getClass().getResource("stage.mp3").toString());
       a1.play();
    } 

 void playAudioQ1(){
       AudioClip a1 = new AudioClip(this.getClass().getResource("lanaQ1.m4a").toString());
       a1.play();
    }
     
     void playAudioQ2(){
       AudioClip a1 = new AudioClip(this.getClass().getResource("lanaQ2.m4a").toString());
       a1.play();
    }

void playAudioQ3(){
       AudioClip a1 = new AudioClip(this.getClass().getResource("lanaQ3.m4a").toString());
       a1.play();
    }
    

}
