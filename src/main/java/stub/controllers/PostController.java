package stub.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PostController {
    @PostMapping("/post/element")
    public @ResponseBody
    ResponseEntity postElement() {
        return new ResponseEntity("", HttpStatus.OK);
    }
}