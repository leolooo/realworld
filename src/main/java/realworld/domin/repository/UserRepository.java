package realworld.domin.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import realworld.domin.model.user.User;
import realworld.insfrastucture.persistence.dao.user.UserDAO;

import java.util.Optional;

@Component
public class UserRepository {

    private UserDAO userDAO;

    @Autowired
    public UserRepository(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    public Optional<User> getUserByUserName(String userName){
        return userDAO.getUserByUserName(userName);
    }

    public void updateUser(String userName, String email, String bio){
        userDAO.updateUser(userName, email, bio);
    }

}
