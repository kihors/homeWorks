package com.homework.twelfth;

import java.util.function.DoubleUnaryOperator;

public class NumericalIntegration {
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double result = 0;
        double step = 1e-6;
        while (a < b) {
            result += step * f.applyAsDouble(a);
            a += step;
        }
        return result;
    }
}
