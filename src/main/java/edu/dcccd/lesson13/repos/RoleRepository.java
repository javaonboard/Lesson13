package edu.dcccd.lesson13.repos;

import edu.dcccd.lesson13.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

//    @Query(value = "select * from roles where user_id=?1", nativeQuery = true)
    List<Role> findByUserId(@Param("user_id") Long user_id);
}