package API_hotel_actialife;

import javax.inject.Inject;

import actialife.*;
import API_hotel_actialife.LogsApiService;

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

@Path("/log")



@Tag(name = "Logs", description = "the Logs API")
@OpenAPIDefinition
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-05-10T14:13:55.611+02:00[Europe/Paris]")public class LogsApi  {

   private final LogsApiService delegate;
   
   @Inject
   LogsApi(LogsApiService delegate){
        this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create log", description = "Create a new log", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "Logs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = LogsDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response createLog(
            
    @Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true)  LogsCreateDto body
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.createLog(body,securityContext,uriInfo);
    }
    @DELETE
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "delete log", description = "delete one log", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "Logs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "deleted successfully"),
        
        @ApiResponse(responseCode = "400", description = "Invalid", content = @Content(schema = @Schema(implementation = ErrorDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response deleteLog(
            
    @Parameter(in = ParameterIn.PATH, description = "",required=true) @PathParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.deleteLog(id,securityContext,uriInfo);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Logs", description = "Example how to get a Reserva", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "Logs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = LogsDto.class)))),
        
        @ApiResponse(responseCode = "400", description = "Custom Invalid with array Errors", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ErrorDto.class)))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = ErrorDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response getAllLogs(@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.getAllLogs(securityContext,uriInfo);
    }
    @GET
    @Path("/extended")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Logs by User Id", description = "Example how to get a log", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "Logs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = LogsDto.class)))),
        
        @ApiResponse(responseCode = "400", description = "Custom Invalid with array Errors", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ErrorDto.class)))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = ErrorDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response getLogsByUserId(
            
    @Parameter(in = ParameterIn.QUERY, description = "") @QueryParam("idUser")  Integer idUser
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.getLogsByUserId(idUser,securityContext,uriInfo);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Update log", description = "Update log", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "Logs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = LogsDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response updateLog(
            
    @Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true)  LogsUpdateDto body
,
            
    @Parameter(in = ParameterIn.PATH, description = "id of model from path param",required=true) @PathParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.updateLog(body,id,securityContext,uriInfo);
    }
}
