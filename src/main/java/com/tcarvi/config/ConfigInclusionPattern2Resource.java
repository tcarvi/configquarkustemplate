package com.tcarvi.config;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/endpointForConfigInjectionPattern2")
public class ConfigInclusionPattern2Resource {

    @Inject
    ConfigInclusionPattern2Service configInclusionPattern2Service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String configInjectionPattern2ResourceExecution() {
        // Padrão 2 para inclusão de propriedade de configuração
        Config config = ConfigProvider.getConfig();
        String includedValue = config.getValue("included.value", String.class);

        return configInclusionPattern2Service.exec("Value included by pattern 2 is = " + includedValue);
    }
}
