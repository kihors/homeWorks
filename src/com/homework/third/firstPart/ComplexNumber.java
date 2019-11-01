package com.homework.third.firstPart;

/*
 * task from Stepik
 * https://stepik.org/lesson/12769/step/9?unit=3117
 */

public final class ComplexNumber {

    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComplexNumber) {
            return ((ComplexNumber) obj).im == this.im && ((ComplexNumber) obj).re == this.re;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(this.im / this.re);
    }
}
