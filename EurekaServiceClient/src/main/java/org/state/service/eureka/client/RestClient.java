package org.state.service.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
//@RefreshScope
public class RestClient {

 @Autowired
 private RestTemplate restTemplate;

    @Value("${endpoint.url}")
    private String url = "none";

    @Value("${endpoint.service}")
    private String serviceEndpoint = "none";
    
    public String getServiceResponse(String name) {
    	System.out.println(url + name);
    	 return restTemplate.exchange(url+serviceEndpoint + name, HttpMethod.GET, null, String.class).getBody();

    }
}
