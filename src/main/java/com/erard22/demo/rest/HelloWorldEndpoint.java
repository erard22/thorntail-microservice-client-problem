package com.erard22.demo.rest;

import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

@Path("/hello")
public class HelloWorldEndpoint {


	@GET
	@Produces("text/plain")
	public Response doGet() {
		Response response = createRestEasyClient().doGet();
		return Response.ok(response.getEntity()).build();
	}


	public UuidRestClient createRestEasyClient() {
		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target(UriBuilder.fromPath("http://localhost:8080"));
		return target.proxy(UuidRestClient.class);
	}

	/*
	public UuidRestClient createMicroProfileClient() throws MalformedURLException {
		return RestClientBuilder.newBuilder()
				.baseUrl(new URL("http://localhost:8080/uuid"))
				.build(UuidRestClient.class);
	}
	*/
}
