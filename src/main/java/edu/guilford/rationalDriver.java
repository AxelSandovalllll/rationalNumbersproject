package edu.guilford;

/**
 * Hello world!
 *
 */
public class rationalDriver {
    public static void main(String[] args) {

        // test the empty constructor & toString method
        rational test = new rational();
        System.out.println("\nThe randomized constructor consists of: " + test);

        // testing the negate method
        rational test2 = new rational(4, 5);
        System.out.println("\nTesting if reversing the sign of the rational number works. \nInput: " + test2
                + " Expected output: -4/5");

        test2.negate();
        System.out.println("Program Output: \n" + test2);

        // test the invert method
        rational test3 = new rational(6, 9);
        System.out.println("\nTesting the inversion method: \nInput: " + test3
                + " Expected output: 9/6");
        test3.invert();
        System.out.println("Program Output: \n" + test3);

        // test the toDouble method
        rational test4 = new rational(1, 4);
        System.out.println("\nTesting the toDouble method: \nInput: " + test4
                + " Expected output: .25");
        test4.toDouble();
        System.out.println("Program Output: \n" + test4);

        // test the add method
        rational test5 = new rational(1, 2);
        rational test6 = new rational(1, 4);
        rational test7 = test5.add(test6);
        System.out.println("\nTesting the add method: \nInput: " + test5 + " and " + test6
                + " Expected output: 6/8");
        System.out.println("Program Output: \n" + test7);

    }

}
