package login;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="stage")
public class Stage {

@Id
@Column(name="stageId")     
private int number;
private Game game;
private ArrayList<Command> playerSolution;
private ArrayList<Command> solution;

    public Stage() {
    }


    public Stage(int number, Game game) {
        this.number = number;
        this.game = game;
    }


    public Stage(Game game) {
        this.game = game;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public ArrayList<Command> getPlayerSolution() {
        return playerSolution;
    }

    public void setPlayerSolution(ArrayList<Command> playerSolution) {
        this.playerSolution = playerSolution;
    }

    public ArrayList<Command> getSolution() {
        return solution;
    }

    public void setSolution(ArrayList<Command> solution) {
        this.solution = solution;
    }

}