package Iunie2024_1;

import java.io.IOException;
import java.util.LinkedHashSet;

public class EX5 {

    static class A {

        String sir;  // Field to store the string value

        // Constructor to initialize 'sir'
        public A(String sir) {
            this.sir = sir;
        }

        // Override equals: compares two A objects by comparing their 'sir' substring starting from index 1
        public boolean equals(Object obj) {
            // Cast the object to A, and compare substring from index 1 (i.e., skipping the first character)
            return sir.substring(1).equals(((A) obj).sir.substring(1));
        }

        // Override hashCode: returns the int value of the *uppercase* first character
        public int hashCode() {
            return (int) sir.toUpperCase().charAt(0);
        }

        // Override toString: returns the string followed by a space
        public String toString() {
            return sir + " ";
        }
    }

    // Proper main method inside the top-level EX5 class
    public static void main(String[] args) throws IOException {

        LinkedHashSet<A> lhs = new LinkedHashSet<>();  // Maintains insertion order and ensures uniqueness

        // Add objects to the set
        lhs.add(new A("examen"));  // Added
        lhs.add(new A("Java"));    // Added
        lhs.add(new A("Examen"));  // NOT added: equals() returns true with "examen"
        lhs.add(new A("PAO"));     // Added
        lhs.add(new A("Java"));    // NOT added: equals() returns true with previous "Java"

        // Print all objects in the set using forEach and overridden toString()
        lhs.forEach(System.out::print);  // Output: examen Java PAO
    }
}
