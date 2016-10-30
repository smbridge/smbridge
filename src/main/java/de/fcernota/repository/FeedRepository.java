package de.fcernota.repository;

import de.fcernota.entity.Feed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository für Feeds
 * @author cernota
 * @see org.springframework.data.jpa.repository.JpaRepository
 * @see org.springframework.data.repository.Repository
 * @see org.springframework.beans.factory.annotation.Autowired
 * @since 0.0.1
 * @apiNote Repository für Feeds. Dieses Repository kann via @Autowired erstellt werden kann.
 *
 */
@Repository
public interface FeedRepository  extends JpaRepository<Feed, Long> {


}
