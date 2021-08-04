package course.operation;

public class CoursesDeveloped extends AbstractEvent {

    private Long id;
    private String name;
    private String description;
    private Integer minEnrollment;

    public CoursesDeveloped(){
        super();
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
