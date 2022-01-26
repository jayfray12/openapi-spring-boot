package com.redhat.todo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.todo.model.EmployeeEntity;
import com.redhat.todo.model.SurveyGroupEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EmployeeAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-24T17:30:20.735351-05:00[America/New_York]")
public class EmployeeAssignment   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("employee")
  private EmployeeEntity employee;

  @JsonProperty("surveyGroup")
  private SurveyGroupEntity surveyGroup;

  @JsonProperty("startDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @JsonProperty("endDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  @JsonProperty("billableRole")
  private String billableRole;

  public EmployeeAssignment id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * A GUID that uniquely identifies the project.
   * @return id
  */
  @ApiModelProperty(example = "f9238beb-9649-4983-9059-4f0ee372d56e", value = "A GUID that uniquely identifies the project.")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public EmployeeAssignment employee(EmployeeEntity employee) {
    this.employee = employee;
    return this;
  }

  /**
   * Get employee
   * @return employee
  */
  @ApiModelProperty(value = "")

  @Valid

  public EmployeeEntity getEmployee() {
    return employee;
  }

  public void setEmployee(EmployeeEntity employee) {
    this.employee = employee;
  }

  public EmployeeAssignment surveyGroup(SurveyGroupEntity surveyGroup) {
    this.surveyGroup = surveyGroup;
    return this;
  }

  /**
   * The unique ID of the SurveyGroup associated with the opportunity.
   * @return surveyGroup
  */
  @ApiModelProperty(value = "The unique ID of the SurveyGroup associated with the opportunity.")

  @Valid

  public SurveyGroupEntity getSurveyGroup() {
    return surveyGroup;
  }

  public void setSurveyGroup(SurveyGroupEntity surveyGroup) {
    this.surveyGroup = surveyGroup;
  }

  public EmployeeAssignment startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The date the employee started the project.
   * @return startDate
  */
  @ApiModelProperty(value = "The date the employee started the project.")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public EmployeeAssignment endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The employee's end date on the project.
   * @return endDate
  */
  @ApiModelProperty(value = "The employee's end date on the project.")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public EmployeeAssignment billableRole(String billableRole) {
    this.billableRole = billableRole;
    return this;
  }

  /**
   * Role that the employee is billed for on the project..
   * @return billableRole
  */
  @ApiModelProperty(example = "Consultant", value = "Role that the employee is billed for on the project..")


  public String getBillableRole() {
    return billableRole;
  }

  public void setBillableRole(String billableRole) {
    this.billableRole = billableRole;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeAssignment employeeAssignment = (EmployeeAssignment) o;
    return Objects.equals(this.id, employeeAssignment.id) &&
        Objects.equals(this.employee, employeeAssignment.employee) &&
        Objects.equals(this.surveyGroup, employeeAssignment.surveyGroup) &&
        Objects.equals(this.startDate, employeeAssignment.startDate) &&
        Objects.equals(this.endDate, employeeAssignment.endDate) &&
        Objects.equals(this.billableRole, employeeAssignment.billableRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, employee, surveyGroup, startDate, endDate, billableRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeAssignment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    surveyGroup: ").append(toIndentedString(surveyGroup)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    billableRole: ").append(toIndentedString(billableRole)).append("\n");
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

