package course.operation;

public class VenueSelected extends AbstractEvent {

    private Long id;

    public VenueSelected(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
