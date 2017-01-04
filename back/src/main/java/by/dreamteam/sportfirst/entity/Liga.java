package by.dreamteam.sportfirst.entity;


import javax.persistence.*;

@Entity
@Table(name = "liga", schema = "sport_betting")
public class Liga {

    private int id;
    private String name;

    public Liga(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Liga() {
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
