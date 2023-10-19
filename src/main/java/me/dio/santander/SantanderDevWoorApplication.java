package me.dio.santander;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URl")})
@SpringBootApplication
public class SantanderDevWoorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SantanderDevWoorApplication.class, args);
    }

}
