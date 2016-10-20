package project.entity;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "clients", schema = "sports_betting")
public class ClientsEntity {
    private int id;
    private String login;
    private String password;
    private String email;
    private Integer money;
    private Set<BetsEntity> bets;

    public ClientsEntity(int id, String login, String password, String email, Integer money, Set<BetsEntity> bets) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.email = email;
        this.money = money;
        this.bets = bets;
    }

    public ClientsEntity() {

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
    @Column(name = "login", nullable = true, length = 45)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 16)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "money", nullable = true)
    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @OneToMany(mappedBy = "client")
    public Set<BetsEntity> getBets() {
        return bets;
    }

    public void setBets(Set<BetsEntity> bets) {
        this.bets = bets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientsEntity that = (ClientsEntity) o;

        if (id != that.id) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        return result;
    }
}
