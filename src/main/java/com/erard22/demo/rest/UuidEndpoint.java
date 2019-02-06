package com.erard22.demo.rest;

import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/uuid")
public class UuidEndpoint {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok(UUID.randomUUID().toString()).build();
	}
}
