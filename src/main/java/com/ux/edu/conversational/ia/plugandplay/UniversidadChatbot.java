package com.ux.edu.conversational.ia.plugandplay;

import com.ux.edu.conversational.ia.feature.conversationalLLM.plugandplay.agente.AgenteConversacional;

import java.util.Scanner;

public class UniversidadChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Instanciamos el Agente (Contexto)
        AgenteConversacional corelia = new AgenteConversacional();

        // 2. Definimos la Configuración del Prompt (Consistencia)
        // Usaremos el mismo objeto para ambos modelos para comparar resultados
        PromptConfig configUniversitaria = new PromptConfig(
                "Asistente de Admisiones",
                "Responde de forma técnica y breve sobre procesos universitarios.",
                "¿Cuáles son los requisitos de hardware para la carrera de Sistemas?"
        );

        System.out.println("Sistema de Selección de Cerebro IA");
        System.out.println("1. Llama 3 (Equipos 16GB+ RAM)");
        System.out.println("2. Gemma 2 (Equipos 8GB RAM)");
        System.out.print("Seleccione el modelo para su hardware: ");

        int opcion = scanner.nextInt();

        // 3. Switch para asignar la Estrategia (Inyección de Dependencias)
        switch (opcion) {
            case 1:
                corelia.setStrategy(new Llama3Strategy());
                break;
            case 2:
                corelia.setStrategy(new GemmaStrategy());
                break;
            default:
                System.out.println("Opción no válida. Usando modelo por defecto (Gemma).");
                corelia.setStrategy(new GemmaStrategy());
        }

        // 4. Ejecución y Prueba de Consistencia
        System.out.println("\nEnviando consulta a la IA...");
        String respuesta = corelia.procesarConsulta(configUniversitaria);

        System.out.println("\nRespuesta Obtenida");
        System.out.println(respuesta);

        scanner.close();
    }
}