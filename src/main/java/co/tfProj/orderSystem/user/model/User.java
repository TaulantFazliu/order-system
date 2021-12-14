package co.tfProj.orderSystem.user.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    public enum Roli {WAITER, ADMIN}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_password")
    private String userPassword;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    public Roli role;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Roli getRole() {
        return role;
    }

    public void setRole(Roli role) {
        this.role = role;
    }
}
