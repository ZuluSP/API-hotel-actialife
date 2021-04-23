package API_hotel_actialife;

import javax.inject.Inject;

import actialife.*;
import API_hotel_actialife.UserApiService;

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

@Path("/user")



@Tag(name = "User", description = "the User API")
@OpenAPIDefinition
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-04-23T14:13:04.663+02:00[Europe/Paris]")public class UserApi  {

   private final UserApiService delegate;
   
   @Inject
   UserApi(UserApiService delegate){
        this.delegate = delegate;
   }

    @POST
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Create user", description = "Create a new user", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = UserDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response createuser(@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.createuser(securityContext,uriInfo);
    }
    @DELETE
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "delete user", description = "delete one user", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "deleted successfully"),
        
        @ApiResponse(responseCode = "400", description = "Invalid", content = @Content(schema = @Schema(implementation = ErrorDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response deleteuser(
            
    @Parameter(in = ParameterIn.PATH, description = "id of model from path param",required=true) @PathParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.deleteuser(id,securityContext,uriInfo);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Find with Pagination without security", description = "Find all users with pagination parameters without security", tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = UserDto.class)))),
        
        @ApiResponse(responseCode = "400", description = "Custom Invalid with array Errors", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ErrorDto.class)))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation = ErrorDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response findUsers(
            
    @Parameter(in = ParameterIn.QUERY, description = "") @QueryParam("id")  Integer id
,
            
    @Parameter(in = ParameterIn.QUERY, description = "") @QueryParam("name")  String name
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.findUsers(id,name,securityContext,uriInfo);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Find user by ID", description = "Returns a single user", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = UserDto.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "YouModel not found") })
    public Response getUserById(
            
    @Parameter(in = ParameterIn.PATH, description = "id of model from path param",required=true) @PathParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.getUserById(id,securityContext,uriInfo);
    }
    @GET
    @Path("/extended/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get user by role´s ID", description = "Get user Extended with role", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = UsersExtendedDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response getUserByRole(
            
    @Parameter(in = ParameterIn.PATH, description = "id of model from path param",required=true) @PathParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.getUserByRole(id,securityContext,uriInfo);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Update user", description = "Update user", security = {
        @SecurityRequirement(name = "JwtApiKey")    }, tags={ "User" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = UserDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = ErrorDto.class))) })
    public Response updateuser(
            
    @Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true)  UserUpdateDto body
,
            
    @Parameter(in = ParameterIn.PATH, description = "id of model from path param",required=true) @PathParam("id")  Integer id
,@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return delegate.updateuser(body,id,securityContext,uriInfo);
    }
}
