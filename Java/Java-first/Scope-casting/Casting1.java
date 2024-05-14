package casting;

public class Casting1 {
    public static void main(String[] args) {
        int i = 10;
        long l;
        double d;

        l = i; // int -> long
        System.out.println("d = " + l);

        d = i; // int -> double
        System.out.println("d = " + d);

        d = 20L; // long -> double
        System.out.println("d2 = " + d);
    }
}
