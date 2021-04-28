/*
 * hotel_actialife
 * This is a Base API Project created by mi panita carzul
 *
 * OpenAPI spec version: 2.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package actialife;

import java.util.Objects;
import java.util.Collections;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * This is returned as error response
 */
@Schema(description = "This is returned as error response")
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-04-28T09:02:06.631+02:00[Europe/Paris]")public class ErrorDto   {
  @JsonProperty("code")
  protected String code = null;

  @JsonProperty("message")
  protected String message = null;

  @JsonProperty("arguments")
  protected List<String> arguments = null;


  public ErrorDto(){
   //Empty Constructor
  }
  
  public ErrorDto(ErrorDto parentDto){
   
    this.code = parentDto.code;
    this.message = parentDto.message;
    this.arguments = parentDto.arguments;
  }

 
  public ErrorDto code(String code) {
    this.code = code;
    return this;
  }


 
  /**
   * internal paperless code error
   * @return code
   **/
  @JsonProperty("code")
  @Schema(required = true, description = "internal paperless code error")
  @NotNull
  public String getCode() {
    return code;
  }
 

  public void setCode(String code) {
    this.code = code;
  }
 

 
  public ErrorDto message(String message) {
    this.message = message;
    return this;
  }


 
  /**
   * message error
   * @return message
   **/
  @JsonProperty("message")
  @Schema(required = true, description = "message error")
  @NotNull
  public String getMessage() {
    return message;
  }
 

  public void setMessage(String message) {
    this.message = message;
  }
 

 
  public ErrorDto arguments(List<String> arguments) {
    if (this.arguments == null) {
        this.arguments = new ArrayList<>();
    }
    this.arguments.addAll(arguments);
    return this;
  }


  public ErrorDto addArgumentsItem(String argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<>();
    }
    this.arguments.add(argumentsItem);
    return this;
  }

 
  /**
   * arguments error
   * @return arguments
   **/
  @JsonProperty("arguments")
  @Schema(description = "arguments error")
  public List<String> getArguments() {
    if (this.arguments == null) {
    return Collections.emptyList();
    }
    return arguments;
  }
 

  public void setArguments(List<String> arguments) {
    if (this.arguments == null) {
        this.arguments = new ArrayList<>();
    }
    this.arguments.addAll(arguments);
  }
 


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDto Error = (ErrorDto) o;
    return Objects.equals(this.code, Error.code) &&
        Objects.equals(this.message, Error.message) &&
        Objects.equals(this.arguments, Error.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, arguments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDto {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
