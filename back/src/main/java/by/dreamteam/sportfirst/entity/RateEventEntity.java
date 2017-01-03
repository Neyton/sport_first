package by.dreamteam.sportfirst.entity;

import javax.persistence.*;


@Entity
@Table(name = "rate_event", schema = "sports_betting")
public class RateEventEntity {
    private int id;
    private Double kf;
    private TypeRateEntity type;
    private EventsEntity event;

    public RateEventEntity(int id, Double kf, TypeRateEntity type, EventsEntity event) {
        this.id = id;
        this.kf = kf;
        this.type = type;
        this.event = event;
    }

    public RateEventEntity() {

    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "kf", nullable = true, precision = 0)
    public Double getKf() {
        return kf;
    }

    public void setKf(Double kf) {
        this.kf = kf;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id")
    public TypeRateEntity getType() {
        return type;
    }

    public void setType(TypeRateEntity type) {
        this.type = type;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id")
    public EventsEntity getEvent() {
        return event;
    }

    public void setEvent(EventsEntity event) {
        this.event = event;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RateEventEntity that = (RateEventEntity) o;

        if (id != that.id) return false;
        if (kf != null ? !kf.equals(that.kf) : that.kf != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (kf != null ? kf.hashCode() : 0);
        return result;
    }
}
