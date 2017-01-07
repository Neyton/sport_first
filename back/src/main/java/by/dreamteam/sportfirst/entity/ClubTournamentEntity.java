package by.dreamteam.sportfirst.entity;

import javax.persistence.*;


@Entity
@Table(name = "club_tournament", schema = "sports_betting")
public class ClubTournamentEntity {
    private Integer idClub;
    private Integer idTournament;
    private ClubEntity clubByIdClub;
    private TournamentEntity tournamentByIdTournament;

    public ClubTournamentEntity(Integer idClub, Integer idTournament, ClubEntity clubByIdClub, TournamentEntity tournamentByIdTournament, String id) {
        this.idClub = idClub;
        this.idTournament = idTournament;
        this.clubByIdClub = clubByIdClub;
        this.tournamentByIdTournament = tournamentByIdTournament;
        this.id = id;
    }

    public ClubTournamentEntity() {
    }

    @Basic
    @Column(name = "id_club", nullable = true)
    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
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

        ClubTournamentEntity that = (ClubTournamentEntity) o;

        if (idClub != null ? !idClub.equals(that.idClub) : that.idClub != null) return false;
        if (idTournament != null ? !idTournament.equals(that.idTournament) : that.idTournament != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idClub != null ? idClub.hashCode() : 0;
        result = 31 * result + (idTournament != null ? idTournament.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_club", referencedColumnName = "id_club")
    public ClubEntity getClubByIdClub() {
        return clubByIdClub;
    }

    public void setClubByIdClub(ClubEntity clubByIdClub) {
        this.clubByIdClub = clubByIdClub;
    }

    @ManyToOne
    @JoinColumn(name = "id_tournament", referencedColumnName = "id_tournament")
    public TournamentEntity getTournamentByIdTournament() {
        return tournamentByIdTournament;
    }

    public void setTournamentByIdTournament(TournamentEntity tournamentByIdTournament) {
        this.tournamentByIdTournament = tournamentByIdTournament;
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
