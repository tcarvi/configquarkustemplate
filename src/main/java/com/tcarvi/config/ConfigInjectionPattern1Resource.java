package com.tcarvi.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/endpointForConfigInjectionPattern1")
public class ConfigInjectionPattern1Resource {

    // Padrão 1 para injeção de propriedade de configuração
    @ConfigProperty(name = "injected.value")
    String injectedValue;

    @Inject
    ConfigInjectionPattern1Service configInjectionPattern1Service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String configInjectionPattern1ResourceExecution(){
        // Use of injectedValue in the Resource or in the Service
        return configInjectionPattern1Service.exec(getInjectedConfigValue());
    }

    public String getInjectedConfigValue() {
        return "Value injected by pattern 1 is = " + injectedValue;
    }

}
