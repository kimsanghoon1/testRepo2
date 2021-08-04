package course.operation;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="CourseList_table")
public class CourseList {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String title;
        private Integer minEnroll;
        private Boolean active;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
        public Integer getMinEnroll() {
            return minEnroll;
        }

        public void setMinEnroll(Integer minEnroll) {
            this.minEnroll = minEnroll;
        }
        public Boolean getActive() {
            return active;
        }

        public void setActive(Boolean active) {
            this.active = active;
        }

}
