package API_hotel_actialife;

import javax.inject.Inject;

import actialife.*;
import API_hotel_actialife.HabitacionTipoApiService;

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

@Path("/habitaciontipo")



@Tag(name = "HabitacionTipo", description = "the HabitacionTipo API")
@OpenAPIDefinition
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-04-23T14:13:04.663+02:00[Europe/Paris]")public class HabitacionTipoApi  {

   private final HabitacionTipoApiService delegate;
   
   @Inject
   HabitacionTipoApi(HabitacionTipoApiService delegate){
        this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create new Room Type", description = "Create a new Room Type", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "HabitacionTipo" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = InlineResponse200Dto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response createHabitacionTipo(
            
    @Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true)  HabitacionTipoCreateDto body
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.createHabitacionTipo(body,securityContext,uriInfo);
    }
    @DELETE
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "delete room", description = "delete one room", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "HabitacionTipo" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "deleted successfully"),
        
        @ApiResponse(responseCode = "400", description = "Invalid", content = @Content(schema = @Schema(implementation = ErrorDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response deleteHabitacionTipo(
            
    @Parameter(in = ParameterIn.PATH, description = "",required=true) @PathParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.deleteHabitacionTipo(id,securityContext,uriInfo);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Rooms Type", description = "Example how to get a Room", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "HabitacionTipo" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = HabitacionTipoDto.class)))),
        
        @ApiResponse(responseCode = "400", description = "Custom Invalid with array Errors", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ErrorDto.class)))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = ErrorDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response getHabitacionTipo(
            
    @Parameter(in = ParameterIn.QUERY, description = "") @QueryParam("id")  Integer id
,
            
    @Parameter(in = ParameterIn.QUERY, description = "") @QueryParam("tipo_habitacion")  String tipoHabitacion
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.getHabitacionTipo(id,tipoHabitacion,securityContext,uriInfo);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Find room by ID", description = "Returns a single room", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "HabitacionTipo" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = HabitacionTipoDto.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Reservas not found") })
    public Response getHabitacionTipoById(
            
    @Parameter(in = ParameterIn.PATH, description = "id of model from path param",required=true) @PathParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.getHabitacionTipoById(id,securityContext,uriInfo);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Update roomType", description = "Update room type", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "HabitacionTipo" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = HabitacionTipoDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response updateHabitacionTipo(
            
    @Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true)  HabitacionTipoUpdateDto body
,
            
    @Parameter(in = ParameterIn.PATH, description = "id of model from path param",required=true) @PathParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.updateHabitacionTipo(body,id,securityContext,uriInfo);
    }
}
