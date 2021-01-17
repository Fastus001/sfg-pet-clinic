package fastus.springframework.sfgpetclinic.model;

/**
 * Created by Tom - 28.12.2020
 */
public class Speciality extends BaseEntity{
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
