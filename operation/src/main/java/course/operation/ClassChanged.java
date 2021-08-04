package course.operation;

public class ClassChanged extends AbstractEvent {

    private Long id;

    public ClassChanged(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
