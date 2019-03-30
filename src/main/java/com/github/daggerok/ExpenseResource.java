package com.github.daggerok;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.Optional;
import java.util.logging.Logger;

import static java.util.Collections.singletonMap;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("v1")
@ApplicationScoped
@Produces(APPLICATION_JSON)
public class ExpenseResource {

  private static final Logger log = Logger.getLogger(ExpenseResource.class.getName());

  @GET
  @Path("")
  public Response index() {
    return get(null);
  }

  @GET
  @Path("{customerId}")
  public Response get(@PathParam("customerId") String customerId) {
    log.info("customerId: " + customerId);
    return Response.ok(singletonMap("customerId", customerId))
                   .build();
  }
}
