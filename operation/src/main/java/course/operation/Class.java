package course.operation;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Class_table")
public class Class {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long instructorId;
    private Long venueId;
    private Long courseId;
    private Date start;
    private Date end;

    @PostPersist
    public void onPostPersist(){
        ClassChanged classChanged = new ClassChanged();
        BeanUtils.copyProperties(this, classChanged);
        classChanged.publishAfterCommit();

        ClassScheduled classScheduled = new ClassScheduled();
        BeanUtils.copyProperties(this, classScheduled);
        classScheduled.publishAfterCommit();

        InstructorSelected instructorSelected = new InstructorSelected();
        BeanUtils.copyProperties(this, instructorSelected);
        instructorSelected.publishAfterCommit();

        VenueSelected venueSelected = new VenueSelected();
        BeanUtils.copyProperties(this, venueSelected);
        venueSelected.publishAfterCommit();

        // Get request from Calendar
        //course.operation.external.Calendar calendar =
        //    Application.applicationContext.getBean(course.operation.external.CalendarService.class)
        //    .getCalendar(/** mapping value needed */);

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Long instructorId) {
        this.instructorId = instructorId;
    }
    public Long getVenueId() {
        return venueId;
    }

    public void setVenueId(Long venueId) {
        this.venueId = venueId;
    }
    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }
    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }




}