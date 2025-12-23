import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // ================= Lab Task No 1 =================
        System.out.println("Lab task No 1");
        for (int i = 0; i < 9; i++) {
            new CounterClass();
        }
        System.out.println();


        // ================= Lab Task No 2 =================
        System.out.println("Lab task No 2");
        int count = CounterClass.getCount();
        System.out.println("The total Objects in this class are: " + count);
        System.out.println();


        // ================= Lab Task No 3 =================
        System.out.println("Lab task No 3");

        Int num1 = new Int();        // initialized to 0
        Int num2 = new Int(100);     // initialized to 100

        System.out.println("Before initialization:");
        num1.display();

        System.out.println("After initialization:");
        num2.display();

        num2.setValue(50);
        System.out.println("After changing:");
        num2.display();
        System.out.println();


        // ================= Lab Task No 4 =================
        System.out.println("Lab task No 4");

        Time time1 = new Time();
        time1.input();
        time1.display12Hour();
        time1.display24Hour();
        System.out.println();


        // ================= Lab Task No 5 =================
        System.out.println("Lab task No 5");

        Marks ali = new Marks(85, 75, 99);
        ali.sum();
        ali.average();
        System.out.println();


        // ================= Home Task No 1 =================
        System.out.println("Home task No 1");

        Rectangle rectangle1 = new Rectangle(4, 40);
        rectangle1.getArea();
        rectangle1.getPerimeter();

        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        rectangle2.getArea();
        rectangle2.getPerimeter();
        System.out.println();


        // ================= Home Task No 2 =================
        System.out.println("Home task No 2");

        Stock orcl = new Stock(
                "ORCL",
                "Oracle Corporation",
                34.5,
                34.35
        );
        orcl.getChangePercent();
        System.out.println();


        // ================= Home Task No 3 =================
        System.out.println("Home task No 3 in DateLib file");
        System.out.println();


        // ================= Home Task No 4 =================
        System.out.println("Home task No 4 in RandomNumber file");
        System.out.println();


        // ================= Home Task No 5 =================
        System.out.println("Home task No 5");
        System.out.println();

        Account hamza = new Account(
                1122,
                20000,
                new Date(5, 10, 2000)
        );

        System.out.println(hamza);
        System.out.println();

        hamza.withdraw(2500);
        System.out.println();

        hamza.deposit(3000);
    }
}
