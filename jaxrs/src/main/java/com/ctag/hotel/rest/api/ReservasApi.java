package com.ctag.hotel.rest.api;

import javax.inject.Inject;

import com.ctag.hotel.rest.model.*;
import com.ctag.hotel.rest.api.ReservasApiService;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.enums.ParameterStyle;

import com.ctag.hotel.rest.model.ErrorDto;
import com.ctag.hotel.rest.model.ReservasDto;
import com.ctag.hotel.rest.model.ReservasExtendedHabitacionTipoDto;
import com.ctag.hotel.rest.model.ReservasExtendedUserDto;

import java.util.Map;
import java.util.List;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.*;


import javax.validation.constraints.*;

@Path("/reservas")



@Tag(name = "Reservas", description = "the Reservas API")
@OpenAPIDefinition
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-05-12T10:58:18.153+02:00[Europe/Paris]")public class ReservasApi  {

   private final ReservasApiService delegate;
   
   @Inject
   ReservasApi(ReservasApiService delegate){
        this.delegate = delegate;
   }

    @GET
    @Path("/extended/habitacionTipo/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get all Reservas with room´s ID", description = "Get reserva Extended with habitacion", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "Reservas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = ReservasExtendedHabitacionTipoDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response getReservaByHabitacionTipo(
            
    @Parameter(in = ParameterIn.PATH, description = "id of model from path param",required=true) @PathParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.getReservaByHabitacionTipo(id,securityContext,uriInfo);
    }
    @GET
    @Path("/extended/UserId/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Reserva with user´s ID", description = "Get reserva Extended with rolusere", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "Reservas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = ReservasExtendedUserDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response getReservaByUserId(
            
    @Parameter(in = ParameterIn.PATH, description = "id of model from path param",required=true) @PathParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.getReservaByUserId(id,securityContext,uriInfo);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Reservas", description = "Example how to get a Reserva", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "Reservas" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ReservasDto.class)))),
        
        @ApiResponse(responseCode = "400", description = "Custom Invalid with array Errors", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ErrorDto.class)))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = ErrorDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response getReservas(
            
    @Parameter(in = ParameterIn.QUERY, description = "") @QueryParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.getReservas(id,securityContext,uriInfo);
    }
}
