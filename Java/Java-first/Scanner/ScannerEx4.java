package ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        while(true){

            System.out.print("번호를 누르시오(1: 상품입력, 2: 결재 3: 종료): ");
            int op = scanner.nextInt(); // \n

            if(op == 1){
                System.out.print("상품명 입력: ");
                 scanner.nextLine();
                String p = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int pp = scanner.nextInt();


                System.out.print("상품의 수량을 입력하세요: ");
                int count = scanner.nextInt();

                total+=pp*count;
                double all = (double) pp * count;

                System.out.println("상품명: " + p +" 상품의 가격: " +pp + "상품의 수량: " + count + "합계: " + all);
            }else if(op == 2){

                System.out.println(total);
            }else if(op==3){
                System.out.println("종료합니다");
                break;
            }
        }
    }
}
