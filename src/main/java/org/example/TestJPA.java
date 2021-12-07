package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJPA implements ApplicationRunner {

    @Autowired
    private CityInfoDAO cityInfoDAO;

    public static  void main(String [] args){
        SpringApplication.run(TestJPA.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(cityInfoDAO !=null);
        CityInfo cityInfo = new CityInfo(1,"seoni", "seoni");
        cityInfoDAO.save(cityInfo);
    }

    /*when we implement CommandLineRunner then we override following run
    @Override
    public void run(String... args) throws Exception {

            System.out.println(cityInfoDAO !=null);
    }*/


}
