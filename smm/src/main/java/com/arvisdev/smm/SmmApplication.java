package com.arvisdev.smm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.arvisdev.smmlib")
public class SmmApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SmmApplication.class, args);
    }

}
