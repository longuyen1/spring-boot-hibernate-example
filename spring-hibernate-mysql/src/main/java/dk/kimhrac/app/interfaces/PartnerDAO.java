package dk.kimhrac.app.interfaces;

import dk.kimhrac.app.entity.Partner;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * PartnerDAO
 * 
 * CRUD operations on Partner objects
 * 
 */
@Transactional
public interface PartnerDAO extends
        CrudRepository<Partner, Long> {


}