package org.state.service.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RefreshScope
public class RestClient {

 @Autowired
 private RestTemplate restTemplate;
 @Value("${endpoint.url}")
 private String URL = "nowhere";
 @Value("${endpoint.service}")
 private String service = "nowhere";
 //   private static final String URL= "http://eureka-service-demo/nme?name=";
    
    public String getServiceResponse(String name) {
    	System.out.println(URL + service + name);
    	 return restTemplate.exchange(URL + service + name, HttpMethod.GET, null, String.class).getBody();
    
    	
    	
    }
}
