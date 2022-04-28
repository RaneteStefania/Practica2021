package com.example.proiect.device;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class DeviceConfig {

    @Bean
    CommandLineRunner commandLineRunner(DeviceRepository repository){
        return args -> {
            Device device1 = new Device(
                    "Corp C",
                    3,
                    16.6F,
                    7,
                    LocalDate.of(2021, AUGUST, 15));
            Device device2 = new Device(
                    "Corp V",
                    5,
                    14.8F,
                    12,
                    LocalDate.now());

            repository.saveAll(
                    List.of(device1, device2)
            );
        };
    }
}
