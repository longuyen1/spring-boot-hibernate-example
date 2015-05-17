package dk.kimhrac.app.interfaces;

import dk.kimhrac.app.entity.SystemType;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * SystemTypeDAO
 * 
 * CRUD operations on SystemType objects
 * 
 */
@Transactional
public interface SystemTypeDAO extends
        CrudRepository<SystemType, Long> {


}