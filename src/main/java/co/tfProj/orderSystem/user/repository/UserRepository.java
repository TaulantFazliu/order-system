package co.tfProj.orderSystem.user.repository;

import co.tfProj.orderSystem.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
