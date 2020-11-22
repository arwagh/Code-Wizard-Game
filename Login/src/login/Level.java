package login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LEVEL")
public class Level {

    @Id
    @Column(name = "code")
    private int code;
    
    
    @Column(name = "LevelName")
    private String name;

    public Level() {
    }

    public Level(int code) {
        this.code = code;
    }

    public Level(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
