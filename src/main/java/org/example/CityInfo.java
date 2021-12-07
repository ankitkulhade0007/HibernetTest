package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CityInfo {

    @Id
    private int pincode;
    private String area, city;

    public CityInfo() {
    }

    public CityInfo(int pincode, String area, String city) {
        this.pincode = pincode;
        this.area = area;
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
