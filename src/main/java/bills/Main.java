package bills;

import bills.*;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args) {
        while(true) {

            int amount = scanner.nextInt();

            Bill bill20 = new Bill20();
            Bill bill10 = new Bill10();
            Bill bill5 = new Bill5();

            bill20.setNext(bill10);
            bill10.setNext(bill5);

            int res = bill20.process(amount);

            System.out.println(res);
        }

    }
}
