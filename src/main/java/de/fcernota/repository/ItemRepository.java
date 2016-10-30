package de.fcernota.repository;

import de.fcernota.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by cernota on 07.10.16.
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
