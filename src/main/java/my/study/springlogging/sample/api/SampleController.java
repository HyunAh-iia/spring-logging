package my.study.springlogging.sample.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SampleController {

    @GetMapping("/sample")
    public String hello(@RequestParam(value="name", defaultValue="iia") String name) {
        return "hello! "+ name;
    }
}
