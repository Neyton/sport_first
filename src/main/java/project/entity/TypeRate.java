package project.entity;


import javax.persistence.*;

@Entity
@Table(name = "type_rate")
public class TypeRate {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public TypeRate(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public TypeRate() {
    }

    public int getId() {
        return id;
    }

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
