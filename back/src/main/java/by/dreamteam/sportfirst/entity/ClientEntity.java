package by.dreamteam.sportfirst.entity;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table(name = "client", schema = "sports_betting")
public class ClientEntity {
    private Integer id;
    private String email;
    private String login;
    private Integer money;
    private String password;
    private Collection<BetEntity> betsById;

    public ClientEntity(Integer id, String email, String login, Integer money, String password, Collection<BetEntity> betsById) {
        this.id = id;
        this.email = email;
        this.login = login;
        this.money = money;
        this.password = password;
        this.betsById = betsById;
    }

    public ClientEntity() {
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
    @Column(name = "email", nullable = true, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    @Column(name = "money", nullable = true)
    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 16)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientEntity that = (ClientEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "clientByIdClient")
    public Collection<BetEntity> getBetsById() {
        return betsById;
    }

    public void setBetsById(Collection<BetEntity> betsById) {
        this.betsById = betsById;
    }
}
