package com.tcarvi.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/pathforconfig1")
@RequestScoped
public class ConfigResource1 {

    @ConfigProperty(name = "injected.value")
    String injectedValue;

    @Path("/endpointRSXinjected")
    @GET
    public String getInjectedConfigValue() {
        return "injectedValue= " + injectedValue;
    }

}
