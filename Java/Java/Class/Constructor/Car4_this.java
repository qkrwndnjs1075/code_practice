package Class;

public class Car4_this {
    //팔드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자

    Car4_this() {
    }

    Car4_this(String model){
        this(model,"은색", 250);
    }

    Car4_this(String model, String color){
        this(model,color,250);
    }

    Car4_this(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
