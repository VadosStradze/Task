package by.htp.les06.customer;

import java.util.ArrayList;
import java.util.List;

public class Check {

    private List<Customer> shoppingList;

    public Check() {
        shoppingList = new ArrayList<>();

    }

    public void add(Customer customer) {
        this.shoppingList.add(customer);
    }

    public void remove(Customer customer) {
        this.shoppingList.remove(customer);

    }

    public List<Customer> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<Customer> shoppingList) {
        this.shoppingList = shoppingList;
    }

}
