package com.kafka.demo.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @ClassName KafkaCustomer
 * @Description TODO
 * @Author yangkang
 * @Date 2019/5/2117:56
 * @Version 1.0
 **/
@Service
public class KafkaCustomer {
    protected static Logger logger= LoggerFactory.getLogger(KafkaCustomer.class);
    /**
     * 监听test主题,有消息就读取
     * @param message
     */
    @KafkaListener(topics = {"test"})
    public void consumer(String message){
        logger.info("test topic message : {}", message);
    }
}
