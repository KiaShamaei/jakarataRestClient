package ir.digixo;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import org.glassfish.jersey.client.ClientConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       String url="http://localhost:8080/rest/myservice1/m3";

        ClientConfig config=new ClientConfig();
        Client client = ClientBuilder.newClient(config);

        WebTarget target = client.target(url);

        Product response = target.request().accept(MediaType.APPLICATION_JSON).get(Product.class);

        System.out.printf(response.getName());
    }
}
