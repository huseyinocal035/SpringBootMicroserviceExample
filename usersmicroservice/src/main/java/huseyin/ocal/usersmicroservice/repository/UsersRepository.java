package huseyin.ocal.usersmicroservice.repository;

import huseyin.ocal.usersmicroservice.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
}
