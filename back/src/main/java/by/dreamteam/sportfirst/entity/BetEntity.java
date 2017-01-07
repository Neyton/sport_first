package by.dreamteam.sportfirst.entity;

import javax.persistence.*;


@Entity
@Table(name = "bet", schema = "sports_betting")
public class BetEntity {
    private Integer id;
    private String winLoss;
    private Integer idClient;
    private Integer idEvent;
    private ClientEntity clientByIdClient;
    private EventEntity eventByIdEvent;

    public BetEntity(Integer id, String winLoss, Integer idClient, Integer idEvent, ClientEntity clientByIdClient, EventEntity eventByIdEvent) {
        this.id = id;
        this.winLoss = winLoss;
        this.idClient = idClient;
        this.idEvent = idEvent;
        this.clientByIdClient = clientByIdClient;
        this.eventByIdEvent = eventByIdEvent;
    }

    public BetEntity() {
    }

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "win_loss", nullable = true, length = 45)
    public String getWinLoss() {
        return winLoss;
    }

    public void setWinLoss(String winLoss) {
        this.winLoss = winLoss;
    }

    @Basic
    @Column(name = "id_client", nullable = true)
    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    @Basic
    @Column(name = "id_event", nullable = true)
    public Integer getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Integer idEvent) {
        this.idEvent = idEvent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BetEntity betEntity = (BetEntity) o;

        if (id != null ? !id.equals(betEntity.id) : betEntity.id != null) return false;
        if (winLoss != null ? !winLoss.equals(betEntity.winLoss) : betEntity.winLoss != null) return false;
        if (idClient != null ? !idClient.equals(betEntity.idClient) : betEntity.idClient != null) return false;
        if (idEvent != null ? !idEvent.equals(betEntity.idEvent) : betEntity.idEvent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (winLoss != null ? winLoss.hashCode() : 0);
        result = 31 * result + (idClient != null ? idClient.hashCode() : 0);
        result = 31 * result + (idEvent != null ? idEvent.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_client", referencedColumnName = "id")
    public ClientEntity getClientByIdClient() {
        return clientByIdClient;
    }

    public void setClientByIdClient(ClientEntity clientByIdClient) {
        this.clientByIdClient = clientByIdClient;
    }

    @ManyToOne
    @JoinColumn(name = "id_event", referencedColumnName = "id_event")
    public EventEntity getEventByIdEvent() {
        return eventByIdEvent;
    }

    public void setEventByIdEvent(EventEntity eventByIdEvent) {
        this.eventByIdEvent = eventByIdEvent;
    }
}
