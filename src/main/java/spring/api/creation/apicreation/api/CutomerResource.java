package spring.api.creation.apicreation.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.creation.apicreation.model.Customer;
import spring.api.creation.apicreation.service.customerservice;

import java.util.List;

@RestController
@RequestMapping(value ="/customers")
public class CutomerResource {
    @Autowired
    private customerservice customerServices;
    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return customerServices.addCustomer(customer);
    }
    @GetMapping
    public List<Customer> getCustomer() {
        return customerServices.getCustomer();
    }
    @GetMapping(value="/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") int customerId){
        return customerServices.getCustomer(customerId);
    }
    @PutMapping(value="/{customerId}")
    public Customer updateCustomer(@PathVariable("customerId") int customerId, @RequestBody Customer customer){
        return customerServices.updateCustomer(customerId,customer);
    }

    @DeleteMapping(value="/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") int customerId){
        customerServices.deletCustomer(customerId);
    }
}
