package com.ctag.hotel.rest.api;

import javax.inject.Inject;

import com.ctag.hotel.rest.model.*;
import com.ctag.hotel.rest.api.ReservaApiService;

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



@Tag(name = "Reserva", description = "the Reserva API")
@OpenAPIDefinition
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-05-12T10:58:18.153+02:00[Europe/Paris]")public class ReservaApi  {

   private final ReservaApiService delegate;
   
   @Inject
   ReservaApi(ReservaApiService delegate){
        this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create reserva", description = "Create a new reserva", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "Reserva" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = ReservasDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response createreserva(
            
    @Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true)  ReservasCreateDto body
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.createreserva(body,securityContext,uriInfo);
    }
    @DELETE
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "delete reserva", description = "delete one reserva", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "Reserva" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "deleted successfully"),
        
        @ApiResponse(responseCode = "400", description = "Invalid", content = @Content(schema = @Schema(implementation = ErrorDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response deletereserva(
            
    @Parameter(in = ParameterIn.PATH, description = "id of model from path param",required=true) @PathParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.deletereserva(id,securityContext,uriInfo);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Find reserva by ID", description = "Returns a single Reserva", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "Reserva" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = ReservasDto.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Reservas not found") })
    public Response getReservaById(
            
    @Parameter(in = ParameterIn.PATH, description = "id of model from path param",required=true) @PathParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.getReservaById(id,securityContext,uriInfo);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Update reserva", description = "Update reserva", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "Reserva" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = ReservasDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response updatereserva(
            
    @Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true)  ReservasUpdateDto body
,
            
    @Parameter(in = ParameterIn.PATH, description = "id of model from path param",required=true) @PathParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.updatereserva(body,id,securityContext,uriInfo);
    }
}
