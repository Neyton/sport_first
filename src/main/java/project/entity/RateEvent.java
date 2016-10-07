package project.entity;


import javax.persistence.*;

@Entity
@Table(name = "rate_event")
public class RateEvent {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id")
    private TypeRate type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id")
    private Event event;

    @Column(name = "kf")
    private double kf;

    public RateEvent(int id, TypeRate type, Event event, double kf) {
        this.id = id;
        this.type = type;
        this.event = event;
        this.kf = kf;
    }

    public RateEvent() {
    }

    public int getId() {
        return id;
    }

    public TypeRate getType_id() {
        return type;
    }

    public Event getEvent() {
        return event;
    }

    public double getKf() {
        return kf;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType_id(TypeRate type) {
        this.type = type;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void setKf(double kf) {
        this.kf = kf;
    }
}
