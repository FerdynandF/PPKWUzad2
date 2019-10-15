package pl.ferdynand.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.ferdynand.ui.model.response.ValidateString;

@RestController
@RequestMapping("api")
public class StringApiController {
    @GetMapping(value = "/validate")
    public StringBuilder paramInfo(@RequestParam(name ="param") String param){
        return new StringBuilder(ValidateString.tellVariableType(param));
    }

}
