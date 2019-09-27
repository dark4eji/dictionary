package entities;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class GeneralController {
    @RequestMapping(value = {"/index", "/"}, method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String error(Model model) {
        return "error";
    }
}
