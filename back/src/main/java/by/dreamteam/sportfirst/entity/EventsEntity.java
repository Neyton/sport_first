package by.dreamteam.sportfirst.entity;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "events", schema = "sports_betting")
public class EventsEntity {
    private int idEvent;
    private String name;
    private Timestamp date;
    private String liga;
    private String result;

    public EventsEntity(int idEvent, String name, Timestamp date, String liga, String result) {
        this.idEvent = idEvent;
        this.name = name;
        this.date = date;
        this.liga = liga;
        this.result = result;
    }

    public EventsEntity() {
    }


    @Id
    @Column(name = "id_event", nullable = false)
    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "liga", nullable = true, length = 45)
    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    @Basic
    @Column(name = "result", nullable = true, length = 45)
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventsEntity that = (EventsEntity) o;

        if (idEvent != that.idEvent) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (liga != null ? !liga.equals(that.liga) : that.liga != null) return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result1 = idEvent;
        result1 = 31 * result1 + (name != null ? name.hashCode() : 0);
        result1 = 31 * result1 + (date != null ? date.hashCode() : 0);
        result1 = 31 * result1 + (liga != null ? liga.hashCode() : 0);
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        return result1;
    }
}
