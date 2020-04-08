package com.arvisdev.smmlib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.arvisdev")
public class SmmLibApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SmmLibApplication.class, args);
    }

}
