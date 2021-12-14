package co.tfProj.orderSystem.user.service;

import co.tfProj.orderSystem.user.model.User;
import co.tfProj.orderSystem.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public List<User> findAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return this.userRepository.saveAndFlush(user);
    }
}
