package realworld.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import realworld.application.responsedto.UserDto;
import realworld.domin.model.user.User;
import realworld.domin.repository.UserRepository;

import java.util.Optional;

@Service
public class GetCurrentUserService {

    private UserRepository userRepository;
    @Autowired
    public GetCurrentUserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public User getCurrentUser(String userName) {
        Optional<User> user = userRepository.getUserByUserName(userName);
        return user.orElse(null);
    }


}
