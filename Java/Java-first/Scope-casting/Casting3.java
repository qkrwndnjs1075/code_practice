package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최  고값 + 1(초과)
        int intValue;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting = " + maxIntValue);

        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver casting=" + intValue);
    }
}
