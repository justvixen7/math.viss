

public class Main {
    void main() {
        int a = 10;
        int b = 5;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.main(); // вызываем твой метод
    }
}



