package API_hotel_actialife;

import API_hotel_actialife.*;
import actialife.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import actialife.ErrorDto;
import actialife.ReservasDto;
import actialife.ReservasExtendedHabitacionTipoDto;
import actialife.ReservasExtendedUserDto;


import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;
import org.seedstack.business.Service;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-04-28T09:02:06.631+02:00[Europe/Paris]")@Service
public interface ReservasApiService {
    public Response getReservaByHabitacionTipo(Integer id, SecurityContext securityContext, UriInfo uriInfo);
    public Response getReservaByUserId(Integer id, SecurityContext securityContext, UriInfo uriInfo);
    public Response getReservas( Integer id, SecurityContext securityContext, UriInfo uriInfo);
}
