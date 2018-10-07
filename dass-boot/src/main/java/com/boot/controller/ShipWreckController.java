package com.boot.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipRepository;
import com.boot.service.NextSequenceService;

@RestController
@RequestMapping("api/v1") //base url configured for this class and its endpoint
public class ShipWreckController {

	@Autowired
	private ShipRepository shipRepository;
	
	@Autowired
	private NextSequenceService nextSequenceService;
	
	@RequestMapping(value="shipwrecks", method=RequestMethod.GET)
	public List<Shipwreck> list(){
		return shipRepository.findAll();
		//return ShipwreckStub.list();
	}
	
	
	
	@RequestMapping(value="shipwrecks",method=RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck shipwreck){
		
		shipwreck.setId(nextSequenceService.getNextSequence("customSequences"));
		
		return shipRepository.save(shipwreck);
		//return ShipwreckStub.create(shipwreck);
		
	}
	
	@RequestMapping(value="shipwrecks/{id}",method=RequestMethod.GET)
	public Shipwreck get(@PathVariable Integer id){
		return shipRepository.findOne(id);
		//return ShipwreckStub.get(id);
	}
	
	@RequestMapping(value="shipwrecks/{id}",method=RequestMethod.PUT)
	public Shipwreck update(@PathVariable Integer id,@RequestBody Shipwreck shipwreck){
		
		Shipwreck existingShipwreck =shipRepository.findOne(id);
		BeanUtils.copyProperties(shipwreck, existingShipwreck);
		return shipRepository.save(existingShipwreck);
		//return ShipwreckStub.update(id, shipwreck);
	}
	
	
	@RequestMapping(value="shipwrecks/{id}",method=RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable Integer id){
		Shipwreck existingShipWreck=shipRepository.findOne(id);
		shipRepository.delete(existingShipWreck);
		return existingShipWreck;
		//return ShipwreckStub.delete(id);
	}
	
	
	
	
}
