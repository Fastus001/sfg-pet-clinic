package fastus.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by Tom - 28.12.2020
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity{

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

}
