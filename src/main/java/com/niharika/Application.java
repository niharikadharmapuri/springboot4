package com.niharika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication app= new SpringApplication(Application.class);
        app.run();
    }
}


// to run different profiles use  java -jar DSpring.profiles.active=prod thejarfilename.jar