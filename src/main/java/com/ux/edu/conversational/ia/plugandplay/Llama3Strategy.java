package com.ux.edu.conversational.ia.plugandplay;

public class Llama3Strategy implements IAStrategy {
    @Override
    public String generarRespuesta(PromptConfig config) {
        String promptFinal = "Actúa como: " + config.getRol() +
                ". Instrucciones: " + config.getInstrucciones() +
                ". Pregunta: " + config.getEntrada();

        return "Respuesta procesada por Llama3 usando tu configuración.";
    }
}