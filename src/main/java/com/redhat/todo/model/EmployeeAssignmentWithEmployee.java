package com.redhat.todo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A type specifically to facilitate the UI. Combines aspects of EmployeeAssignment and fields from Employee
 */
@ApiModel(description = "A type specifically to facilitate the UI. Combines aspects of EmployeeAssignment and fields from Employee")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-24T17:30:20.735351-05:00[America/New_York]")
public class EmployeeAssignmentWithEmployee   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("employeeId")
  private String employeeId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("email")
  private String email;

  @JsonProperty("startDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @JsonProperty("endDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  @JsonProperty("billableRole")
  private String billableRole;

  @JsonProperty("employeeRole")
  private String employeeRole;

  public EmployeeAssignmentWithEmployee id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The Employee Assignment ID as a GUUID
   * @return id
  */
  @ApiModelProperty(example = "f1ad7649-eb70-4499-9c82-a63fe2c6dc71", value = "The Employee Assignment ID as a GUUID")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public EmployeeAssignmentWithEmployee employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

  /**
   * The Employee Kerboros ID
   * @return employeeId
  */
  @ApiModelProperty(example = "jqConsultant", value = "The Employee Kerboros ID")


  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public EmployeeAssignmentWithEmployee name(String name) {
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

  public EmployeeAssignmentWithEmployee email(String email) {
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

  public EmployeeAssignmentWithEmployee startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The start date of this employee's assignment
   * @return startDate
  */
  @ApiModelProperty(required = true, value = "The start date of this employee's assignment")
  @NotNull

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public EmployeeAssignmentWithEmployee endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The end date of this employee's assignment
   * @return endDate
  */
  @ApiModelProperty(value = "The end date of this employee's assignment")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public EmployeeAssignmentWithEmployee billableRole(String billableRole) {
    this.billableRole = billableRole;
    return this;
  }

  /**
   * Role that the employee is billed for on the project.
   * @return billableRole
  */
  @ApiModelProperty(example = "Consultant", value = "Role that the employee is billed for on the project.")


  public String getBillableRole() {
    return billableRole;
  }

  public void setBillableRole(String billableRole) {
    this.billableRole = billableRole;
  }

  public EmployeeAssignmentWithEmployee employeeRole(String employeeRole) {
    this.employeeRole = employeeRole;
    return this;
  }

  /**
   * Employee's Red Hat Role.
   * @return employeeRole
  */
  @ApiModelProperty(example = "Senior Consultant", value = "Employee's Red Hat Role.")


  public String getEmployeeRole() {
    return employeeRole;
  }

  public void setEmployeeRole(String employeeRole) {
    this.employeeRole = employeeRole;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeAssignmentWithEmployee employeeAssignmentWithEmployee = (EmployeeAssignmentWithEmployee) o;
    return Objects.equals(this.id, employeeAssignmentWithEmployee.id) &&
        Objects.equals(this.employeeId, employeeAssignmentWithEmployee.employeeId) &&
        Objects.equals(this.name, employeeAssignmentWithEmployee.name) &&
        Objects.equals(this.email, employeeAssignmentWithEmployee.email) &&
        Objects.equals(this.startDate, employeeAssignmentWithEmployee.startDate) &&
        Objects.equals(this.endDate, employeeAssignmentWithEmployee.endDate) &&
        Objects.equals(this.billableRole, employeeAssignmentWithEmployee.billableRole) &&
        Objects.equals(this.employeeRole, employeeAssignmentWithEmployee.employeeRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, employeeId, name, email, startDate, endDate, billableRole, employeeRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeAssignmentWithEmployee {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    billableRole: ").append(toIndentedString(billableRole)).append("\n");
    sb.append("    employeeRole: ").append(toIndentedString(employeeRole)).append("\n");
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

