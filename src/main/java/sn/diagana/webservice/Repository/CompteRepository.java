package sn.diagana.webservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.diagana.webservice.Model.Compte;
@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}
