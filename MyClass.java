
class MyClass {
    static int staticVar = 42; // A static variable

    // Constructor
    MyClass() {
        System.out.println("Constructor called!");
    }

    // Non-static method
    void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    // Static method 1
    static void staticMethod1() {
        System.out.println("This is static method 1.");
    }

    // Static method 2
    static void staticMethod2() {
        System.out.println("This is static method 2.");
    }

    public static void main(String[] args) {
        // Create an object to call the non-static method
        MyClass obj = new MyClass();
        obj.nonStaticMethod();

        // Call the static methods directly
        staticMethod1();
        staticMethod2();
    }
}
