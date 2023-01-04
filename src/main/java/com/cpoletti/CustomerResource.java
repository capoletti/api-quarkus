package com.cpoletti;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/customer")
public class CustomerResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String customerList() {

        List<Integer> lista = Arrays.asList(1,5,8,9,9,4,6,7);

        lista.stream()
                .distinct()
                .sorted()
                .forEach(e -> System.out.println(e));

        return "customer";
    }
}
