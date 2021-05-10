package API_hotel_actialife;

import javax.inject.Inject;

import actialife.*;
import API_hotel_actialife.RoleApiService;

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

@Path("/role")



@Tag(name = "Role", description = "the Role API")
@OpenAPIDefinition
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-05-10T14:13:55.611+02:00[Europe/Paris]")public class RoleApi  {

   private final RoleApiService delegate;
   
   @Inject
   RoleApi(RoleApiService delegate){
        this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create role", description = "Create a new role", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "Role" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = RoleDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response createRole(
            
    @Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true)  RolecreateDto body
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.createRole(body,securityContext,uriInfo);
    }
    @DELETE
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "delete role", description = "delete one role", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "Role" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "deleted successfully"),
        
        @ApiResponse(responseCode = "400", description = "Invalid", content = @Content(schema = @Schema(implementation = ErrorDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response deleteRole(
            
    @Parameter(in = ParameterIn.PATH, description = "",required=true) @PathParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.deleteRole(id,securityContext,uriInfo);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Roles", description = "Example how to get a Role", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "Role" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = RoleDto.class)))),
        
        @ApiResponse(responseCode = "400", description = "Custom Invalid with array Errors", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ErrorDto.class)))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = ErrorDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response getRoles(
            
    @Parameter(in = ParameterIn.QUERY, description = "") @QueryParam("id")  Integer id
,
            
    @Parameter(in = ParameterIn.QUERY, description = "") @QueryParam("name")  String name
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.getRoles(id,name,securityContext,uriInfo);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Update role", description = "Updates one role", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "Role" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = RoleDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response updateRole(
            
    @Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true)  RoleUpdateDto body
,
            
    @Parameter(in = ParameterIn.PATH, description = "id of model from path param",required=true) @PathParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.updateRole(body,id,securityContext,uriInfo);
    }
}
