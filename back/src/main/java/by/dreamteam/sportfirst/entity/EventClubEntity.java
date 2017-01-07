package by.dreamteam.sportfirst.entity;

import javax.persistence.*;

/**
 * Created by Neyton on 07.01.2017.
 */
@Entity
@Table(name = "event_club", schema = "sports_betting")
public class EventClubEntity {

    private Integer idEvent;
    private Integer idClub;
    private EventEntity eventByIdEvent;
    private ClubEntity clubByIdClub;

    @Basic
    @Column(name = "id_event", nullable = true)
    public Integer getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Integer idEvent) {
        this.idEvent = idEvent;
    }

    @Basic
    @Column(name = "id_club", nullable = true)
    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventClubEntity that = (EventClubEntity) o;

        if (idEvent != null ? !idEvent.equals(that.idEvent) : that.idEvent != null) return false;
        if (idClub != null ? !idClub.equals(that.idClub) : that.idClub != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEvent != null ? idEvent.hashCode() : 0;
        result = 31 * result + (idClub != null ? idClub.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_event", referencedColumnName = "id_event")
    public EventEntity getEventByIdEvent() {
        return eventByIdEvent;
    }

    public void setEventByIdEvent(EventEntity eventByIdEvent) {
        this.eventByIdEvent = eventByIdEvent;
    }

    @ManyToOne
    @JoinColumn(name = "id_club", referencedColumnName = "id_club")
    public ClubEntity getClubByIdClub() {
        return clubByIdClub;
    }

    public void setClubByIdClub(ClubEntity clubByIdClub) {
        this.clubByIdClub = clubByIdClub;
    }

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
