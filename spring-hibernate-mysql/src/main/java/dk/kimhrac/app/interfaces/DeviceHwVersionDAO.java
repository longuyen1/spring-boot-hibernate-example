package dk.kimhrac.app.interfaces;

import dk.kimhrac.app.entity.DeviceHwVersion;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * DeviceHwVersionDAO
 * 
 * CRUD operations on DeviceHwVersion objects
 * 
 */
@Transactional
public interface DeviceHwVersionDAO extends CrudRepository<DeviceHwVersion, Long> {


}