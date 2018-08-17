package org.state.service.eureka;


import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.state.service.eureka.client.RestClient;

import ch.qos.logback.classic.Logger;

@RestController
public class EurekaSpringRestController {
	@Autowired
	private RestClient restClient;
	
	@GetMapping(path="/service", produces=MediaType.APPLICATION_JSON_VALUE)
	public String getResponse(@QueryParam(value="name") String name) {

		return restClient.getServiceResponse(name);
	}

}
