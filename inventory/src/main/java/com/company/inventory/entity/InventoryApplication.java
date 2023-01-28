package com.company.inventory.entity;

import com.company.inventory.entity.repository.InventoryRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class InventoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(InventoryApplication.class,args);
    }
    @Bean
    public CommandLineRunner loadData(InventoryRepo inventoryRepo){
        return args -> {
            Inventory inventory= new Inventory();
            inventory.setSkuCode("iphone 13");
            inventory.setQuantity(100);

            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("iphone 13 red");
            inventory1.setQuantity(0);

            inventoryRepo.save(inventory);
            inventoryRepo.save(inventory1);
        };
    }
}
