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
    public String sayWhatIsActiveProfile() {
        return "Hello, your active profile is " + ProfileManager.getActiveProfile();
    }
}
