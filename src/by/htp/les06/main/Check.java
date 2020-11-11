package by.htp.les06.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Check  {

    private List<Customer> shoppingList;

    public Check() {
        List<Customer> shoppingList = new ArrayList<>();
        this.shoppingList = shoppingList;
    }

    public void add(Customer customer){
        this.shoppingList.add(customer);
        Collections.sort(this.shoppingList);
    }

    public void remove(Customer customer){
        this.shoppingList.remove(customer);

    }

    public List<Customer> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<Customer> shoppingList) {
        this.shoppingList = shoppingList;
    }

}
