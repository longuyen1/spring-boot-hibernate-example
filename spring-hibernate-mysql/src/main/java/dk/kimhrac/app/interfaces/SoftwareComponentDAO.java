package dk.kimhrac.app.interfaces;

import dk.kimhrac.app.entity.SoftwareComponent;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * SoftwareComponentDAO
 * 
 * CRUD operations on SoftwareComponent objects
 *
 */
@Transactional
public interface SoftwareComponentDAO extends
        CrudRepository<SoftwareComponent, Long> {


}