package dk.kimhrac.app.interfaces;

import dk.kimhrac.app.entity.SoftwareType;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * SoftwareTypeDAO
 * 
 * CRUD operations on SoftwareType objects
 * 
 */
@Transactional
public interface SoftwareTypeDAO extends
        CrudRepository<SoftwareType, Long> {


}