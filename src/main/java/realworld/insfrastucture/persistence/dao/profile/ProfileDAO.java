package realworld.insfrastucture.persistence.dao.profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import realworld.domin.model.Profile;

import java.util.Optional;

@Repository
interface ProfileDAO extends JpaRepository<Profile, String> {
    Optional<Profile> findAllByUserName(String userName);
}
