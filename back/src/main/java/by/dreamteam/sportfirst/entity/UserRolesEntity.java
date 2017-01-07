package by.dreamteam.sportfirst.entity;

import javax.persistence.*;


@Entity
@Table(name = "user_roles", schema = "sports_betting")
public class UserRolesEntity {
    private Integer userId;
    private Integer roleId;
    private ClientEntity clientByUserId;
    private RoleEntity roleByRoleId;

    public UserRolesEntity(Integer userId, Integer roleId, ClientEntity clientByUserId, RoleEntity roleByRoleId) {
        this.userId = userId;
        this.roleId = roleId;
        this.clientByUserId = clientByUserId;
        this.roleByRoleId = roleByRoleId;
    }

    public UserRolesEntity() {
    }

    @Id
    @Column(name = "user_id", nullable = false)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "role_id", nullable = false)
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRolesEntity that = (UserRolesEntity) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public ClientEntity getClientByUserId() {
        return clientByUserId;
    }

    public void setClientByUserId(ClientEntity clientByUserId) {
        this.clientByUserId = clientByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false)
    public RoleEntity getRoleByRoleId() {
        return roleByRoleId;
    }

    public void setRoleByRoleId(RoleEntity roleByRoleId) {
        this.roleByRoleId = roleByRoleId;
    }
}
