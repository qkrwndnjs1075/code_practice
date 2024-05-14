package Method;

public class exam3_m {
    public static void main(String[] args) {
        exam3 car = new exam3();

        car.setGas(5);

        boolean gasState = car.isLeftGas();
        if(gasState) {
            System.out.println("출발합니다");
            car.run();
        }

        if(car.isLeftGas()) {
            System.out.println("gas를 주입할 필요가 없습니다");
        }else {
            System.out.println("gas를 주입하세요");
        }
    }
}
