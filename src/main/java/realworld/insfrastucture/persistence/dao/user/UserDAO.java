package realworld.insfrastucture.persistence.dao.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import realworld.domin.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface UserDAO extends JpaRepository<User, String>{

    Optional<User> getUserByUserName(String userName);

    //todo
    @Query(value = "update t_user set email = :email where userName = :userName")
    void updateUser(@Param("userName") String userName, @Param("email") String email, @Param("bio") String bio);


}
