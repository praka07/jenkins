package com.prakash.rest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
@Path("/hello")
public class Load {
	@GET
	public String retutnSucessMsg(){
		return "Welcome Aboard !!";
		
	}

	
}
