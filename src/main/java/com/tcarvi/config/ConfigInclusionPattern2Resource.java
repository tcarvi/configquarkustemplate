package com.tcarvi.config;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/pathForConfigInclusionPattern2")
@RequestScoped
public class ConfigInclusionPattern2Resource {

    @Path("/endpointForConfigInclusionPattern2")
    @GET
    public String getLookupConfigValue() {
        // Padrão 2 para inclusão de propriedade de configuração
        Config config = ConfigProvider.getConfig();
        String includedValue = config.getValue("value", String.class);
        return "Value included by pattern 2 is = " + includedValue;
    }
}
