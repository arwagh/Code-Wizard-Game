package login;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="PLAYER")
public class Player {
 
@Id
@Column(name="username")    
private String username;

@Column(name="password") 
private String password;

@Column(name="name") 
private String name;

@Transient
private Level level;

@Column(name="level") 
private int levelCode;

@Transient
private ArrayList<Award> awards;

@Column(name="award") 
private String awardName ; 

@Column(name="email") 
private String email ; 

@Column(name="score") 
private double score;



    public Player(String username) {
        this.username = username;
    }

    public Player() {
    }

    public Player(String username, String password) {
        this.username = username;
        this.password = password;
    }
    

    public Player(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public Player(Level level) {
        this.level = level;
    }

    public Player(String username, String password, String name, Level level, ArrayList<Award> awards, double score) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.level = level;
        this.awards = awards;
        this.score = score;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

   

    public ArrayList<Award> getAwards() {
        return awards;
    }

    public double getScore() {
        return score;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public void setAwards(ArrayList<Award> awards) {
        this.awards = awards;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public int getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(int levelCode) {
        this.levelCode = levelCode;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


    
    
    
}

