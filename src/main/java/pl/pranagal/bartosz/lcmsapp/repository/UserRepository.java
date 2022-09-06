package pl.pranagal.bartosz.lcmsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pranagal.bartosz.lcmsapp.model.dao.users.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username);

}
