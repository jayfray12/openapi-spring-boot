package com.redhat.todo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-24T17:30:20.735351-05:00[America/New_York]")
@Controller
@RequestMapping("${openapi.feedback360Survey.base-path:}")
public class SkillsApiController implements SkillsApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SkillsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
