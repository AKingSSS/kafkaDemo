package com.kafka.demo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName KafkaProducer
 * @Description TODO
 * @Author yangkang
 * @Date 2019/5/2117:55
 * @Version 1.0
 **/
@Service
public class KafkaProducer {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    /**
     * 发送消息到kafka,主题为test
     */
    public void sendTest(){
        kafkaTemplate.send("test","hello,kafka  "
                + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
    }
}
