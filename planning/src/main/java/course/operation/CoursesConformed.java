package course.operation;

public class CoursesConformed extends AbstractEvent {

    private Long id;
    private Long courseId;

    public CoursesConformed(){
        super();
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
