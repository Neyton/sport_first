package project.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue
    @Column(name = "id_event")
    private int id_event;

    @Column(name = "name")
    private String name;

    @Column(name = "date")
    private Date date;

    @Column(name = "liga")
    private String liga;

    @Column(name = "result")
    private String result;


    public Event(String name, Date date, String liga, String result) {
        this.name = name;
        this.date = date;
        this.liga = liga;
        this.result = result;
    }

    public Event() {
    }

    public void setId_event(int id_event) {
        this.id_event = id_event;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public void setResult(String result) {
        this.result = result;
    }


    public int getId_event() {

        return id_event;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getLiga() {
        return liga;
    }

    public String getResult() {
        return result;
    }
}

