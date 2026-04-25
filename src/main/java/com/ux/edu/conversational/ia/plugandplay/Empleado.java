package com.ux.edu.conversational.ia.plugandplay;

// Clase base abstracta
public abstract class Empleado {

    // Método concreto
    public void trabajar() {
        System.out.println("El empleado está trabajando en sus tareas generales.");
    }

    // Método que será sobrescrito
    public void saludar() {
        System.out.println("Hola, soy un empleado del restaurante.");
    }
}

// Subclase Cocinero
public class Cocinero extends Empleado {
    @Override
    public void saludar() {
        System.out.println("Hola, soy el cocinero. ¡Listo para preparar deliciosos platillos!");
    }
}

// Subclase Mesero
public class Mesero extends Empleado {
    @Override
    public void saludar() {
        System.out.println("Hola, soy el mesero. ¡Estoy aquí para atenderte!");
    }
}

// Clase principal con main
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        // Agregamos instancias de Cocinero y Mesero
        empleados.add(new Cocinero());
        empleados.add(new Mesero());

        // Iteramos sobre la lista
        for (Empleado e : empleados) {
            e.saludar();   // Polimorfismo: se ejecuta la versión específica
            e.trabajar();  // Método concreto heredado
            System.out.println("-------------------");
        }
    }
}
