package edu.dcccd.lesson13.repos;

import edu.dcccd.lesson13.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
    
}