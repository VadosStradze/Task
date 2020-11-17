package by.htp.les06.customer;

import java.util.ArrayList;
import java.util.List;

public class CheckLogic {

    public List<Customer> find(Check bank, int cardNumberMin, int cardNumberMax) {
        List<Customer> accounts;
        List<Customer> result = new ArrayList<>();
        accounts = bank.getShoppingList();
        for (Customer ac : accounts) {
            if (ac.getCardNumber() > cardNumberMin && ac.getCardNumber() < cardNumberMax) {
                result.add(ac);
            }
        }
        return result;

    }

    public CheckLogic() {

    }
}
