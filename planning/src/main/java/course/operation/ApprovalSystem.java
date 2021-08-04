package course.operation;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="ApprovalSystem_table")
public class ApprovalSystem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long courseId;

    @PostPersist
    public void onPostPersist(){
        CoursesConformed coursesConformed = new CoursesConformed();
        BeanUtils.copyProperties(this, coursesConformed);
        coursesConformed.publishAfterCommit();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }




}