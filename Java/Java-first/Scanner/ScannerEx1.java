package ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        int foodName = input.nextInt();

        System.out.print("음식의 가격을 입력해주세요: ");
        int foodPrice = input.nextInt();

        System.out.print("음식의 수량을 입력해주세요: ");
        int foodQuantity = input.nextInt();

        int total = foodPrice * foodQuantity;

        System.out.println(foodName+"" + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + total+ "원입니다" );

    }
}
