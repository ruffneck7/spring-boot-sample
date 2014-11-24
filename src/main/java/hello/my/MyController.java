package hello.my;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by ruffneck7 on 14. 11. 21.
 */
@Controller
public class MyController {

    @ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="잘못된 접근입니다.")
    public class UrlNotFoundException extends RuntimeException {
        public UrlNotFoundException(String message) {
            super(message);
        }
    }

    @RequestMapping("/admin")
    public String index(Model model) {
        try {
            if(true) {
                throw new RuntimeException();
            }
        } catch (Exception e) {
            throw new UrlNotFoundException("heheheh");
        } finally {

        }

        return "index";
    }


}
