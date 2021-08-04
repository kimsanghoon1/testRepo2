package course.operation;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Course_table")
public class Course {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Integer minEnrollment;

    @PostPersist
    public void onPostPersist(){
        CourseRenewed courseRenewed = new CourseRenewed();
        BeanUtils.copyProperties(this, courseRenewed);
        courseRenewed.publishAfterCommit();

        CoursesDeveloped coursesDeveloped = new CoursesDeveloped();
        BeanUtils.copyProperties(this, coursesDeveloped);
        coursesDeveloped.publishAfterCommit();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getMinEnrollment() {
        return minEnrollment;
    }

    public void setMinEnrollment(Integer minEnrollment) {
        this.minEnrollment = minEnrollment;
    }




}