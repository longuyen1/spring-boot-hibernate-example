package dk.kimhrac.app.interfaces;

import dk.kimhrac.app.entity.DeviceType;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * DeviceTypeDAO
 * 
 * CRUD operations on DeviceType objects
 * 
 */
@Transactional
public interface DeviceTypeDAO extends
        CrudRepository<DeviceType, Long> {

}