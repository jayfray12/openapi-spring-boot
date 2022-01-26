package com.redhat.todo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.redhat.todo.model.Employee;
import com.redhat.todo.model.EmployeeAssignment;
import com.redhat.todo.model.SkillRating;
import com.redhat.todo.model.SurveyGroup;
import com.redhat.todo.model.SurveySubmission;
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
 * SurveySubmissionWithSkillRating
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-24T17:30:20.735351-05:00[America/New_York]")
public class SurveySubmissionWithSkillRating   {
  @JsonProperty("surveyGroup")
  private SurveyGroup surveyGroup;

  @JsonProperty("ratings")
  @Valid
  private List<SkillRating> ratings = null;

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("surveyAuthor")
  private Employee surveyAuthor;

  @JsonProperty("surveySubject")
  private EmployeeAssignment surveySubject;

  @JsonProperty("submissionDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime submissionDate;

  /**
   * Returns a status of \"Complete\" or \"Incomplete\"
   */
  public enum SubmissionStatusEnum {
    COMPLETE("Complete"),
    
    INCOMPLETE("Incomplete");

    private String value;

    SubmissionStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SubmissionStatusEnum fromValue(String value) {
      for (SubmissionStatusEnum b : SubmissionStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("submissionStatus")
  private SubmissionStatusEnum submissionStatus;

  @JsonProperty("feedback")
  private String feedback;

  public SurveySubmissionWithSkillRating surveyGroup(SurveyGroup surveyGroup) {
    this.surveyGroup = surveyGroup;
    return this;
  }

  /**
   * A GUID that uniquely identifies the project.
   * @return surveyGroup
  */
  @ApiModelProperty(value = "A GUID that uniquely identifies the project.")

  @Valid

  public SurveyGroup getSurveyGroup() {
    return surveyGroup;
  }

  public void setSurveyGroup(SurveyGroup surveyGroup) {
    this.surveyGroup = surveyGroup;
  }

  public SurveySubmissionWithSkillRating ratings(List<SkillRating> ratings) {
    this.ratings = ratings;
    return this;
  }

  public SurveySubmissionWithSkillRating addRatingsItem(SkillRating ratingsItem) {
    if (this.ratings == null) {
      this.ratings = new ArrayList<>();
    }
    this.ratings.add(ratingsItem);
    return this;
  }

  /**
   * SkillRatings for the subject employee
   * @return ratings
  */
  @ApiModelProperty(value = "SkillRatings for the subject employee")

  @Valid

  public List<SkillRating> getRatings() {
    return ratings;
  }

  public void setRatings(List<SkillRating> ratings) {
    this.ratings = ratings;
  }

  public SurveySubmissionWithSkillRating id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * A GUID that uniquely identifies a survey submitted for a project.
   * @return id
  */
  @ApiModelProperty(example = "f1ad7649-eb70-4499-9c82-a63fe2c6dc71", value = "A GUID that uniquely identifies a survey submitted for a project.")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SurveySubmissionWithSkillRating surveyAuthor(Employee surveyAuthor) {
    this.surveyAuthor = surveyAuthor;
    return this;
  }
  /**
   * Employee that is reviewing.
   * @return surveyAuthor
  */
  @ApiModelProperty(value = "Employee that is reviewing.")

  @Valid

  public Employee getSurveyAuthor() {
    return surveyAuthor;
  }

  public void setSurveyAuthor(Employee surveyAuthor) {
    this.surveyAuthor = surveyAuthor;
  }

  public SurveySubmissionWithSkillRating surveySubject(EmployeeAssignment surveySubject) {
    this.surveySubject = surveySubject;
    return this;
  }
  /**
   * Employee that is being reviewed.
   * @return surveySubject
  */
  @ApiModelProperty(value = "Employee that is being reviewed.")

  @Valid

  public EmployeeAssignment getSurveySubject() {
    return surveySubject;
  }

  public void setSurveySubject(EmployeeAssignment surveySubject) {
    this.surveySubject = surveySubject;
  }

  public SurveySubmissionWithSkillRating submissionDate(OffsetDateTime submissionDate) {
    this.submissionDate = submissionDate;
    return this;
  }

  /**
   * The date the survey was submitted to the Feedback 360 Survey API in UTC.
   * @return submissionDate
  */
  @ApiModelProperty(value = "The date the survey was submitted to the Feedback 360 Survey API in UTC.")

  @Valid

  public OffsetDateTime getSubmissionDate() {
    return submissionDate;
  }

  public void setSubmissionDate(OffsetDateTime submissionDate) {
    this.submissionDate = submissionDate;
  }

  public SurveySubmissionWithSkillRating submissionStatus(SubmissionStatusEnum submissionStatus) {
    this.submissionStatus = submissionStatus;
    return this;
  }

  /**
   * Returns a status of \"Complete\" or \"Incomplete\"
   * @return submissionStatus
  */
  @ApiModelProperty(example = "Complete", value = "Returns a status of \"Complete\" or \"Incomplete\"")


  public SubmissionStatusEnum getSubmissionStatus() {
    return submissionStatus;
  }

  public void setSubmissionStatus(SubmissionStatusEnum submissionStatus) {
    this.submissionStatus = submissionStatus;
  }

  public SurveySubmissionWithSkillRating feedback(String feedback) {
    this.feedback = feedback;
    return this;
  }

  /**
   * Any feedback the author of the survey would like to include in the rating.
   * @return feedback
  */
  @ApiModelProperty(example = "John was a pleasure to work with and extremely knowledgeable in REST.", value = "Any feedback the author of the survey would like to include in the rating.")


  public String getFeedback() {
    return feedback;
  }

  public void setFeedback(String feedback) {
    this.feedback = feedback;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveySubmissionWithSkillRating surveySubmissionWithSkillRating = (SurveySubmissionWithSkillRating) o;
    return Objects.equals(this.surveyGroup, surveySubmissionWithSkillRating.surveyGroup) &&
        Objects.equals(this.ratings, surveySubmissionWithSkillRating.ratings) &&
        Objects.equals(this.id, surveySubmissionWithSkillRating.id) &&
        Objects.equals(this.surveyAuthor, surveySubmissionWithSkillRating.surveyAuthor) &&
        Objects.equals(this.surveySubject, surveySubmissionWithSkillRating.surveySubject) &&
        Objects.equals(this.submissionDate, surveySubmissionWithSkillRating.submissionDate) &&
        Objects.equals(this.submissionStatus, surveySubmissionWithSkillRating.submissionStatus) &&
        Objects.equals(this.feedback, surveySubmissionWithSkillRating.feedback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surveyGroup, ratings, id, surveyAuthor, surveySubject, submissionDate, submissionStatus, feedback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveySubmissionWithSkillRating {\n");
    
    sb.append("    surveyGroup: ").append(toIndentedString(surveyGroup)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    surveyAuthor: ").append(toIndentedString(surveyAuthor)).append("\n");
    sb.append("    surveySubject: ").append(toIndentedString(surveySubject)).append("\n");
    sb.append("    submissionDate: ").append(toIndentedString(submissionDate)).append("\n");
    sb.append("    submissionStatus: ").append(toIndentedString(submissionStatus)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
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

