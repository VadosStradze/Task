package by.htp.les06.customer;


import java.util.Collections;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //1


        Scanner scanner = new Scanner(System.in);
        Check list = new Check();

        Customer customer = new Customer("Dados", "Stradze", 44564);
        Customer customer1 = new Customer("Serega", "Kushner", 3186);
        Customer customer2 = new Customer("Sasha", "Regav", 9841);
        Customer customer3 = new Customer("Cesha", "Valic", 8721);
        Customer customer4 = new Customer("Gena", "Patirson", 10334);
        Customer customer5 = new Customer("Serega", "Ali", 65462);
        list.add(customer);
        list.add(customer1);
        list.add(customer2);
        list.add(customer3);
        list.add(customer4);
        list.add(customer5);
        Collections.sort(list.getShoppingList());
        System.out.println("//1");
        System.out.println(list.getShoppingList());
        CheckLogic finder = new CheckLogic();
        System.out.println("//2");
        System.out.println(finder.find(list, 0, 9999));


    }

}