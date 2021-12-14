package co.tfProj.orderSystem.user.repository;

import co.tfProj.orderSystem.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserRepositoryImp {

    private final UserRepository userRepository;

    @Autowired
    public UserRepositoryImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User saveUser(User user) {
        this.userRepository.saveAndFlush(user);
        return user;
    }

    @Override
    public List<User> findaAllUsers() {
        return this.userRepository.findAll();
    }
}
