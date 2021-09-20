package com.tcarvi.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/pathForConfigInjectionPattern1")
@RequestScoped
public class ConfigInjectionPattern1Resource {

    // Padrão 1 para injeção de propriedade de configuração
    @ConfigProperty(name = "injected.value")
    String injectedValue;

    @Path("/endpointForConfigInjectionPattern1")
    @GET
    public String getInjectedConfigValue() {
        return "Value injected by pattern 1 is = " + injectedValue;
    }

}
