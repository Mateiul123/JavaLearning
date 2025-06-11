package Iunie2024_1;  // Declares that this class belongs to the package Iunie2024_1

public class EX4 {

    // Static nested class A
    static class A {
        int x = 10;  // Member variable x with default value 10

        // Constructor that sets the value of x
        public A(int x) {
            this.x = x;  // Assigns the constructor parameter to the class field
        }

        // Method that returns a value computed using the class field x and the argument t
        int f(int t) {
            return 10 * x + t;  // Example: if x = 20, t = 30 -> 10*20 + 30 = 230
        }
    }

    // Static nested class B that extends A (inherits from A)
    static class B extends A {
        int x = 30;  // This x hides A's x (field hiding, not overriding)

        // Constructor for B calls the superclass (A) constructor with value 20
        public B() {
            super(20);  // This sets A's x to 20
        }

        // Overrides method f from class A
        int f(int t) {
            // Uses B's x (which is 30) when calling super.f(x), and uses the argument t for 10 * t
            return 10 * t + super.f(x);
            // Example if t = 20:
            // super.f(x) = super.f(30) -> A's f: 10 * 20 (A.x) + 30 = 230
            // final result: 10 * 20 + 230 = 200 + 230 = 430
        }
    }
}
