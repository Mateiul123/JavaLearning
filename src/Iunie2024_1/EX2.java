//package Iunie2024_1;
//
//public class EX2 {
//    @FunctionalInterface
//    interface Functie_1 {
//        int f(double x);
//    }
//
//    @FunctionalInterface
//    interface Functie_2 extends Functie_1 {
//        default void afisare(int x) {
//            System.out.println(f(x));
//        }
//    }
//
//    // ❌ This will cause a compile error because it has 0 abstract methods
//    @FunctionalInterface
//    interface Functie_3 extends Functie_2 {
//        default int f(double x) {
//            return (int) (x + 1);
//        }
//    }
//
//    @FunctionalInterface
//    interface Functie_4 extends Functie_1, Functie_2 {
//        // No extra method; still one abstract: f(double)
//    }
//
//    // ❌ This will cause a compile error because it has 2 abstract methods: f(double) and g(int)
//    @FunctionalInterface
//    interface Functie_5 extends Functie_2 {
//        double g(int x);
//    }
//
//}
//
//
