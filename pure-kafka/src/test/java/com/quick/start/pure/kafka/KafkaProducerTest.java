package com.quick.start.pure.kafka;


import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class KafkaProducerTest {

    @Autowired
    KafkaProducer<String, String> kafkaProducer;

    @Test
    public void send() {
        kafkaProducer.send(new ProducerRecord<>("mykafka", "hello kafka"));
        System.out.println("send ok");
    }
}
