package org.acme;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Config {
    @ConfigProperty(name = "formatoRelatorio")
    private String formatoRelatorio = "pdf";

    @ConfigProperty(name = "tipoGrafico")
    private String tipoGrafico = "barras";

    public String getFormatoRelatorio(){
        return this.formatoRelatorio;
    }

    public String getTipoGrafico(){
        return this.tipoGrafico;
    }

    public void setFormatoRelatorio(String formatoRelatorio){
        this.formatoRelatorio = formatoRelatorio;
    }

    public void setTipoGrafico(String tipoGrafico){
        this.tipoGrafico = tipoGrafico;
    }
}
