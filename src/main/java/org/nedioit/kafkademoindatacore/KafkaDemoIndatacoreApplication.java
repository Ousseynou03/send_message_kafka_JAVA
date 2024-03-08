package org.nedioit.kafkademoindatacore;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class KafkaDemoIndatacoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaDemoIndatacoreApplication.class, args);
    }


/*    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
        return args -> {
            for (int i = 0; i < 10; i++) {
                kafkaTemplate.send("test_indatacore_kafka", "dione send message kafka : " + i);
            }

        };
    }*/

}
