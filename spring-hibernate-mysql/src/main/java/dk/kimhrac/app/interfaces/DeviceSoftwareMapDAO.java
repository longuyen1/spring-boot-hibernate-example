package dk.kimhrac.app.interfaces;

import dk.kimhrac.app.entity.DeviceSoftwareMap;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * DeviceSoftwareMapDAO
 * 
 * CRUD operations on DeviceSoftwareMap objects
 * 
 */
@Transactional
public interface DeviceSoftwareMapDAO extends CrudRepository<DeviceSoftwareMap, Long> {


}