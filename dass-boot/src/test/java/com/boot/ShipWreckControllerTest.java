package com.boot;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.boot.controller.ShipWreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipRepository;
import static org.mockito.Mockito.*;

public class ShipWreckControllerTest {

	/*Create a mock instance of ShipWreckController class
	 It works like dependency injevction 
	 Now mockito is managing object*/
	@InjectMocks
	private ShipWreckController controller;

	/*To avoid null pointer exception use below*/
	@Mock
	private ShipRepository shipRepository;
	
	/*To initialize all mock objects when test runs use below*/
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testShipWrecktest(){
		
		//ShipWreckController controller = new ShipWreckController();
		Shipwreck shipWreck = new Shipwreck();
		shipWreck.setId(1);
	when(shipRepository.findOne(1)).thenReturn(shipWreck);
	
		Shipwreck ship=controller.get(1);
		
		verify(shipRepository).findOne(1);
		
		Assert.assertEquals(1, ship.getId().intValue());
	}
}
