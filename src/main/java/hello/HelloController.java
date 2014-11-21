package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

//    @RequestMapping("/")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

    @Autowired
    private BlogDao blogDao;

    @RequestMapping("/")
    public String index() {
        blogDao.insertNewContent("Hello Spring?");
        return "진짜?";
    }

}