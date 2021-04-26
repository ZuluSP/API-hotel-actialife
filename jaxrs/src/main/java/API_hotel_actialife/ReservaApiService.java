package API_hotel_actialife;

import API_hotel_actialife.*;
import actialife.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;



import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;
import org.seedstack.business.Service;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-04-26T12:23:21.276+02:00[Europe/Paris]")@Service
public interface ReservaApiService {
    public Response createreserva(SecurityContext securityContext, UriInfo uriInfo);
    public Response deletereserva(Integer id, SecurityContext securityContext, UriInfo uriInfo);
    public Response getReservaById(Integer id, SecurityContext securityContext, UriInfo uriInfo);
    public Response updatereserva(ReservasUpdateDto body, Integer id, SecurityContext securityContext, UriInfo uriInfo);
}
