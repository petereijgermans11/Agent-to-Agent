package nl.petereijgermans;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/hello")
public class GreetingResource {


    private final IronRam ram;

    public GreetingResource(IronRam ram) {
        this.ram = ram;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @GET
    @Path("/search")
    public Response searchItems(@QueryParam("word") List<String> words) {
        // If no words are provided, return 400 Bad Request or all items (you can decide)
        if (words == null || words.isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("At least one 'word' query parameter is required.")
                    .build();
        }

        List<KeyObject> results = KeyObject.findByDescriptionContainingAllWords(words);
        return Response.ok(results).build();
    }

    @Path("ironram")
    @GET
    public List<String> ironram() {
        return ram.collect("infinite stone");
    }

}
