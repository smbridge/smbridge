package de.fcernota.repository;

import de.fcernota.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by cernota on 06.10.16.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
