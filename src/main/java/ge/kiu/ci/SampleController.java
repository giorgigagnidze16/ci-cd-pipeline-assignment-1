package ge.kiu.ci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
  @GetMapping("/hello")
  public String getHello() {
    return "Hello World";
  }
}
