package course.operation;

public class ClassPublished extends AbstractEvent {

    private Long id;

    public ClassPublished(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
