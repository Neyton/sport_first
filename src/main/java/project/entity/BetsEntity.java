package project.entity;

import javax.persistence.*;


@Entity
@Table(name = "bets", schema = "sports_betting")
public class BetsEntity {

    private int id;
    private String winLoss;
    private ClientsEntity client;
    private EventsEntity event;

    public BetsEntity(int id, String winLoss, ClientsEntity client, EventsEntity event) {
        this.id = id;
        this.winLoss = winLoss;
        this.client = client;
        this.event = event;
    }

    public BetsEntity() {

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
    @Column(name = "win/loss", nullable = true, length = 45)
    public String getWinLoss() {
        return winLoss;
    }

    public void setWinLoss(String winLoss) {
        this.winLoss = winLoss;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client")
    public ClientsEntity getClient() {
        return client;
    }

    public void setClient(ClientsEntity client) {
        this.client = client;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_event")
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

        BetsEntity that = (BetsEntity) o;

        if (id != that.id) return false;
        if (winLoss != null ? !winLoss.equals(that.winLoss) : that.winLoss != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (winLoss != null ? winLoss.hashCode() : 0);
        return result;
    }
}
