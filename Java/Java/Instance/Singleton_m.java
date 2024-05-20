package Instance;

public class Singleton_m {
    public static void main(String[] args) {
        /* Singleton obj1 = new Singleton();*/
        /* Singleton obj1 = new Singleton();*/

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        }else {
            System.out.println("다른 Singletib 객체입니다");
        }
    }
}
