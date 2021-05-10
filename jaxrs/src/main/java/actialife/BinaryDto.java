/*
 * hotel_actialife
 * This is a Base API Project created by mi panita carzul
 *
 * OpenAPI spec version: 2.0.3
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
import java.io.File;
import javax.validation.constraints.*;

/**
 * BinaryDto
 */
@javax.annotation.Generated(value = "com.ctag.codegen.languages.v3.java.jaxrs.JavaSeedstackJerseyServerCodegen", date = "2021-05-10T14:13:55.611+02:00[Europe/Paris]")public class BinaryDto   {
  @JsonProperty("content")
  protected File content = null;


  public BinaryDto(){
   //Empty Constructor
  }
  
  public BinaryDto(BinaryDto parentDto){
   
    this.content = parentDto.content;
  }

 
  public BinaryDto content(File content) {
    this.content = content;
    return this;
  }


 
  /**
   * Get content
   * @return content
   **/
  @JsonProperty("content")
  @Schema(description = "")
  public File getContent() {
    return content;
  }
 

  public void setContent(File content) {
    this.content = content;
  }
 


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinaryDto Binary = (BinaryDto) o;
    return Objects.equals(this.content, Binary.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinaryDto {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
