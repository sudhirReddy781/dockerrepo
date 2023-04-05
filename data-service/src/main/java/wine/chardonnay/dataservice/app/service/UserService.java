package wine.chardonnay.dataservice.app.service;

import wine.chardonnay.dataservice.app.dao.UserDao;
import wine.chardonnay.dataservice.app.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User insertUserData(User user) {
        return userDao.insertUserData(user);
    }

    public Collection<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public Optional<User> getUserById(String id) {
        return userDao.getUserById(id);
    }

    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    public void updateUserById(String id, User user) {
        userDao.updateUserUsingId(id, user);
    }

    public void deleteUserUsingId(String id) {
        userDao.deleteUserUsingId(id);
    }

}
