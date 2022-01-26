package com.redhat.todo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.todo.model.EmployeeAssignment;
import com.redhat.todo.model.Skill;
import com.redhat.todo.model.SurveyGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SurveyGroupEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-24T17:30:20.735351-05:00[America/New_York]")
public class SurveyGroupEntity   {
  @JsonProperty("assignments")
  @Valid
  private List<EmployeeAssignment> assignments = null;

  @JsonProperty("disabled")
  private Boolean disabled = false;

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("createdDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate;

  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("modifiedDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime modifiedDate;

  @JsonProperty("modifiedBy")
  private String modifiedBy;

  @JsonProperty("opportunityId")
  private String opportunityId;

  @JsonProperty("projectName")
  private String projectName;

  @JsonProperty("projectCreatorId")
  private String projectCreatorId;

  @JsonProperty("tsmId")
  private String tsmId;

  @JsonProperty("defaultSkills")
  @Valid
  private List<Skill> defaultSkills = null;

  public SurveyGroupEntity assignments(List<EmployeeAssignment> assignments) {
    this.assignments = assignments;
    return this;
  }

  public SurveyGroupEntity addAssignmentsItem(EmployeeAssignment assignmentsItem) {
    if (this.assignments == null) {
      this.assignments = new ArrayList<>();
    }
    this.assignments.add(assignmentsItem);
    return this;
  }

  /**
   * Get assignments
   * @return assignments
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<EmployeeAssignment> getAssignments() {
    return assignments;
  }

  public void setAssignments(List<EmployeeAssignment> assignments) {
    this.assignments = assignments;
  }

  public SurveyGroupEntity disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * A flag indicating if this Survey Group is disabled
   * @return disabled
  */
  @ApiModelProperty(example = "false", value = "A flag indicating if this Survey Group is disabled")


  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public SurveyGroupEntity id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * A GUID that uniquely identifies the SurveyGroup.
   * @return id
  */
  @ApiModelProperty(example = "f1ad7649-eb70-4499-9c82-a63fe2c6dc71", value = "A GUID that uniquely identifies the SurveyGroup.")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SurveyGroupEntity createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * The date the project was created in the Feedback 360 Survey API in UTC.
   * @return createdDate
  */
  @ApiModelProperty(readOnly = true, value = "The date the project was created in the Feedback 360 Survey API in UTC.")

  @Valid

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public SurveyGroupEntity createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The employee id (Kerberos) of the user that created the project.
   * @return createdBy
  */
  @ApiModelProperty(example = "janedoe", value = "The employee id (Kerberos) of the user that created the project.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public SurveyGroupEntity modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * The date the project was last modified in the Feedback 360 Survey API in UTC.
   * @return modifiedDate
  */
  @ApiModelProperty(readOnly = true, value = "The date the project was last modified in the Feedback 360 Survey API in UTC.")

  @Valid

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public SurveyGroupEntity modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The employee id (Kerberos) of the user that last modifed the project.
   * @return modifiedBy
  */
  @ApiModelProperty(example = "janedoe", value = "The employee id (Kerberos) of the user that last modifed the project.")


  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public SurveyGroupEntity opportunityId(String opportunityId) {
    this.opportunityId = opportunityId;
    return this;
  }

  /**
   * The ID of the Opportunity from PSA.
   * @return opportunityId
  */
  @ApiModelProperty(example = "3456NAS", required = true, value = "The ID of the Opportunity from PSA.")
  @NotNull


  public String getOpportunityId() {
    return opportunityId;
  }

  public void setOpportunityId(String opportunityId) {
    this.opportunityId = opportunityId;
  }

  public SurveyGroupEntity projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

  /**
   * The name of the project.
   * @return projectName
  */
  @ApiModelProperty(example = "NASA App Modernization", required = true, value = "The name of the project.")
  @NotNull


  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public SurveyGroupEntity projectCreatorId(String projectCreatorId) {
    this.projectCreatorId = projectCreatorId;
    return this;
  }

  /**
   * The email address of the creator of the project.
   * @return projectCreatorId
  */
  @ApiModelProperty(example = "janedoe@redhat.com", required = true, value = "The email address of the creator of the project.")
  @NotNull


  public String getProjectCreatorId() {
    return projectCreatorId;
  }

  public void setProjectCreatorId(String projectCreatorId) {
    this.projectCreatorId = projectCreatorId;
  }

  public SurveyGroupEntity tsmId(String tsmId) {
    this.tsmId = tsmId;
    return this;
  }

  /**
   * The email address of the TSM in charge of the project.
   * @return tsmId
  */
  @ApiModelProperty(example = "timmytsm@redhat.com", required = true, value = "The email address of the TSM in charge of the project.")
  @NotNull


  public String getTsmId() {
    return tsmId;
  }

  public void setTsmId(String tsmId) {
    this.tsmId = tsmId;
  }

  public SurveyGroupEntity defaultSkills(List<Skill> defaultSkills) {
    this.defaultSkills = defaultSkills;
    return this;
  }

  public SurveyGroupEntity addDefaultSkillsItem(Skill defaultSkillsItem) {
    if (this.defaultSkills == null) {
      this.defaultSkills = new ArrayList<>();
    }
    this.defaultSkills.add(defaultSkillsItem);
    return this;
  }

  /**
   * Get defaultSkills
   * @return defaultSkills
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Skill> getDefaultSkills() {
    return defaultSkills;
  }

  public void setDefaultSkills(List<Skill> defaultSkills) {
    this.defaultSkills = defaultSkills;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyGroupEntity surveyGroupEntity = (SurveyGroupEntity) o;
    return Objects.equals(this.assignments, surveyGroupEntity.assignments) &&
        Objects.equals(this.disabled, surveyGroupEntity.disabled) &&
        Objects.equals(this.id, surveyGroupEntity.id) &&
        Objects.equals(this.createdDate, surveyGroupEntity.createdDate) &&
        Objects.equals(this.createdBy, surveyGroupEntity.createdBy) &&
        Objects.equals(this.modifiedDate, surveyGroupEntity.modifiedDate) &&
        Objects.equals(this.modifiedBy, surveyGroupEntity.modifiedBy) &&
        Objects.equals(this.opportunityId, surveyGroupEntity.opportunityId) &&
        Objects.equals(this.projectName, surveyGroupEntity.projectName) &&
        Objects.equals(this.projectCreatorId, surveyGroupEntity.projectCreatorId) &&
        Objects.equals(this.tsmId, surveyGroupEntity.tsmId) &&
        Objects.equals(this.defaultSkills, surveyGroupEntity.defaultSkills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignments, disabled, id, createdDate, createdBy, modifiedDate, modifiedBy, opportunityId, projectName, projectCreatorId, tsmId, defaultSkills);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyGroupEntity {\n");
    
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    opportunityId: ").append(toIndentedString(opportunityId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectCreatorId: ").append(toIndentedString(projectCreatorId)).append("\n");
    sb.append("    tsmId: ").append(toIndentedString(tsmId)).append("\n");
    sb.append("    defaultSkills: ").append(toIndentedString(defaultSkills)).append("\n");
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

