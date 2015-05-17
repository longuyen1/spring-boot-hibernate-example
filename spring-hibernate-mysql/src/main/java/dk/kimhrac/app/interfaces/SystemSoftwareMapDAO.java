package dk.kimhrac.app.interfaces;

import dk.kimhrac.app.entity.SystemSoftwareMap;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * SystemSoftwareMapDAO
 * 
 * CRUD operations on SystemSoftwareMap objects
 * 
 */
@Transactional
public interface SystemSoftwareMapDAO extends
        CrudRepository<SystemSoftwareMap, Long> {

}