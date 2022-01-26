/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.redhat.todo.api;

import com.redhat.todo.model.Skill;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-24T17:30:20.735351-05:00[America/New_York]")
@Validated
@Api(value = "skills", description = "the skills API")
public interface SkillsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /skills : Fetch all the skills available to be added on a survey submission.
     * Returns all skills that are active in the Skills table.
     *
     * @param filterBy Field by which to filter (optional)
     * @param filterString String to filter on, query string (optional)
     * @param sortBy Field by which to sort (optional)
     * @param sortOrder Sort Order (optional)
     * @param offset Page offset (optional)
     * @param maxResults Maximum number of results to return, defaults to 20 (optional)
     * @return List of Skills that are available. (status code 200)
     */
    @ApiOperation(value = "Fetch all the skills available to be added on a survey submission.", nickname = "getAllSkills", notes = "Returns all skills that are active in the Skills table.", response = Skill.class, responseContainer = "List", tags={ "skills", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of Skills that are available.", response = Skill.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/skills",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Skill>> getAllSkills(@ApiParam(value = "Field by which to filter") @Valid @RequestParam(value = "filterBy", required = false) String filterBy,@ApiParam(value = "String to filter on, query string") @Valid @RequestParam(value = "filterString", required = false) String filterString,@ApiParam(value = "Field by which to sort") @Valid @RequestParam(value = "sortBy", required = false) String sortBy,@ApiParam(value = "Sort Order", allowableValues = "ASC, DESC") @Valid @RequestParam(value = "sortOrder", required = false) String sortOrder,@ApiParam(value = "Page offset") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Maximum number of results to return, defaults to 20") @Valid @RequestParam(value = "maxResults", required = false) Integer maxResults) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"skillsBaseId\" : 1234, \"skill\" : \"Crucial Conversations\", \"description\" : \"The ability to have crucial conversations with clients.\", \"active\" : true, \"id\" : \"d567521f-13a6-4237-936c-40bbbf388bc5\", \"category\" : \"leadership\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
