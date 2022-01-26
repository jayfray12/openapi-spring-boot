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
 * Employee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-24T17:30:20.735351-05:00[America/New_York]")
@javax.persistence.Entity
@javax.persistence.Table(
  name = "employees",
  uniqueConstraints = {
    @javax.persistence.UniqueConstraint(columnNames = {"email"})
  }
)
public class Employee   {
  @JsonProperty("id")
  @javax.persistence.Id
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("email")
  private String email;

  @JsonProperty("role")
  private String role;

  @JsonProperty("hasAcceptedTerms")
  @javax.persistence.Transient
  private Boolean hasAcceptedTerms;

  @JsonProperty("dateTermsAccepted")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateTermsAccepted;

  @JsonProperty("termsVersionNumber")
  private Float termsVersionNumber;

  public Employee id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Employee's RedHat Kerberos ID
   * @return id
  */
  @ApiModelProperty(example = "jsmith@redhat.com", value = "Employee's RedHat Kerberos ID")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Employee name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the employee.
   * @return name
  */
  @ApiModelProperty(example = "John Smith", value = "Name of the employee.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Employee email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the employee.
   * @return email
  */
  @ApiModelProperty(example = "jsmith@redhat.com", value = "The email address of the employee.")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Employee role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The role of the employee. For example, consultant, PM, TSM, etc.
   * @return role
  */
  @ApiModelProperty(example = "Consultant", value = "The role of the employee. For example, consultant, PM, TSM, etc.")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Employee hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

  /**
   * Whether the employee has accepted the terms of the usage agreement.
   * @return hasAcceptedTerms
  */
  @ApiModelProperty(example = "false", value = "Whether the employee has accepted the terms of the usage agreement.")


  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }

  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  public Employee dateTermsAccepted(LocalDate dateTermsAccepted) {
    this.dateTermsAccepted = dateTermsAccepted;
    return this;
  }

  /**
   * The date the employee accepted the terms of the usage agreement.
   * @return dateTermsAccepted
  */
  @ApiModelProperty(example = "Mon Feb 08 19:00:00 EST 2021", value = "The date the employee accepted the terms of the usage agreement.")

  @Valid

  public LocalDate getDateTermsAccepted() {
    return dateTermsAccepted;
  }

  public void setDateTermsAccepted(LocalDate dateTermsAccepted) {
    this.dateTermsAccepted = dateTermsAccepted;
  }

  public Employee termsVersionNumber(Float termsVersionNumber) {
    this.termsVersionNumber = termsVersionNumber;
    return this;
  }

  /**
   * The version number of terms of the usage agreement.
   * @return termsVersionNumber
  */
  @ApiModelProperty(example = "1.0", value = "The version number of terms of the usage agreement.")


  public Float getTermsVersionNumber() {
    return termsVersionNumber;
  }

  public void setTermsVersionNumber(Float termsVersionNumber) {
    this.termsVersionNumber = termsVersionNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) &&
        Objects.equals(this.name, employee.name) &&
        Objects.equals(this.email, employee.email) &&
        Objects.equals(this.role, employee.role) &&
        Objects.equals(this.hasAcceptedTerms, employee.hasAcceptedTerms) &&
        Objects.equals(this.dateTermsAccepted, employee.dateTermsAccepted) &&
        Objects.equals(this.termsVersionNumber, employee.termsVersionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, role, hasAcceptedTerms, dateTermsAccepted, termsVersionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    hasAcceptedTerms: ").append(toIndentedString(hasAcceptedTerms)).append("\n");
    sb.append("    dateTermsAccepted: ").append(toIndentedString(dateTermsAccepted)).append("\n");
    sb.append("    termsVersionNumber: ").append(toIndentedString(termsVersionNumber)).append("\n");
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

