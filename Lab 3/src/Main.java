import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ===================== Lab Task No 1 ===================== */
        System.out.println("Lab task No 1");

        Address aliAddress =
                new Address("Fatima jinnah road ", "r-158", "Quetta", "2137");

        Person p1 = new Person("Abdullah", aliAddress);
        new Person("Awais", aliAddress);
        new Person("hamza", aliAddress);

        System.out.println(p1);
        System.out.println();


        /* ---------- Second method to create object ---------- */
        System.out.println("Second method to create an Object");

        Person p2 = new Person(
                "Ashraf",
                new Address(
                        "farima jinnah Road",
                        "r-158",
                        "Quetta",
                        "8" + "7300"
                )
        );

        System.out.println(p2);
        System.out.println();


        /* ===================== Lab Task No 2 ===================== */
        System.out.println("Lab task No 2");

        Date khanDob = new Date(10, 3, 1975);
        Date khanDoj = new Date(20, 5, 2010);

        Employee khan = new Employee("Khan", khanDob, khanDoj);

        System.out.println("Joined within last 5 years: "
                + khan.joinedWithinLastFiveYears());
        System.out.println("Age less than 40: "
                + khan.isYoungerThan40());

        System.out.println();


        /* ===================== Lab Task No 3 ===================== */
        System.out.println("Lab task No 3");

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter details for Book:");
        Book book = new Book();
        book.getdata(sc);

        System.out.println("\nBook Details:");
        book.putdata();

        System.out.println("\nEnter details for Tape:");
        AudioCassette tape = new AudioCassette();
        tape.getdata(sc);

        System.out.println("\nTape Details:");
        tape.putdata();

        sc.close();


        /* ===================== Lab Task No 4 ===================== */
        System.out.println();
        System.out.println(
                "Lab task No 4 object is created in main1 file " +
                        "because it produces an error in this file:"
        );


        /* ===================== Lab Task No 5 ===================== */
        System.out.println();
        System.out.println("Lab task No 5");

        Laptop defaultLaptop = new Laptop();
        defaultLaptop.display();

        System.out.println();

        Laptop myLaptop = new Laptop(
                64,
                16384,
                512000,
                3200,
                35.8,
                24.6,
                2.0,
                1.8
        );
        myLaptop.display();


        /* ===================== Home Task No 1 ===================== */
        System.out.println();
        System.out.println(
                "Home task No 1 object is created in main2 file " +
                        "because it produces an error in this file:"
        );


        /* ===================== Home Task No 2 ===================== */
        System.out.println();
        System.out.println("Home task No 2:");

        System.out.println("=== Using Parent Class ===");
        Simple s = new Simple(10, 5);
        s.add();
        s.sub();
        s.mul();
        s.div();

        System.out.println("\n=== Using Child Class ===");
        Complex c1 = new Complex(10, 5);
        c1.add();
        c1.sub();
        c1.mul();
        c1.div();

        System.out.println("\n=== Child Class with Invalid Values ===");
        Complex c2 = new Complex(-3, 5);
        c2.add();
        c2.sub();
        c2.mul();
        c2.div();


        /* ===================== Home Task No 3 ===================== */
        System.out.println();
        System.out.println("Home task No 3:");

        More_Electricity electricity = new More_Electricity(450);
        System.out.println("Total Bill = Rs. " + electricity.Bill());


        /* ===================== Home Task No 4 ===================== */
        System.out.println();
        System.out.println("Home task No 4:");

        Package normal = new Package(
                "Ali", "Street 1", "Lahore", "Punjab", "54000",
                "Ahmed", "Street 2", "Karachi", "Sindh", "74000",
                10, 5
        );

        TwoDayPackage twoDay = new TwoDayPackage(
                "Ali", "Street 1", "Lahore", "Punjab", "54000",
                "Ahmed", "Street 2", "Karachi", "Sindh", "74000",
                10, 5, 20
        );

        OvernightPackage overnight = new OvernightPackage(
                "Ali", "Street 1", "Lahore", "Punjab", "54000",
                "Ahmed", "Street 2", "Karachi", "Sindh", "74000",
                10, 5, 2
        );

        System.out.println("Normal Package Cost: " + normal.calculateCost());
        System.out.println("Two Day Package Cost: " + twoDay.calculateCost());
        System.out.println("Overnight Package Cost: " + overnight.calculateCost());
    }
}
