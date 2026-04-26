package com.ux.edu.conversational.ia.plugandplay.practica02;

public class ReportePacientes {
    public static void main(String[] args) {
        String[] codigos = {"C", "P", "N", "X", "P", "C", "N", "Z", "P", "C"};


        for (int i = 0; i < codigos.length; i++) {
            String area;
            switch (codigos[i]) {
                case "C":
                    area = "Cardiología";
                    break;
                case "P":
                    area = "Pediatría";
                    break;
                case "N":
                    area = "Neurología";
                    break;
                default:
                    area = "General";
                    break;
            }
            System.out.println("Paciente " + (i + 1) + " [Código: " + codigos[i] + "] -> Área: " + area);
        }
    }
}