package org.nedioit.kafkademoindatacore.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {


    @Bean
    public NewTopic inDatacoreTopic(){
        return TopicBuilder.name("indatacore")
                .partitions(4)
                //.replicas(3)
               // .compact()
                .build();
    }

    // On peut créer ici autant de topics que l'on veut

}
