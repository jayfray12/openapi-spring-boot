package com.redhat.todo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.todo.model.Skill;
import com.redhat.todo.model.SkillRating;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SkillRatingEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-24T17:30:20.735351-05:00[America/New_York]")
public class SkillRatingEntity   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("skill")
  private Skill skill;

  @JsonProperty("rating")
  private Integer rating;

  public SkillRatingEntity id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * A GUID that uniquely identifies a skill rathing.
   * @return id
  */
  @ApiModelProperty(example = "f1ad7649-eb70-4499-9c82-a63fe2c6dc71", value = "A GUID that uniquely identifies a skill rathing.")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SkillRatingEntity skill(Skill skill) {
    this.skill = skill;
    return this;
  }

  /**
   * A GUID that uniquely identifies a skill.
   * @return skill
  */
  @ApiModelProperty(value = "A GUID that uniquely identifies a skill.")

  @Valid

  public Skill getSkill() {
    return skill;
  }

  public void setSkill(Skill skill) {
    this.skill = skill;
  }

  public SkillRatingEntity rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  /**
   * The rating -1 -> 4 of the skill. -1 - 'Not Applicable', 0 - No Experience, 1 - Foundational, 2 - Experienced, 3 - Advanced, 4 - Expert
   * minimum: -1
   * maximum: 4
   * @return rating
  */
  @ApiModelProperty(value = "The rating -1 -> 4 of the skill. -1 - 'Not Applicable', 0 - No Experience, 1 - Foundational, 2 - Experienced, 3 - Advanced, 4 - Expert")

@Min(-1) @Max(4) 
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
    SkillRatingEntity skillRatingEntity = (SkillRatingEntity) o;
    return Objects.equals(this.id, skillRatingEntity.id) &&
        Objects.equals(this.skill, skillRatingEntity.skill) &&
        Objects.equals(this.rating, skillRatingEntity.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, skill, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillRatingEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

