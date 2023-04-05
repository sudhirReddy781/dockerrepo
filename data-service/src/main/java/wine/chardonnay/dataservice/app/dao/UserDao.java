package wine.chardonnay.dataservice.app.dao;

import wine.chardonnay.dataservice.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Optional;

@Component
public class UserDao {

    private final UserRepository userRepository;

    public UserDao(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User insertUserData(User user) {
        return userRepository.insert(user);
    }

    public Collection<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    public User getUserByName(String name) {
        return userRepository.findByName(name).get(0);
    }

    public User updateUserUsingId(String id, User user) {
        Optional<User> findUserQuery = userRepository.findById(id);
        User userValues = findUserQuery.get();
        userValues.setId(user.getId());
        userValues.setName(user.getName());
        userValues.setSecret(user.getSecret());
        userValues.setPhone(user.getPhone());
        userValues.setAddress(user.getAddress());
        return userRepository.save(userValues);
    }

    public void deleteUserUsingId(String id) {
        try {
            userRepository.deleteById(id);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

}
