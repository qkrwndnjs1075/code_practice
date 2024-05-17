package Finish;

public class Customer_m {
    public static void main(String[] args) {

        CustomerInfo customer = new Person("박주원", "010-2038-6018");
        Order order = new Order("아메리카노", 3);

        System.out.println("고객: " + customer.getName());
        System.out.println("전화번호: " + customer.getPhoneNumber());
        System.out.println(order);

        double pricePerItem = 5000; // 커피 1잔 가격
        double totalPrice = order.calculateTotal(pricePerItem);
        System.out.println("가격: " + totalPrice + "원");
    }
}
