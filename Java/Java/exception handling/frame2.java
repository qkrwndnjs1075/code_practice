package practice;

public class frame2 {
    public static void main(String[] args) {
        String data1="100";
        String data2="a100"; // 문자열이 숫자로 변환할 수 없어서 NumberFormatException이 발생함

        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2); // 문자열이 숫자로 변환할 수 없어서 NumberFormatException이 발생함

        int result = value1 + value2;
        System.out.println(data1+ "+" + data2 + "=" + result);

    }
}
