package com.ctag.hotel.rest.api;

import com.ctag.hotel.rest.api.*;
import com.ctag.hotel.rest.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import com.ctag.hotel.rest.model.ErrorDto;
import com.ctag.hotel.rest.model.ReservasDto;
import com.ctag.hotel.rest.model.ReservasExtendedHabitacionTipoDto;
import com.ctag.hotel.rest.model.ReservasExtendedUserDto;


import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;
import org.seedstack.business.Service;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-05-12T10:58:18.153+02:00[Europe/Paris]")@Service
public interface ReservasApiService {
    public Response getReservaByHabitacionTipo(Integer id, SecurityContext securityContext, UriInfo uriInfo);
    public Response getReservaByUserId(Integer id, SecurityContext securityContext, UriInfo uriInfo);
    public Response getReservas( Integer id, SecurityContext securityContext, UriInfo uriInfo);
}
