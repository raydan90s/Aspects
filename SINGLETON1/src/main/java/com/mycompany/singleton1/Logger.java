/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton1;

/**
 *
 * @author Kevin
 */
public class Logger {
    static Logger instance = null; // Instancia Singleton

    Logger() { // Constructor con acceso package-private (sin `public` o `private`)
        System.out.println("Logger initialized.");
    }

    public void log(String message) { // Método para registrar mensajes
        System.out.println("Log entry: " + message);
    }

    // Método package-private para obtener la instancia
    static Logger getInstanceInternal() {
        return instance;
    }

    // Método package-private para asignar la instancia
    static void setInstance(Logger newInstance) {
        instance = newInstance;
    }
}

