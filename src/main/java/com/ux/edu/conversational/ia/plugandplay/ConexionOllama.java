package com.ux.edu.conversational.ia.plugandplay;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ConexionOllama {

    static class OllamaResponse {
        String model;
        String response;
        boolean done;
    }

    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient();

            String json = """
            {
                "model": "llama3",
                "prompt": "Hola",
                "stream": false
            }
            """;

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:11434/api/generate"))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            OllamaResponse res = gson.fromJson(response.body(), OllamaResponse.class);

            System.out.println(res.response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
