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
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;

/**
 * Base DTO, habitacionTipo Extension
 */
@Schema(description = "Base DTO, habitacionTipo Extension")
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-04-26T12:23:21.276+02:00[Europe/Paris]")public class HabitacionTipoUpdateDto extends HabitacionTipoDto  {

  public HabitacionTipoUpdateDto(){
   //Empty Constructor
  }
  
  public HabitacionTipoUpdateDto(HabitacionTipoUpdateDto parentDto){
   super(parentDto);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HabitacionTipoUpdateDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
