package de.fcernota.repository;

import de.fcernota.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository für Rollen
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
