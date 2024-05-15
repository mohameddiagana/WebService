package sn.diagana.webservice.Web;



import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sn.diagana.webservice.Model.Compte;
import sn.diagana.webservice.Repository.CompteRepository;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/banque")
public class CompteJAXRSAPIRest {
//    @Autowired
    private CompteRepository compteRepository;

    public CompteJAXRSAPIRest(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    @Path("/comptes")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Compte> compteList() {
        return compteRepository.findAll( );
    }

    @Path("/comptes/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Compte getOne(@PathParam(value = "id") Long id) {
        return compteRepository.findById(id).get( );
    }

    @Path("/comptes")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }
    /* METHODE POUR LA mise a jour DU COMPTE ID*/


    @Path("/comptes/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Compte update(Compte compte, @PathParam("id") Long id) {
        compte.setId(id);
        return compteRepository.saveAndFlush(compte);
    }
    /* METHODE POUR LA SUPPRESIION DU COMPTE ID*/

    @Path("/comptes/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public void delete(@PathParam("id") Long id) {
        compteRepository.deleteById(id);
    }
}
