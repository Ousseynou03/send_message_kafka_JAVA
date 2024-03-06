package org.nedioit.kafkademoindatacore;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {


    @KafkaListener(
            topics = "indatacore",
            groupId = "groupId"
    )
    void kafkaListener(String data){
        System.out.println("Listener received :" + data);
    }
}
