package edu.guilford;

import java.util.Random;

public class rational {

    // set attributes
    private int numerator;
    private int denominator;

    // setters and getters

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // empty constructor with set numerator and denominator
    // public rational() {
    // numerator = 0;
    // denominator = 1;
    // }

    // constructor that generates random numerator and denominator, and if
    // denominator randomly chooses 0, rerun the randomization
    public rational() {
        Random rand = new Random();
        numerator = rand.nextInt(-100, 101);
        denominator = rand.nextInt(0, 101);
        while (denominator == 0) {
            denominator = rand.nextInt(0, 101);
        }
    }

    // constructor that takes in two arguments
    public rational(int num, int den) {
        this.numerator = num;
        this.denominator = den;
    }

    // toString method to print out the rational number
    public String toString() {
        return numerator + " / " + denominator;
    }

    // Write a method called negate that reverses the sign of the rational number.
    // because it's a void method we don't need to return anything. it is just
    // modifying an already existing object

    public void negate() {
        numerator = (~(numerator - 1));
    }

    // Write a method called invert that inverts the number by swapping the
    // numerator and denominator.

    public void invert() {
        int switchNum = numerator;
        numerator = denominator;
        denominator = switchNum;
    }

    // Write a method called toDouble that converts the rational number to a double
    // (floating-point number).

    public double toDouble() {
        double num = numerator;
        double den = denominator;
        return num / den;
    }

    // Write a method called add that takes a Rational number as an argument, adds
    // it to the rational number represented by the current object, and returns a
    // new Rational object.
    public rational add(rational test) {
        // cross multiplication to correctly add the two rational numbers, this finds
        // the numerator
        int num = numerator * test.denominator + test.numerator * denominator;
        // multiply both denominators to get the correct denominator
        int den = denominator * test.denominator;
        return new rational(num, den);
    }

}
