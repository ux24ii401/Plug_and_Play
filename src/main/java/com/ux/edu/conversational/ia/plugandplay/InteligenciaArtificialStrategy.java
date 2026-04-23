package com.ux.edu.conversational.ia.plugandplay;

public interface InteligenciaArtificialStrategy {

    // Contrato: recibir un prompt y devolver una respuesta
    String generarRespuesta(String prompt);

    // Nombre del modelo
    String getNombreModelo();
}
