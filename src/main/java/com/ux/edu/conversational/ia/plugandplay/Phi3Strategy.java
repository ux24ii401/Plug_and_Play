package com.ux.edu.conversational.ia.plugandplay;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Phi3Strategy implements InteligenciaArtificialStrategy {

    private static final String OLLAMA_URL = "http://localhost:11434/api/generate";

    @Override
    public String generarRespuesta(String prompt) {
        try {
            URL url = new URL(OLLAMA_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            String json = "{"
                    + "\"model\": \"phi3\","
                    + "\"prompt\": \"" + prompt + "\","
                    + "\"stream\": false"
                    + "}";

            try (OutputStream os = conn.getOutputStream()) {
                os.write(json.getBytes("utf-8"));
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8")
            );

            StringBuilder response = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                response.append(line.trim());
            }

            return response.toString();

        } catch (Exception e) {
            return "Error con Phi3: " + e.getMessage();
        }
    }

    @Override
    public String getNombreModelo() {
        return "";
    }
}
