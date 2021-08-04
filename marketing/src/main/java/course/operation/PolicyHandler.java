package course.operation;

import course.operation.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @Autowired WebSiteRepository webSiteRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverClassScheduled_PublishClass(@Payload ClassScheduled classScheduled){

        if(!classScheduled.validate()) return;

        System.out.println("\n\n##### listener PublishClass : " + classScheduled.toJson() + "\n\n");



        // Sample Logic //
        // WebSite webSite = new WebSite();
        // webSiteRepository.save(webSite);

    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
