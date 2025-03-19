package ma.emsi.CharityWebApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

//@Setter @Getter
@AllArgsConstructor @NoArgsConstructor
@Data @Entity
public class Organisation {

    //attributs
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String description;
    private Integer  fiscalNumber;
    private String telephone;
    private Boolean isActive;
    private Date dateCreated;



}
