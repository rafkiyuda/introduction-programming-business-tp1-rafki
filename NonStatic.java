public class NonStatic {

    void methodNonStatic() {
        System.out.println("Ini method non-static");
    }

    public static void main(String[] args) {

        NonStatic obj = new NonStatic();
        obj.methodNonStatic();
    }
}
