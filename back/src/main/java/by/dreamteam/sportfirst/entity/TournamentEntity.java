package by.dreamteam.sportfirst.entity;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table(name = "tournament", schema = "sports_betting")
public class TournamentEntity {
    private Integer idTournament;
    private String name;
    private Collection<EventEntity> eventsByIdTournament;
    private Collection<ClubTournamentEntity> clubTournamentsByIdTournament;

    public TournamentEntity(Integer idTournament, String name, Collection<EventEntity> eventsByIdTournament, Collection<ClubTournamentEntity> clubTournamentsByIdTournament) {
        this.idTournament = idTournament;
        this.name = name;
        this.eventsByIdTournament = eventsByIdTournament;
        this.clubTournamentsByIdTournament = clubTournamentsByIdTournament;
    }

    public TournamentEntity() {
    }

    @Id
    @Column(name = "id_tournament", nullable = false)
    public Integer getIdTournament() {
        return idTournament;
    }

    public void setIdTournament(Integer idTournament) {
        this.idTournament = idTournament;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TournamentEntity that = (TournamentEntity) o;

        if (idTournament != null ? !idTournament.equals(that.idTournament) : that.idTournament != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTournament != null ? idTournament.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tournamentByIdTournament")
    public Collection<EventEntity> getEventsByIdTournament() {
        return eventsByIdTournament;
    }

    public void setEventsByIdTournament(Collection<EventEntity> eventsByIdTournament) {
        this.eventsByIdTournament = eventsByIdTournament;
    }

    @OneToMany(mappedBy = "tournamentByIdTournament")
    public Collection<ClubTournamentEntity> getClubTournamentsByIdTournament() {
        return clubTournamentsByIdTournament;
    }

    public void setClubTournamentsByIdTournament(Collection<ClubTournamentEntity> clubTournamentsByIdTournament) {
        this.clubTournamentsByIdTournament = clubTournamentsByIdTournament;
    }
}
