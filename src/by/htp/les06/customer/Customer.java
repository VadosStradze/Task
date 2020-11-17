package by.htp.les06.customer;


import java.util.Objects;

public class Customer implements Comparable<Customer> {
    private Integer id;
    private static Integer idCounter = 1;
    private String firstName;
    private String lastName;
    private String pseudonym;
    private String THE_ADDRESS = "Soviet 236/2";
    private Integer cardNumber;
    private Integer bankAccountNumber;


    public Customer(String firstName, String lastName, Integer cardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;

        this.id = idCounter++;
    }

    public Customer() {

    }


    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public String getTheAddress() {
        return THE_ADDRESS;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(Integer bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return '\n' + "[Customer " +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", THE_ADDRESS='" + THE_ADDRESS + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankAccountNumber=" + bankAccountNumber + ']' + '\n';

    }

    @Override
    public int compareTo(Customer o) {
        int resultOfCompareFirstName = firstName.compareTo(o.getFirstName());
        if (resultOfCompareFirstName == 0) {
            return lastName.compareTo(o.getLastName());
        } else {
            return resultOfCompareFirstName;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) &&
                Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName) &&
                Objects.equals(pseudonym, customer.pseudonym) &&
                Objects.equals(THE_ADDRESS, customer.THE_ADDRESS) &&
                Objects.equals(cardNumber, customer.cardNumber) &&
                Objects.equals(bankAccountNumber, customer.bankAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, pseudonym, THE_ADDRESS, cardNumber, bankAccountNumber);
    }
}
