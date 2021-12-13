package com.cuatroa.retotres.repository.crud;

import com.cuatroa.retotres.model.Accessory;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Laurita
 */
public interface AccesoryCrudRepository extends MongoRepository<Accessory, String> {
    
}
