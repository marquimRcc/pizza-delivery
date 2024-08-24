package academy.quarkus.pizza;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/pizza")
public class PizzaResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pizza> getAll(){
        var pizza1 = new Pizza();
        pizza1.description = "Mussarela";
        return  List.of(pizza1);

    }
}
