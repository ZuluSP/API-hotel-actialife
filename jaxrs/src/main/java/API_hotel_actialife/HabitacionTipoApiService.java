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
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-05-10T14:13:55.611+02:00[Europe/Paris]")@Service
public interface HabitacionTipoApiService {
    public Response createHabitacionTipo(HabitacionTipoCreateDto body, SecurityContext securityContext, UriInfo uriInfo);
    public Response deleteHabitacionTipo(Integer id, SecurityContext securityContext, UriInfo uriInfo);
    public Response getAllRooms(SecurityContext securityContext, UriInfo uriInfo);
    public Response getHabitacionTipoById(Integer id, SecurityContext securityContext, UriInfo uriInfo);
    public Response updateHabitacionTipo(HabitacionTipoUpdateDto body, Integer id, SecurityContext securityContext, UriInfo uriInfo);
}
