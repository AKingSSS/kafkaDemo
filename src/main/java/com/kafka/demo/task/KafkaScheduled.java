package com.kafka.demo.task;

import com.kafka.demo.producer.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @ClassName KafkaScheduled
 * @Description TODO
 * @Author yangkang
 * @Date 2019/5/2117:59
 * @Version 1.0
 **/

@Service
public class KafkaScheduled {
    private static Logger logger = LoggerFactory.getLogger(KafkaScheduled.class);
    @Autowired
    private KafkaProducer kafkaSender;

    /**
     * 然后每隔1分钟执行一次
     * @throws Exception
     */
    @Scheduled(fixedRate = 1000 * 20)
    public void testKafka() throws Exception {
        logger.info("KafkaScheduled...start");
        kafkaSender.sendTest();
    }
}
