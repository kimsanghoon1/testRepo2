package course.operation;

public class InstructorSelected extends AbstractEvent {

    private Long id;
    private Long instructorId;
    private Long venueId;
    private Long courseId;
    private Date start;
    private Date end;

    public InstructorSelected(){
        super();
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
