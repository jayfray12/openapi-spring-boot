package com.redhat.todo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EmployeeSkillHistory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-24T17:30:20.735351-05:00[America/New_York]")
public class EmployeeSkillHistory   {
  @JsonProperty("project")
  private String project;

  @JsonProperty("skills")
  @Valid
  private List<String> skills = null;

  public EmployeeSkillHistory project(String project) {
    this.project = project;
    return this;
  }

  /**
   * Name of project that consultant was part of
   * @return project
  */
  @ApiModelProperty(example = "Bank of America", value = "Name of project that consultant was part of")


  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public EmployeeSkillHistory skills(List<String> skills) {
    this.skills = skills;
    return this;
  }

  public EmployeeSkillHistory addSkillsItem(String skillsItem) {
    if (this.skills == null) {
      this.skills = new ArrayList<>();
    }
    this.skills.add(skillsItem);
    return this;
  }

  /**
   * Array of skills that the consultant used at the project
   * @return skills
  */
  @ApiModelProperty(value = "Array of skills that the consultant used at the project")


  public List<String> getSkills() {
    return skills;
  }

  public void setSkills(List<String> skills) {
    this.skills = skills;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeSkillHistory employeeSkillHistory = (EmployeeSkillHistory) o;
    return Objects.equals(this.project, employeeSkillHistory.project) &&
        Objects.equals(this.skills, employeeSkillHistory.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, skills);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeSkillHistory {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
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

