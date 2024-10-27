/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton1;

/**
 *
 * @author Kevin
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Starting application...");

        // Intentamos obtener la instancia varias veces y registrar mensajes
        Logger logger1 = LoggerProxy.getInstance();
        logger1.log("This is the first log message.");

        Logger logger2 = LoggerProxy.getInstance();
        logger2.log("This is the second log message.");

        // Comprobamos que ambas instancias sean las mismas
        if (logger1 == logger2) {
            System.out.println("Both loggers are the same instance.");
        } else {
            System.out.println("Different instances (should not happen in Singleton).");
        }
    }
}
