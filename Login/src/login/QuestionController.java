/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
/**
 * FXML Controller class
 *
 * @author Arwa
 */
public class QuestionController implements Initializable {
Player newPlayer = new Player();
int stageNew = 0;

@FXML
private Text welcomeTx;
@FXML
private Text questTx;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        // TODO
    }   
    
     public void initData(Player player, int stage) {
    newPlayer = player;
    newPlayer.setName(player.getName());
    newPlayer.setAwardName(player.getAwardName());
    newPlayer.setAwards(player.getAwards());
    newPlayer.setEmail(player.getEmail());
    newPlayer.setLevel(player.getLevel());
    newPlayer.setLevelCode(player.getLevelCode());
    newPlayer.setPassword(player.getPassword());
    newPlayer.setUsername(player.getUsername());
    newPlayer.setScore(player.getScore());
    stageNew = stage;
    
     if(stageNew==2) {
        questTx.setText("اوه لا!!\n" +
"هناك بعض الصخور التي تمنع لانا من الوصول إلى النجمة\n" +
"ساعدوا لانا باستخدام كلمة (إذا) السحرية لتحديد أمر معين يتم تنفيذه عندما تصل لانا إلى الصخور");
        questTx.setStyle( "-fx-font-size: 20px" );
        }
     if(stageNew==3) {
        questTx.setText("والآن لنجرب شيئًا جديدًا\n" +
"عند وضع الكلمة السحرية (تكرار) فإن الجملة السابقة لها ستتكرر، جرب ذلك لتصل للنجمة!");
        questTx.setStyle( "-fx-font-size: 20px" );
        }
     
     
    
    }
     
    
    
}


