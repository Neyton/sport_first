package project.entity;


import javax.persistence.*;
import javax.persistence.GenerationType;
import java.util.Set;


@Entity
@Table(name = "bets")
public class Bet {



    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_event")
    private Event event;

    @Column(name = "win_loss")
    private String winLoss;

    public void setId(int id) {
        this.id = id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void setWinLoss(String winLoss) {
        this.winLoss = winLoss;
    }

    public int getId() {

        return id;
    }

    public Client getClient() {
        return client;
    }

    public Event getEvent() {
        return event;
    }

    public String getWinLoss() {
        return winLoss;
    }

    public Bet(Client client, Event event, String winLoss) {
        this.client = client;
        this.event = event;
        this.winLoss = winLoss;
    }


}
