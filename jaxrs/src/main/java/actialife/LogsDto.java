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
import javax.validation.constraints.*;

/**
 * logs
 */
@Schema(description = "logs")
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-04-28T09:02:06.631+02:00[Europe/Paris]")public class LogsDto extends LogsCreateDto  {
  @JsonProperty("id")
  protected Integer id = null;


  public LogsDto(){
   //Empty Constructor
  }
  
  public LogsDto(LogsDto parentDto){
   super(parentDto);
    this.id = parentDto.id;
  }

 
  public LogsDto id(Integer id) {
    this.id = id;
    return this;
  }


 
  /**
   * Get id
   * @return id
   **/
  @JsonProperty("id")
  @Schema(required = true, description = "")
  @NotNull
  public Integer getId() {
    return id;
  }
 

  public void setId(Integer id) {
    this.id = id;
  }
 


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsDto Logs = (LogsDto) o;
    return Objects.equals(this.id, Logs.id) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
