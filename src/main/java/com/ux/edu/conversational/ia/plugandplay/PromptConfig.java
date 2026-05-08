package com.ux.edu.conversational.ia.plugandplay;

public class PromptConfig {
    private String rol;
    private String instrucciones;
    private String entrada;

    public PromptConfig(String rol, String instrucciones, String entrada) {
        this.rol = rol;
        this.instrucciones = instrucciones;
        this.entrada = entrada;
    }

    public String buildRawPrompt() {
        return String.format("Rol: %s\nInstrucciones: %s\nUsuario: %s", rol, instrucciones, entrada);
    }

    public String getRol() {
        return rol;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public String getEntrada() {
        return entrada;
    }

}
