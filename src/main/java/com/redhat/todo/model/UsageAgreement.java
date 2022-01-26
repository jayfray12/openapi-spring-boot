package com.redhat.todo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UsageAgreement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-24T17:30:20.735351-05:00[America/New_York]")
public class UsageAgreement   {
  @JsonProperty("text")
  private String text;

  @JsonProperty("version")
  private Float version;

  @JsonProperty("start_date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate startDate;

  @JsonProperty("end_date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate endDate;

  public UsageAgreement text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The contents of the usage agreement.
   * @return text
  */
  @ApiModelProperty(value = "The contents of the usage agreement.")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public UsageAgreement version(Float version) {
    this.version = version;
    return this;
  }

  /**
   * The verison of the agreement
   * @return version
  */
  @ApiModelProperty(value = "The verison of the agreement")


  public Float getVersion() {
    return version;
  }

  public void setVersion(Float version) {
    this.version = version;
  }

  public UsageAgreement startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The date the agreement began
   * @return startDate
  */
  @ApiModelProperty(value = "The date the agreement began")

  @Valid

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public UsageAgreement endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The date the agreement expires
   * @return endDate
  */
  @ApiModelProperty(value = "The date the agreement expires")

  @Valid

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAgreement usageAgreement = (UsageAgreement) o;
    return Objects.equals(this.text, usageAgreement.text) &&
        Objects.equals(this.version, usageAgreement.version) &&
        Objects.equals(this.startDate, usageAgreement.startDate) &&
        Objects.equals(this.endDate, usageAgreement.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, version, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAgreement {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

