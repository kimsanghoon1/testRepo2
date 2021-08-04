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
    @Autowired CourseRepository courseRepository;
    @Autowired ApprovalSystemRepository approvalSystemRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCoursesDeveloped_상신(@Payload CoursesDeveloped coursesDeveloped){

        if(!coursesDeveloped.validate()) return;

        System.out.println("\n\n##### listener 상신 : " + coursesDeveloped.toJson() + "\n\n");



        // Sample Logic //
        // Course course = new Course();
        // courseRepository.save(course);
        // ApprovalSystem approvalSystem = new ApprovalSystem();
        // approvalSystemRepository.save(approvalSystem);

    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCourseRenewed_상신(@Payload CourseRenewed courseRenewed){

        if(!courseRenewed.validate()) return;

        System.out.println("\n\n##### listener 상신 : " + courseRenewed.toJson() + "\n\n");



        // Sample Logic //
        // Course course = new Course();
        // courseRepository.save(course);
        // ApprovalSystem approvalSystem = new ApprovalSystem();
        // approvalSystemRepository.save(approvalSystem);

    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
