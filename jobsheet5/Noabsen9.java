public class Noabsen9 {
    public static void main(String[] args) {
        String A = "Star";
        String B = "Moon";
        String C = "Empty";

        C = A;
        A = "Empty";
        System.out.println("Step 1: A = " + A + ", B = " + B + ", C = " + C);

        A = B;
        B = "Empty";
        System.out.println("Step 2: A = " + A + ", B = " + B + ", C = " + C);

        B = C;
        C = "Empty";
        System.out.println("Step 3: A = " + A + ", B = " + B + ", C = " + C);

        System.out.println("True statements: (a) and (e)");
    }
}