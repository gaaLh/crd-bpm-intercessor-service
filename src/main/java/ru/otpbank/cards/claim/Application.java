package ru.otpbank.cards.claim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.otpbank.cards.claim.config.ApplicationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
public class Application {

    public static void main(String[] args) {
        System.err.close();
        System.setErr(System.out);

        groupingBy();


        SpringApplication.run(Application.class, args);
    }
}
