package org.example;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="City")
public class City {

    private String name;
    private  String state;
    private CityInfo cityInfo;

    public City() {
    }

    public City(String name, String state, CityInfo cityInfo) {
        this.name = name;
        this.state = state;
        this.cityInfo = cityInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CityInfo getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }
}
