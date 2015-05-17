package dk.kimhrac.app.interfaces;

import dk.kimhrac.app.entity.SystemLocaleMap;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * SystemLocaleMapDAO
 * 
 * CRUD operations on SystemLocaleMap objects
 * 
 */
@Transactional
public interface SystemLocaleMapDAO extends
        CrudRepository<SystemLocaleMap, Long> {


}