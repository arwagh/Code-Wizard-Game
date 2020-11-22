package login;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table (name="game")
public class Game implements Serializable {

    @Id
    @Column(name="gameId")   
    private int gameID;
    @Column(name="gameName") 
    private String name;
    
    @Transient
    private GameCharacter character;

    public Game() {
    }

    public Game(String name) {
        this.name = name;
    }

    public Game(String name, GameCharacter character) {
        this.name = name;
        this.character = character;
    }
    
    

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameCharacter getCharacter() {
        return character;
    }

    public void setCharacter(GameCharacter character) {
        this.character = character;
    }
    
    
    
    
}