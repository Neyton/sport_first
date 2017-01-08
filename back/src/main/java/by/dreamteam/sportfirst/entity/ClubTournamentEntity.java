package by.dreamteam.sportfirst.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "club_tournament", schema = "sports_betting", uniqueConstraints =
@UniqueConstraint(name = "club_tournament_unique", columnNames = {"id_club", "id_tournament"}))
public class ClubTournamentEntity {
    private Long id;
    private ClubEntity club;
    private TournamentEntity tournament;
    private boolean involved;

    @Id
    @Basic
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long idClub) {
        this.id = idClub;
    }

    @Basic
    @Column(name = "involved", columnDefinition = "boolean default true", nullable = false)
    public boolean isInvolved() {
        return involved;
    }

    public void setInvolved(boolean available) {
        this.involved = available;
    }

    @ManyToOne
    @JoinColumn(name = "id_club", referencedColumnName = "id_club")
    public ClubEntity getClub() {
        return club;
    }

    public void setClub(ClubEntity club) {
        this.club = club;
    }

    @ManyToOne
    @JoinColumn(name = "id_tournament", referencedColumnName = "id_tournament")
    public TournamentEntity getTournament() {
        return tournament;
    }

    public void setTournament(TournamentEntity tournament) {
        this.tournament = tournament;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClubTournamentEntity that = (ClubTournamentEntity) o;

        if (involved != that.involved) return false;
        if (!id.equals(that.id)) return false;
        if (club != null ? !club.equals(that.club) : that.club != null) return false;
        return tournament != null ? tournament.equals(that.tournament) : that.tournament == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (club != null ? club.hashCode() : 0);
        result = 31 * result + (tournament != null ? tournament.hashCode() : 0);
        result = 31 * result + (involved ? 1 : 0);
        return result;
    }
}
