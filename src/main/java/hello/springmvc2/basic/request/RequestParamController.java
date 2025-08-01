package hello.springmvc2.basic.request;

import hello.springmvc2.basic.HelloData;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Slf4j
@Controller
public class RequestParamController {

    @RequestMapping("/request-param-v1")
    public void requestParamV1(HttpServletRequest request,
                               HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));
        log.info("username:{}, age:{}", username, age);
        response.getWriter().write("ok");
    }

    @ResponseBody
    @RequestMapping("/request-param-v2")
    public String requestParamV2(@RequestParam("username") String memberName,
                                 @RequestParam("age") int memberAge) {
        log.info("memberName:{}, memberAge:{}", memberName, memberAge);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/request-param-v3")
    public String requestParamV3(@RequestParam String username,
                                 @RequestParam int age) {
        log.info("username:{}, age:{}", username, age);
        return "success";
    }

    @ResponseBody //문자로 반환(return)
    @RequestMapping("/request-param-v4")
    public String requestParamV4(String username, int age) {
        log.info("username:{}, age:{}", username, age);
        return "success";
    }

    @ResponseBody //문자로 반환(return)
    //required = 값 필수 여부
    @RequestMapping("/request-param-required")
    public String requestParamRequired(@RequestParam(required = true) String username
            , @RequestParam(required = false) int age) {
        log.info("username:{}, age:{}", username, age);
        return "success";
    }
    
    @ResponseBody
    @RequestMapping("/model-attribute-v1")
    public String modelAttributeV1(@ModelAttribute HelloData helloData) {
        log.info("username:{}, age:{}", helloData.getUsername(), helloData.getAge());
        return "ok";
    }

}
