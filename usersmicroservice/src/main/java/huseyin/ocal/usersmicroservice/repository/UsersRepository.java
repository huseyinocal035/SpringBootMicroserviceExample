package huseyin.ocal.usersmicroservice.repository;

import huseyin.ocal.usersmicroservice.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Long> {
}
