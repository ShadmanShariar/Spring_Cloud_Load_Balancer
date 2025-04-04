package com.techno.town.techie.main.configuration;

import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class InventoryConfiguration {

    @Bean
    @Primary
    ServiceInstanceListSupplier supplier(){
        return new ProductServiceInstanceSupplier("product-service");
    }
}
