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
 * Base DTO, user Extension with role
 */
@Schema(description = "Base DTO, user Extension with role")
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-04-28T09:02:06.631+02:00[Europe/Paris]")public class ReservasExtendedHabitacionTipoDto extends ReservasDto  {
  @JsonProperty("habitacion_tipo")
  protected List<Object> habitacionTipo = null;


  public ReservasExtendedHabitacionTipoDto(){
   //Empty Constructor
  }
  
  public ReservasExtendedHabitacionTipoDto(ReservasExtendedHabitacionTipoDto parentDto){
   super(parentDto);
    this.habitacionTipo = parentDto.habitacionTipo;
  }

 
  public ReservasExtendedHabitacionTipoDto habitacionTipo(List<Object> habitacionTipo) {
    if (this.habitacionTipo == null) {
        this.habitacionTipo = new ArrayList<>();
    }
    this.habitacionTipo.addAll(habitacionTipo);
    return this;
  }


  public ReservasExtendedHabitacionTipoDto addHabitacionTipoItem(Object habitacionTipoItem) {
    if (this.habitacionTipo == null) {
      this.habitacionTipo = new ArrayList<>();
    }
    this.habitacionTipo.add(habitacionTipoItem);
    return this;
  }

 
  /**
   * Get habitacionTipo
   * @return habitacionTipo
   **/
  @JsonProperty("habitacion_tipo")
  @Schema(description = "")
  public List<Object> getHabitacionTipo() {
    if (this.habitacionTipo == null) {
    return Collections.emptyList();
    }
    return habitacionTipo;
  }
 

  public void setHabitacionTipo(List<Object> habitacionTipo) {
    if (this.habitacionTipo == null) {
        this.habitacionTipo = new ArrayList<>();
    }
    this.habitacionTipo.addAll(habitacionTipo);
  }
 


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservasExtendedHabitacionTipoDto ReservasExtendedHabitacionTipo = (ReservasExtendedHabitacionTipoDto) o;
    return Objects.equals(this.habitacionTipo, ReservasExtendedHabitacionTipo.habitacionTipo) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(habitacionTipo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservasExtendedHabitacionTipoDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    habitacionTipo: ").append(toIndentedString(habitacionTipo)).append("\n");
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
