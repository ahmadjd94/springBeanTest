package JavaLearn.internal;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String street;
    private int buildingNumber;

    public Address(){
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public int getBuildingNumber(){
        return this.buildingNumber;
    }

    public String getStreet(){
        return this.street;
    }
}
