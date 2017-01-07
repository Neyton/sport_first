package by.dreamteam.sportfirst.entity;

import javax.persistence.*;

/**
 * Created by Neyton on 07.01.2017.
 */
@Entity
@Table(name = "rate_event", schema = "sports_betting")
public class RateEventEntity {
    private Integer id;
    private Double kf;
    private Integer eventId;
    private Integer typeId;
    private EventEntity eventByEventId;
    private TypeRateEntity typeRateByTypeId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Basic
    @Column(name = "event_id", nullable = true)
    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "type_id", nullable = true)
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RateEventEntity that = (RateEventEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (kf != null ? !kf.equals(that.kf) : that.kf != null) return false;
        if (eventId != null ? !eventId.equals(that.eventId) : that.eventId != null) return false;
        if (typeId != null ? !typeId.equals(that.typeId) : that.typeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (kf != null ? kf.hashCode() : 0);
        result = 31 * result + (eventId != null ? eventId.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id_event")
    public EventEntity getEventByEventId() {
        return eventByEventId;
    }

    public void setEventByEventId(EventEntity eventByEventId) {
        this.eventByEventId = eventByEventId;
    }

    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    public TypeRateEntity getTypeRateByTypeId() {
        return typeRateByTypeId;
    }

    public void setTypeRateByTypeId(TypeRateEntity typeRateByTypeId) {
        this.typeRateByTypeId = typeRateByTypeId;
    }
}
