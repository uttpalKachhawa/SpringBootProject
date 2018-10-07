/**
 * 
 */
package com.boot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.boot.model.Shipwreck;

/**
 * @author 212574988
 *
 */
public interface ShipRepository extends MongoRepository<Shipwreck, Integer> {

	
	
	
}
