package com.ctag.hotel.rest.api;

import com.ctag.hotel.rest.api.*;
import com.ctag.hotel.rest.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;



import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;
import org.seedstack.business.Service;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-05-12T10:58:18.153+02:00[Europe/Paris]")@Service
public interface UserApiService {
    public Response createuser(UsercreateDto body, SecurityContext securityContext, UriInfo uriInfo);
    public Response deleteuser(Integer id, SecurityContext securityContext, UriInfo uriInfo);
    public Response findUsers( Integer id,  String name, SecurityContext securityContext, UriInfo uriInfo);
    public Response getUserById(Integer id, SecurityContext securityContext, UriInfo uriInfo);
    public Response getUserByRole(Integer id, SecurityContext securityContext, UriInfo uriInfo);
    public Response updateuser(UserUpdateDto body, Integer id, SecurityContext securityContext, UriInfo uriInfo);
}
