package dk.kimhrac.app.interfaces;

import dk.kimhrac.app.entity.PredecessorReleaseMap;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * PredecessorReleaseMapDAO
 * 
 * CRUD operations on PredecessorReleaseMap objects
 * 
 */
@Transactional
public interface PredecessorReleaseMapDAO extends
        CrudRepository<PredecessorReleaseMap, Long> {


}