package dk.kimhrac.app.interfaces;

import dk.kimhrac.app.entity.SoftwareMatrix;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * SoftwareMatrixDAO
 * 
 * CRUD operations on SoftwareMatrix objects
 * 
 */
@Transactional
public interface SoftwareMatrixDAO extends
        CrudRepository<SoftwareMatrix, Long> {

}