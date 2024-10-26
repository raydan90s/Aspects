/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gaona.aspectosAdapter;

/**
 *
 * @author sambek99
 */
public class MetricImpl implements Metric {
    private double meters;

    public MetricImpl(double meters) {
        this.meters = meters;
    }

    @Override
    public double getMeters() {
        return meters;
    }
}
