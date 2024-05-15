package sn.diagana.webservice.Model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@Getter
@AllArgsConstructor
@Builder
@Setter
public class Compte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Double solde;
    @Temporal(TemporalType.DATE)
        private Date datecreation;
    @Enumerated(EnumType.STRING)
    private TypeCompte type;

}
