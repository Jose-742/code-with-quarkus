package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/relatorio")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RelatorioResource {
    @Inject
    Config config;

    @GET
    public Config getConfig() {
        return config;
    }

    @PUT
    public void updateConfig(Config newConfig){
        this.config = newConfig;
        config.setFormatoRelatorio(newConfig.getFormatoRelatorio());
        config.setTipoGrafico(newConfig.getTipoGrafico());
    }    
}
