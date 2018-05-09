package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.Client;
import java.util.Date;
import java.io.File;
import org.joda.time.LocalDate;
import java.util.Map;
import org.openapitools.model.OuterComposite;
import org.openapitools.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/fake")
@Api(description = "the fake API")
public class FakeApi {

    @POST
    @Path("/outer/boolean")
    @Produces({ "*/*" })
    @ApiOperation(value = "", notes = "Test serialization of outer boolean types", response = Boolean.class, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Output boolean", response = Boolean.class)
    })
    public Response fakeOuterBooleanSerialize(@Valid Boolean body) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/outer/composite")
    @Produces({ "*/*" })
    @ApiOperation(value = "", notes = "Test serialization of object with outer number type", response = OuterComposite.class, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Output composite", response = OuterComposite.class)
    })
    public Response fakeOuterCompositeSerialize(@Valid OuterComposite outerComposite) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/outer/number")
    @Produces({ "*/*" })
    @ApiOperation(value = "", notes = "Test serialization of outer number types", response = BigDecimal.class, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Output number", response = BigDecimal.class)
    })
    public Response fakeOuterNumberSerialize(@Valid BigDecimal body) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/outer/string")
    @Produces({ "*/*" })
    @ApiOperation(value = "", notes = "Test serialization of outer string types", response = String.class, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Output string", response = String.class)
    })
    public Response fakeOuterStringSerialize(@Valid String body) {
        return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/body-with-query-params")
    @Consumes({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Void.class)
    })
    public Response testBodyWithQueryParams(@QueryParam("query") @NotNull    String query,@Valid User user) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "To test \"client\" model", notes = "To test \"client\" model", response = Client.class, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Client.class)
    })
    public Response testClientModel(@Valid Client client) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({ "application/x-www-form-urlencoded" })
    @ApiOperation(value = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", notes = "Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 ", response = Void.class, authorizations = {
        @Authorization(value = "http_basic_test")
    }, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
        @ApiResponse(code = 404, message = "User not found", response = Void.class)
    })
    public Response testEndpointParameters(@FormParam(value = "number")  BigDecimal number,@FormParam(value = "double")  Double _double,@FormParam(value = "pattern_without_delimiter")  String patternWithoutDelimiter,@FormParam(value = "byte")  byte[] _byte,@FormParam(value = "integer")  Integer integer,@FormParam(value = "int32")  Integer int32,@FormParam(value = "int64")  Long int64,@FormParam(value = "float")  Float _float,@FormParam(value = "string")  String string, @FormParam(value = "binary") InputStream binaryInputStream,
   @FormParam(value = "binary") Attachment binaryDetail,@FormParam(value = "date")  LocalDate date,@FormParam(value = "dateTime")  Date dateTime,@FormParam(value = "password")  String password,@FormParam(value = "callback")  String paramCallback) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Consumes({ "application/x-www-form-urlencoded" })
    @ApiOperation(value = "To test enum parameters", notes = "To test enum parameters", response = Void.class, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid request", response = Void.class),
        @ApiResponse(code = 404, message = "Not found", response = Void.class)
    })
    public Response testEnumParameters(@HeaderParam("enum_header_string_array")   @ApiParam("Header parameter enum test (string array)") List<String> enumHeaderStringArray,@HeaderParam("enum_header_string")  @DefaultValue("-efg")  @ApiParam("Header parameter enum test (string)") String enumHeaderString,@QueryParam("enum_query_string_array")   @ApiParam("Query parameter enum test (string array)")  List<String> enumQueryStringArray,@QueryParam("enum_query_string")  @DefaultValue("-efg")  @ApiParam("Query parameter enum test (string)")  String enumQueryString,@QueryParam("enum_query_integer")   @ApiParam("Query parameter enum test (double)")  Integer enumQueryInteger,@QueryParam("enum_query_double")   @ApiParam("Query parameter enum test (double)")  Double enumQueryDouble,@FormParam(value = "enum_form_string_array")  List<String> enumFormStringArray,@FormParam(value = "enum_form_string")  String enumFormString) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/inline-additionalProperties")
    @Consumes({ "application/json" })
    @ApiOperation(value = "test inline additionalProperties", notes = "", response = Void.class, tags={ "fake",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response testInlineAdditionalProperties(@Valid Map<String, String> requestBody) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/jsonFormData")
    @Consumes({ "application/x-www-form-urlencoded" })
    @ApiOperation(value = "test json serialization of form data", notes = "", response = Void.class, tags={ "fake" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response testJsonFormData(@FormParam(value = "param")  String param,@FormParam(value = "param2")  String param2) {
        return Response.ok().entity("magic!").build();
    }
}