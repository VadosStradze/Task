package by.htp.les06.main;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Check list = new Check();

        Customer customer = new Customer("Dados", "Stradze", 44564);
        Customer customer1 = new Customer("Serega", "Kushner", 3186);
        Customer customer2 = new Customer("Sasha", "Regav", 9841);
        Customer customer3 = new Customer("Cesha", "Valic", 8721);
        Customer customer4 = new Customer("Gena", "Patirson", 1334);
        Customer customer5 = new Customer("Serega", "Ali", 6462);
        list.add(customer);
        list.add(customer1);
        list.add(customer2);
        list.add(customer3);
        list.add(customer4);
        list.add(customer5);
        System.out.println(list.getShoppingList());

    }
}
