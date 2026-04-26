package com.ux.edu.conversational.ia.plugandplay.practica02;

import java.util.Scanner;

public class LectorHistorial {

    public static boolean validarIDPaciente(int id) {
        return (id >= 10000 && id <= 99999);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idIngresado;
        boolean esValido;

        do {
            System.out.print("Ingrese el ID del paciente (5 dígitos): ");
            idIngresado = sc.nextInt();

            esValido = validarIDPaciente(idIngresado);

            if (!esValido) {
                System.out.println("ID inválido. Intente de nuevo.");
            }

        } while (!esValido);

        System.out.println("Acceso concedido al historial del paciente: " + idIngresado);
        sc.close();
    }
}
