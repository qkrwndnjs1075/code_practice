package Method;

public class exam1_m {
    public static void main(String[] args) {
        exam1 c = new exam1();
        c.powerOn();

        int result1 = c.plus(5,6);
        System.out.println("result1: "+ result1);

        byte x = 10;
        byte y = 4;

        double result2 = c.divide(x,y);
        System.out.println("result2: " + result2);

        c.powerOff();
    }
}
