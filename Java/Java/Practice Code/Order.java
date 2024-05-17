package Finish;

public class Order {
    private static final double TAX = 0.1;
    protected String item;
    protected int doGsu;

    public Order(String item, int doGsu) {
        this.item = item;
        this.doGsu = doGsu;
    }

    public double calculateTotal(double Coffee) {
        double subtotal = Coffee * doGsu;
        double tax = subtotal * TAX;
        return subtotal + tax;
    }

    @Override
    public String toString() {
        return "주문 내역: " + doGsu + " 개의 " + item;
    }
}
