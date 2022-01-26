package com.redhat.todo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Skill
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-24T17:30:20.735351-05:00[America/New_York]")
public class Skill   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("skillsBaseId")
  private Integer skillsBaseId;

  @JsonProperty("skill")
  private String skill;

  @JsonProperty("description")
  private String description;

  @JsonProperty("category")
  private String category;

  @JsonProperty("active")
  private Boolean active = true;

  public Skill id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * A GUID that uniquely identifies a skill.
   * @return id
  */
  @ApiModelProperty(example = "d567521f-13a6-4237-936c-40bbbf388bc5", value = "A GUID that uniquely identifies a skill.")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Skill skillsBaseId(Integer skillsBaseId) {
    this.skillsBaseId = skillsBaseId;
    return this;
  }

  /**
   * An id from skills base
   * @return skillsBaseId
  */
  @ApiModelProperty(example = "1234", value = "An id from skills base")


  public Integer getSkillsBaseId() {
    return skillsBaseId;
  }

  public void setSkillsBaseId(Integer skillsBaseId) {
    this.skillsBaseId = skillsBaseId;
  }

  public Skill skill(String skill) {
    this.skill = skill;
    return this;
  }

  /**
   * The name of the skill.
   * @return skill
  */
  @ApiModelProperty(example = "Crucial Conversations", value = "The name of the skill.")


  public String getSkill() {
    return skill;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }

  public Skill description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the skill.
   * @return description
  */
  @ApiModelProperty(example = "The ability to have crucial conversations with clients.", value = "A description of the skill.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Skill category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The general category of the skill.
   * @return category
  */
  @ApiModelProperty(example = "leadership", value = "The general category of the skill.")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Skill active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Boolean to state if this skill is active
   * @return active
  */
  @ApiModelProperty(example = "true", value = "Boolean to state if this skill is active")


  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Skill skill = (Skill) o;
    return Objects.equals(this.id, skill.id) &&
        Objects.equals(this.skillsBaseId, skill.skillsBaseId) &&
        Objects.equals(this.skill, skill.skill) &&
        Objects.equals(this.description, skill.description) &&
        Objects.equals(this.category, skill.category) &&
        Objects.equals(this.active, skill.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, skillsBaseId, skill, description, category, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Skill {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    skillsBaseId: ").append(toIndentedString(skillsBaseId)).append("\n");
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

