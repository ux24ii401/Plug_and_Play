package com.ux.edu.conversational.ia.plugandplay.practica02;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ValidacionCItas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora = 0;
        String dia;

        try {
            System.out.print("Ingrese la hora de la cita (0-23): ");
            hora = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingrese el día de la semana: ");
            dia = sc.nextLine().toLowerCase();

            if (hora >= 9 && hora <= 17) {
                if (!dia.equals("sabado") && !dia.equals("sábado") && !dia.equals("domingo")) {
                    System.out.println("Cita agendada con éxito para el día " + dia + " a las " + hora + ":00.");
                } else {
                    System.out.println("Error: No hay citas disponibles en fines de semana.");
                }
            } else {
                System.out.println("Error: La hora debe estar entre las 9 y las 17 horas.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: La hora debe ser un número entero.");
        } finally {
            sc.close();
        }
    }
}