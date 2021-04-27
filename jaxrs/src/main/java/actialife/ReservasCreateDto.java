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
import java.time.LocalDate;
import javax.validation.constraints.*;

/**
 * ReservasCreateDto
 */
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-04-27T12:44:19.179+02:00[Europe/Paris]")public class ReservasCreateDto   {
  @JsonProperty("idUser")
  protected Integer idUser = null;

  @JsonProperty("fecha_inicio")
  protected LocalDate fechaInicio = null;

  @JsonProperty("fecha_fin")
  protected LocalDate fechaFin = null;

  @JsonProperty("id_tipo_habitacion")
  protected Integer idTipoHabitacion = null;


  public ReservasCreateDto(){
   //Empty Constructor
  }
  
  public ReservasCreateDto(ReservasCreateDto parentDto){
   
    this.idUser = parentDto.idUser;
    this.fechaInicio = parentDto.fechaInicio;
    this.fechaFin = parentDto.fechaFin;
    this.idTipoHabitacion = parentDto.idTipoHabitacion;
  }

 
  public ReservasCreateDto idUser(Integer idUser) {
    this.idUser = idUser;
    return this;
  }


 
  /**
   * Get idUser
   * @return idUser
   **/
  @JsonProperty("idUser")
  @Schema(required = true, description = "")
  @NotNull
  public Integer getIdUser() {
    return idUser;
  }
 

  public void setIdUser(Integer idUser) {
    this.idUser = idUser;
  }
 

 
  public ReservasCreateDto fechaInicio(LocalDate fechaInicio) {
    this.fechaInicio = fechaInicio;
    return this;
  }


 
  /**
   * Get fechaInicio
   * @return fechaInicio
   **/
  @JsonProperty("fecha_inicio")
  @Schema(required = true, description = "")
  @NotNull
  public LocalDate getFechaInicio() {
    return fechaInicio;
  }
 

  public void setFechaInicio(LocalDate fechaInicio) {
    this.fechaInicio = fechaInicio;
  }
 

 
  public ReservasCreateDto fechaFin(LocalDate fechaFin) {
    this.fechaFin = fechaFin;
    return this;
  }


 
  /**
   * Get fechaFin
   * @return fechaFin
   **/
  @JsonProperty("fecha_fin")
  @Schema(required = true, description = "")
  @NotNull
  public LocalDate getFechaFin() {
    return fechaFin;
  }
 

  public void setFechaFin(LocalDate fechaFin) {
    this.fechaFin = fechaFin;
  }
 

 
  public ReservasCreateDto idTipoHabitacion(Integer idTipoHabitacion) {
    this.idTipoHabitacion = idTipoHabitacion;
    return this;
  }


 
  /**
   * Get idTipoHabitacion
   * @return idTipoHabitacion
   **/
  @JsonProperty("id_tipo_habitacion")
  @Schema(required = true, description = "")
  @NotNull
  public Integer getIdTipoHabitacion() {
    return idTipoHabitacion;
  }
 

  public void setIdTipoHabitacion(Integer idTipoHabitacion) {
    this.idTipoHabitacion = idTipoHabitacion;
  }
 


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservasCreateDto ReservasCreate = (ReservasCreateDto) o;
    return Objects.equals(this.idUser, ReservasCreate.idUser) &&
        Objects.equals(this.fechaInicio, ReservasCreate.fechaInicio) &&
        Objects.equals(this.fechaFin, ReservasCreate.fechaFin) &&
        Objects.equals(this.idTipoHabitacion, ReservasCreate.idTipoHabitacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUser, fechaInicio, fechaFin, idTipoHabitacion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservasCreateDto {\n");
    
    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
    sb.append("    fechaInicio: ").append(toIndentedString(fechaInicio)).append("\n");
    sb.append("    fechaFin: ").append(toIndentedString(fechaFin)).append("\n");
    sb.append("    idTipoHabitacion: ").append(toIndentedString(idTipoHabitacion)).append("\n");
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
