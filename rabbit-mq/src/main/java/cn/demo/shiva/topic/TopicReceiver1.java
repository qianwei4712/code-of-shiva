package cn.demo.shiva.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author shiva   2021/9/4 21:46
 */
@Component
@RabbitListener(queues = "topic.queue1")
public class TopicReceiver1 {

    @RabbitHandler
    public void process(Map<String, Object> message) {
        System.out.println("topic.queue1 收到消息  : " + message.toString());
    }
}