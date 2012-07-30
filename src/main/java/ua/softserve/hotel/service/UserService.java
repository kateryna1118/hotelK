package ua.softserve.hotel.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.softserve.hotel.dao.UserDAO;
import ua.softserve.hotel.domain.User;
/**
 *
 * @author Kateryna
 */
@Service
@Transactional(readOnly = true)
public class UserService implements IUserService {

    @Autowired
    private UserDAO userDAO;

    /*Перед исполнением метода помеченного @Transactional аннотацией начинается
    транзакция, после выполнения метода транзакция коммитится, при выбрасывании
    RuntimeException откатывается.
      */
    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Transactional
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Transactional
    public void removeUser(Long id) {
        userDAO.removeUser(id);
    }

    @Transactional
    public User getUser(Long id) {
        return userDAO.getUser(id);
    }

    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}