package pl.knowosad.client.api;

import com.gwtplatform.dispatch.rest.shared.RestAction;
import pl.knowosad.client.Contact;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/orders/all")  //TODO
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface ContactResource {

  @GET
  RestAction<List<Contact>> getContacts();

  @GET
  List<Contact> getContactsList();


}
