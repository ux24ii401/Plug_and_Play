package com.ux.edu.conversational.ia.plugandplay.practica02;

import java.util.Scanner;

public class AccesoPersonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean autenticado = false;

        for (int intento = 1; intento <= 3; intento++) {
            System.out.println("\nIntento " + intento + " de 3");
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();
            System.out.print("Contraseña: ");
            String password = sc.nextLine();

            if (usuario.equals("medico1") && password.equals("doc123")) {
                System.out.println("Acceso de Médico exitoso. Bienvenido, Dr.");
                autenticado = true;
                break;
            } else if (usuario.equals("enfermera2") && password.equals("enf456")) {
                System.out.println("Acceso de Enfermera exitoso. Bienvenida.");
                autenticado = true;
                break;
            } else {
                System.out.println("Credenciales incorrectas.");
                if (intento < 3) continue;
            }
        }

        if (!autenticado) {
            System.out.println("\nDemasiados intentos. Acceso denegado. Bloqueando terminal...");
        }

        sc.close();
    }
}
