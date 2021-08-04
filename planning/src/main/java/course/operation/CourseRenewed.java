package course.operation;

public class CourseRenewed extends AbstractEvent {

    private Long id;

    public CourseRenewed(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
