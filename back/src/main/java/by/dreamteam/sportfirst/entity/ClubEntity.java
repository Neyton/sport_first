package by.dreamteam.sportfirst.entity;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table(name = "club", schema = "sports_betting")
public class ClubEntity {
    private Integer idClub;
    private String name;
    private Collection<ClubTournamentEntity> clubTournaments;
    private Collection<EventClubEntity> eventClubs;

    public ClubEntity(Integer idClub, String name, Collection<ClubTournamentEntity> clubTournaments, Collection<EventClubEntity> eventClubs) {
        this.idClub = idClub;
        this.name = name;
        this.clubTournaments = clubTournaments;
        this.eventClubs = eventClubs;
    }

    public ClubEntity() {
    }

    @Id
    @Column(name = "id_club", nullable = false)
    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
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

        ClubEntity that = (ClubEntity) o;

        if (idClub != null ? !idClub.equals(that.idClub) : that.idClub != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idClub != null ? idClub.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "clubByIdClub")
    public Collection<ClubTournamentEntity> getClubTournaments() {
        return clubTournaments;
    }

    public void setClubTournaments(Collection<ClubTournamentEntity> clubTournamentsByIdClub) {
        this.clubTournaments = clubTournamentsByIdClub;
    }

    @OneToMany(mappedBy = "clubByIdClub")
    public Collection<EventClubEntity> getEventClubs() {
        return eventClubs;
    }

    public void setEventClubs(Collection<EventClubEntity> eventClubs) {
        this.eventClubs = eventClubs;
    }
}
