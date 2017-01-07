package by.dreamteam.sportfirst.entity;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table(name = "type_rate", schema = "sports_betting")
public class TypeRateEntity {
    private Integer id;
    private String name;
    private Collection<RateEventEntity> rateEventsById;

    public TypeRateEntity(Integer id, String name, Collection<RateEventEntity> rateEventsById) {
        this.id = id;
        this.name = name;
        this.rateEventsById = rateEventsById;
    }

    public TypeRateEntity() {
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
    @Column(name = "name", nullable = true, length = 45)
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

        TypeRateEntity that = (TypeRateEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "typeRateByTypeId")
    public Collection<RateEventEntity> getRateEventsById() {
        return rateEventsById;
    }

    public void setRateEventsById(Collection<RateEventEntity> rateEventsById) {
        this.rateEventsById = rateEventsById;
    }
}
