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
    @Autowired CalendarRepository calendarRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverInstructorSelected_강사달력에추가(@Payload InstructorSelected instructorSelected){

        if(!instructorSelected.validate()) return;

        System.out.println("\n\n##### listener 강사달력에추가 : " + instructorSelected.toJson() + "\n\n");



        // Sample Logic //
        // Calendar calendar = new Calendar();
        // calendarRepository.save(calendar);

    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverClassChanged_카톡알림(@Payload ClassChanged classChanged){

        if(!classChanged.validate()) return;

        System.out.println("\n\n##### listener 카톡알림 : " + classChanged.toJson() + "\n\n");



        // Sample Logic //
        // Calendar calendar = new Calendar();
        // calendarRepository.save(calendar);

    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
