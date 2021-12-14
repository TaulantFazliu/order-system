package co.tfProj.orderSystem.user.service;

import co.tfProj.orderSystem.user.model.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    User saveUser(User user);

    void deleteUser(Long id);
}
