package com.totobhuto.bhootui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZonedDateTime;

@SpringBootApplication
public class BootUiApplication {

    public static void main(String[] args) {
        System.out.println("[BHOOT-UI] " + ZonedDateTime.now().getOffset().getId());
//        ZoneId zoneIndia = ZoneId.of("Europe/London");
//        System.out.println("[BHOOT-UI In India] " + zoneIndia.getRules().getOffset(LocalDateTime.now()));


        SpringApplication.run(BootUiApplication.class, args);
    }

}
