package bhansaghar;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = myObj.nextLine();

        System.out.println("Hi "+name);
        myObj.close();
    }
    
}
