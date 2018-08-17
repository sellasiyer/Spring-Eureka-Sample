package org.state.service.eureka.controller;



import javax.ws.rs.QueryParam;

import org.apache.commons.lang.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	private String response = "Eureka Service Called By ";


@RequestMapping(path="/nme", produces=MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
public String getString(@RequestParam(value = "name") String nme) {
	if(StringUtils.isNotBlank(nme))
		return response + nme.toUpperCase() ;
	else
		return response;
}

}
