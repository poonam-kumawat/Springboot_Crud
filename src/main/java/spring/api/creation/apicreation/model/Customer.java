package spring.api.creation.apicreation.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    @JsonProperty("id")
    private int customerId;
    @JsonProperty("FirstName")
    private String customerFirstName;
    @JsonProperty("LastName")
    private String CustomerLastname;
    @JsonProperty("Email")
    private String customerEmail;


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastname() {
        return CustomerLastname;
    }

    public void setCustomerLastname(String CustomerLastname) {
        this.CustomerLastname = CustomerLastname;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }


}
