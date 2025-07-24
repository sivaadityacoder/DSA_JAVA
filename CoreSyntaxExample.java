public class CoreSyntaxExample {
    // Method example
    static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        // Loop example
        for (int i = 1; i <= 5; i++) {
            // Conditional example
            if (i % 2 == 0) {
                System.out.println(i + " is even, square: " + square(i));
            } else {
                System.out.println(i + " is odd, square: " + square(i));
            }
        }
    }
}