package com.ctag.paperless.rest.api;

import javax.inject.Inject;

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

@Path("/version/hotel_actialife")
@Tag(name = "version", description = "the version of API")
@OpenAPIDefinition
public class VersionApi  {

    @GET
    @Produces({ "application/json" })
    @Operation(summary = "version of api", description = "get last version of api", tags={ "version" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "successful operation")
     })
    public Response getVersion(@Context SecurityContext securityContext,@Context UriInfo uriInfo) {
        return Response.ok().entity("{ \"version\" : \"2.0.2\" }").build();
    }

}
