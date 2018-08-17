package org.state.service.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClient {

 @Autowired
 private RestTemplate restTemplate;
 
    private static final String URL= "http://eureka-service-demo/nme?name=";
    
    public String getServiceResponse(String name) {
    	System.out.println(URL + name);
    	 return restTemplate.exchange(URL + name, HttpMethod.GET, null, String.class).getBody();
    
    	
    	
    }
}
