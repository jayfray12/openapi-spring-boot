package com.redhat.todo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GenericError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-24T17:30:20.735351-05:00[America/New_York]")
public class GenericError   {
  @JsonProperty("message")
  private String message;

  @JsonProperty("rootCause")
  private String rootCause;

  public GenericError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Specific error message
   * @return message
  */
  @ApiModelProperty(value = "Specific error message")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public GenericError rootCause(String rootCause) {
    this.rootCause = rootCause;
    return this;
  }

  /**
   * Optional root rootCause
   * @return rootCause
  */
  @ApiModelProperty(value = "Optional root rootCause")


  public String getRootCause() {
    return rootCause;
  }

  public void setRootCause(String rootCause) {
    this.rootCause = rootCause;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericError genericError = (GenericError) o;
    return Objects.equals(this.message, genericError.message) &&
        Objects.equals(this.rootCause, genericError.rootCause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, rootCause);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericError {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    rootCause: ").append(toIndentedString(rootCause)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

