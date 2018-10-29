package com.boot;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
//@WebIntegrationTest
public class ShipWreckControllerWebIntegrationTest {

	/*@Test
	public void testListall() {
		RestTemplate template = new TestRestTemplate();

		
		ResponseEntity<String> response = template.getForEntity(
				"http://localhost:9090/api/v1/shipwrecks/2", String.class);
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));

		ObjectMapper mapper = new ObjectMapper();

		JsonNode responseJson = null;
		try {
			responseJson = mapper.readTree(response.getBody());
			System.out.println("response is ************"+responseJson.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertThat(responseJson.isMissingNode(), is(false));
		assertThat(
				responseJson.toString(),
				equalTo("{\"id\":2,\"name\":\"Titanic2\",\"description\":\"Titanic test\",\"condition\":\"FAIR\",\"depth\":55,\"latitude\":66.0,\"longitude\":77.0,\"yearDiscovered\":1988}"));

	}*/
	



}
