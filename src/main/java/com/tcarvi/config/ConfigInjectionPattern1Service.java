package com.tcarvi.config;

import javax.enterprise.context.ApplicationScoped;

import org.jboss.logging.Logger;

@ApplicationScoped
public class ConfigInjectionPattern1Service {

    private static final Logger LOG = Logger.getLogger(ConfigInjectionPattern1Service.class);

    public String exec(String config) {
        try {
            Thread.sleep(70L); // A executar algo na Thread.
        } catch (InterruptedException ex) {
            // Lide com a exceção ou throws ex
            LOG.info(ex.getMessage());
        } finally {
            // Execução necessária por causa do código do try-catch anterior.
        }
        return "config received: " + config;
    }

}
