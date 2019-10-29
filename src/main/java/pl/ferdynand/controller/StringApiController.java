package pl.ferdynand.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.ferdynand.ui.model.response.TextDetails;
import pl.ferdynand.ui.model.response.ValidateString;

@RestController
@RequestMapping("api")
public class StringApiController {
    @GetMapping(value = "/text/validation/{text}")
    public ResponseEntity<TextDetails> textValidationInformation(@PathVariable String text){
        TextDetails returnTextDetails = ValidateString.buildTextDetails(text);
        return new ResponseEntity<>(returnTextDetails, HttpStatus.OK);
    }

}
