package com.ux.edu.conversational.ia.plugandplay;

public class Main {
    public static void main(String[] args) {

        InteligenciaArtificialStrategy estrategia = new Phi3Strategy();

        AgenteConversacional agente = new AgenteConversacional(estrategia);

        System.out.println(agente.responder("Hola"));
    }
}