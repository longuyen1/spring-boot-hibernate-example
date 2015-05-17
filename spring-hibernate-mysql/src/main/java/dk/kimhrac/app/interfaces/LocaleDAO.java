package dk.kimhrac.app.interfaces;

import dk.kimhrac.app.entity.Locale;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * LocaleDAO
 * 
 * CRUD operations on Locale objects
 * 
 */
@Transactional
public interface LocaleDAO extends
        CrudRepository<Locale, Long> {


}