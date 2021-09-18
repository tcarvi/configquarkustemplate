package com.tcarvi;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.quarkus.runtime.configuration.ProfileManager;

/**
 *
 */
@Path("/endpointRSXhello")
@Singleton
public class HelloController {

    @GET
    public String sayHello() {
        return ProfileManager.getActiveProfile();
    }
}
