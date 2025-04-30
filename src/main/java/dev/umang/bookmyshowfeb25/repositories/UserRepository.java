package dev.umang.bookmyshowfeb25.repositories;

import dev.umang.bookmyshowfeb25.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/*
JPA to fire queries. This will be discussed in detail
in your backend project module.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /*
    The below are known as JPA declared methods
     */
    @Override
    Optional<User> findById(Long id);
    /*
    Select *
    from User
    where id = id
     */

    Optional<User> findByEmail(String email);

}
