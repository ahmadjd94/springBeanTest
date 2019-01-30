package JavaLearn.internal;

import JavaLearn.internal.Address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Building {
    @Autowired
    private Address address;

    public Building(Address address){
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
