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
 * EmployeeAggregateSkillRatings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-24T17:30:20.735351-05:00[America/New_York]")
public class EmployeeAggregateSkillRatings   {
  @JsonProperty("skill")
  private String skill;

  @JsonProperty("rating")
  private Integer rating;

  public EmployeeAggregateSkillRatings skill(String skill) {
    this.skill = skill;
    return this;
  }

  /**
   * Skill that the consultant was rated on
   * @return skill
  */
  @ApiModelProperty(example = "Spring", value = "Skill that the consultant was rated on")


  public String getSkill() {
    return skill;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }

  public EmployeeAggregateSkillRatings rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Aggregate skill rating for the above skill
   * @return rating
  */
  @ApiModelProperty(example = "5", value = "Aggregate skill rating for the above skill")


  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeAggregateSkillRatings employeeAggregateSkillRatings = (EmployeeAggregateSkillRatings) o;
    return Objects.equals(this.skill, employeeAggregateSkillRatings.skill) &&
        Objects.equals(this.rating, employeeAggregateSkillRatings.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skill, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeAggregateSkillRatings {\n");
    
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

