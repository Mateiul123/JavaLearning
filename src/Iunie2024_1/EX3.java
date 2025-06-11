package Iunie2024_1;

class A {
    int intA;

    public A met1() {
        return new A();
    }

    private void met2() {
    }

    public void met3() {
    }

    public static void met4() {
    }

    private int met5(int i) {
        return 5;
    }
}

class B extends A {
    int intB;

    @Override // ✅ valid override (covariant return type)
    public B met1() {
        return new B();
    }

    // ⚠️ Not an override: met2() in A is private
    // This is a new method in B
    public void met2() {
    }

    // ❌ ERROR: met3() is public in A, cannot override with private
    // This will cause a compile-time error
//    @Override
//    private void met3() {} // ❌ compile error: attempting to reduce visibility

    // ⚠️ This is method hiding, not overriding (static method)
    public static void met4() {
    }

    // ⚠️ Overloading: same name, different parameters than A.met5(int)
    private int met5() {
        return 5;
    }
}

