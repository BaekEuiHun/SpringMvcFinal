package hello.springmvc2.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController //뷰를 반환이 아니라 문자를 그대로 반환하다
public class MappingController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/hello-basic", method = RequestMethod.GET)//HTTP 메서드와 무관하게 호출
    public String helloBasic() {
        log.info("hello-basic");
        return "ok";
    }

    @GetMapping("/mapping/{userId}")
    public String mappingPath(@PathVariable("userId") String data) {
        return "ok";
    }
}
