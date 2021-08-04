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
    @Autowired 추천시스템Repository 추천시스템Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverEnrolled_CollectData(@Payload Enrolled enrolled){

        if(!enrolled.validate()) return;

        System.out.println("\n\n##### listener CollectData : " + enrolled.toJson() + "\n\n");



        // Sample Logic //
        // 추천시스템 추천시스템 = new 추천시스템();
        // 추천시스템Repository.save(추천시스템);

    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
