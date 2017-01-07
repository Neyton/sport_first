package by.dreamteam.sportfirst.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by Neyton on 07.01.2017.
 */
@Entity
@Table(name = "event", schema = "sports_betting")
public class EventEntity {
    private Integer idEvent;
    private Timestamp date;
    private String name;
    private String result;
    private Integer idTournament;
    private TournamentEntity tournamentByIdTournament;
    private Collection<RateEventEntity> rateEventsByIdEvent;
    private Collection<EventClubEntity> eventClubsByIdEvent;
    private Collection<BetEntity> betsByIdEvent;

    @Id
    @Column(name = "id_event", nullable = false)
    public Integer getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Integer idEvent) {
        this.idEvent = idEvent;
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
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "result", nullable = true, length = 45)
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Basic
    @Column(name = "id_tournament", nullable = true)
    public Integer getIdTournament() {
        return idTournament;
    }

    public void setIdTournament(Integer idTournament) {
        this.idTournament = idTournament;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventEntity that = (EventEntity) o;

        if (idEvent != null ? !idEvent.equals(that.idEvent) : that.idEvent != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;
        if (idTournament != null ? !idTournament.equals(that.idTournament) : that.idTournament != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = idEvent != null ? idEvent.hashCode() : 0;
        result1 = 31 * result1 + (date != null ? date.hashCode() : 0);
        result1 = 31 * result1 + (name != null ? name.hashCode() : 0);
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        result1 = 31 * result1 + (idTournament != null ? idTournament.hashCode() : 0);
        return result1;
    }

    @ManyToOne
    @JoinColumn(name = "id_tournament", referencedColumnName = "id_tournament")
    public TournamentEntity getTournamentByIdTournament() {
        return tournamentByIdTournament;
    }

    public void setTournamentByIdTournament(TournamentEntity tournamentByIdTournament) {
        this.tournamentByIdTournament = tournamentByIdTournament;
    }

    @OneToMany(mappedBy = "eventByEventId")
    public Collection<RateEventEntity> getRateEventsByIdEvent() {
        return rateEventsByIdEvent;
    }

    public void setRateEventsByIdEvent(Collection<RateEventEntity> rateEventsByIdEvent) {
        this.rateEventsByIdEvent = rateEventsByIdEvent;
    }

    @OneToMany(mappedBy = "eventByIdEvent")
    public Collection<EventClubEntity> getEventClubsByIdEvent() {
        return eventClubsByIdEvent;
    }

    public void setEventClubsByIdEvent(Collection<EventClubEntity> eventClubsByIdEvent) {
        this.eventClubsByIdEvent = eventClubsByIdEvent;
    }

    @OneToMany(mappedBy = "eventByIdEvent")
    public Collection<BetEntity> getBetsByIdEvent() {
        return betsByIdEvent;
    }

    public void setBetsByIdEvent(Collection<BetEntity> betsByIdEvent) {
        this.betsByIdEvent = betsByIdEvent;
    }
}
