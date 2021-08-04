package course.operation;

import course.operation.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class CourseListViewHandler {


    @Autowired
    private CourseListRepository courseListRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenCoursesDeveloped_then_CREATE_1 (@Payload CoursesDeveloped coursesDeveloped) {
        try {

            if (!coursesDeveloped.validate()) return;

            // view 객체 생성
            CourseList courseList = new CourseList();
            // view 객체에 이벤트의 Value 를 set 함
            courseList.setTitle(coursesDeveloped.getName());
            courseList.setMinEnroll(coursesDeveloped.getMinEnrollment());
            courseList.setId(coursesDeveloped.getId());
            // view 레파지 토리에 save
            courseListRepository.save(courseList);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenCoursesConformed_then_UPDATE_1(@Payload CoursesConformed coursesConformed) {
        try {
            if (!coursesConformed.validate()) return;
                // view 객체 조회
            Optional<CourseList> courseListOptional = courseListRepository.findById(coursesConformed.getCourseId());

            if( courseListOptional.isPresent()) {
                 CourseList courseList = courseListOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                 courseList.setActive(true);
                // view 레파지 토리에 save
                 courseListRepository.save(courseList);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

