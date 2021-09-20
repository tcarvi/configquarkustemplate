package com.tcarvi.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/pathforconfig1")
@RequestScoped
public class ConfigInjectionPattern1Resource {

    // Padrão 1 para injeção de propriedade de configuração
    @ConfigProperty(name = "injected.value")
    String injectedValue;

    @Path("/endpointInjectionPattern1")
    @GET
    public String getInjectedConfigValue() {
        return "value injected by pattern 1 is = " + injectedValue;
    }

}
