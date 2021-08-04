package course.operation;

public class ClassScheduled extends AbstractEvent {

    private Long id;

    public ClassScheduled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
