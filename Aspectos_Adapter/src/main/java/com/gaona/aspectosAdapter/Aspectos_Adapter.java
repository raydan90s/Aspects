/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gaona.aspectosAdapter;


/**
 *
 * @author sambek99
 */
public class Aspectos_Adapter {

    public static void main(String[] args) {
    	MetricImpl metric = new MetricImpl(10); // 10 metros
        Imperial imperial = metric; // Usar el aspecto para la conversión

        System.out.println(metric.getMeters() + " metros son " + imperial.getFeet() + " pies.");
    }
}
