import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student s1 = new Student();   // object created using default constructor

        s1.getdata(scan);               // input data
        s1.display();                 // display data

        scan.close();
    }
}
