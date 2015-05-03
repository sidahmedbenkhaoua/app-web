package dz.sbenkhaoua.roadtraffic.module.modules;

/**
 * Created by sbenkhaoua on 04/04/15.
 */
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/entrypoint")
public class EntryPoint {

    @POST
    public void test() {
        System.out.println("sssssssssssssssssssssssssssssssssss");
    }
}