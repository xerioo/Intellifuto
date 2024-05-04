package GDE.futo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewCController {

    @GetMapping
    @RequestMapping("/addComp")
    public String getNewsPage() {
        return "new_comp";
    }

    @GetMapping
    @RequestMapping("/addRunner")
    public String getRunnerPage() {
        return "new_runner";
    }

    @GetMapping
    @RequestMapping("/addResults")
    public String getResPage() {
        return "new_results";
    }

    @GetMapping
    @RequestMapping("/listComps")
    public String getListCompPage() {
        return "list_comps";
    }

    @GetMapping
    @RequestMapping("/listRunners")
    public String getListRunnerPage() {
        return "list_runners";
    }
}

