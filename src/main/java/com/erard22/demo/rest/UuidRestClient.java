package com.erard22.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/uuid")
public interface UuidRestClient {

    @GET
    @Produces("text/plain")
    Response doGet();
}
