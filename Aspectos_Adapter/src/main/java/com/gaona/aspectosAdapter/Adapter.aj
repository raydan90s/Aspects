package com.gaona.aspectosAdapter;


public aspect Adapter {
	// Declarar que MetricImpl implementa Imperial
    declare parents: MetricImpl implements Imperial;

    // Implementación del método getFeet para MetricImpl
    public double MetricImpl.getFeet() {
        return getMeters() * 3.28084; // Conversión de metros a pies
    }
}
