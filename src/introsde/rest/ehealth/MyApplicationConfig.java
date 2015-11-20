package introsde.rest.ehealth;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
/**
 * Application configs
 * @author Toomas
 *
 */
@ApplicationPath("sdelab")
public class MyApplicationConfig extends ResourceConfig {
    public MyApplicationConfig () {
        packages("introsde.rest.ehealth");
    }
}
