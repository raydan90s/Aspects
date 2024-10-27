/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton1;

/**
 *
 * @author Kevin
 */
public class LoggerProxy {
    public static Logger getInstance() {
        if (Logger.getInstanceInternal() == null) {
            Logger.setInstance(new Logger());
            System.out.println("Logger instance created by Proxy");
        }
        return Logger.getInstanceInternal();
    }
}

