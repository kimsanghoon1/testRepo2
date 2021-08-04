package course.operation;

public class NewEvent extends AbstractEvent {

    private Long id;

    public NewEvent(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
