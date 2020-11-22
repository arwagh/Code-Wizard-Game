package login;
import javafx.scene.image.Image;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "AWARD")
public class Award {
    
    @Id
    @Column(name = "AwardName")
    private String name;
    
    @Column(name = "AwardImage")
    private String award ; 
    
    @Transient
    private Image image;
    
    
    //private Challenge challenge;

    public Award() {
    }

    public Award(String name) {
        this.name = name;
    }

    public Award(String name, Image image) {
        this.name = name;
        this.image = image;
    }
    
    /*public Award(String name, Image image, Challenge challenge) {
        this.name = name;
        this.image = image;
        this.challenge = challenge;
    }*/

    public String getName() {
        return name;
    }

    public Image getImage() {
        return image;
    }

    

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    /*public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }
    public Challenge getChallenge() {
        return challenge;
    }*/
    
    
    
    
}