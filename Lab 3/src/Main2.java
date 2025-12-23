import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Test t = new Test();

        t.getdata();        // student data
        t.getmarks();      // marks
        t.Finalresult();   // calculate final

        System.out.println("\n--- Student Result ---");
        t.putdata();       // display student data
        t.putmarks();     // display marks
    }
}
