package dk.kimhrac.app.interfaces;

import dk.kimhrac.app.entity.SystemRelease;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * SystemReleaseDAO
 * 
 * CRUD operations on SystemRelease objects
 * 
 */
@Transactional
public interface SystemReleaseDAO extends
        CrudRepository<SystemRelease, Long> {


}