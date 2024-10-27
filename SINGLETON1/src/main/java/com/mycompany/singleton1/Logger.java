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
    // Variable estática para almacenar la única instancia de Logger
    private static Logger instance = null;

    public Logger() {
        System.out.println("Logger initialized.");
    }

    // Método para registrar un mensaje
    public void log(String message) {
        System.out.println("Log entry: " + message);
    }

    // Método para obtener la instancia desde LoggerProxy (solo Proxy puede acceder)
    static Logger getInstanceInternal() {
        return instance;
    }

    // Método protegido para asignar la instancia desde LoggerProxy (solo Proxy puede acceder)
    static void setInstance(Logger instance) {
        Logger.instance = instance;
    }
}

