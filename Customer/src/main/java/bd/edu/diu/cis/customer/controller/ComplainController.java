package bd.edu.diu.cis.customer.controller;

import bd.edu.diu.cis.library.model.Complain;
import bd.edu.diu.cis.library.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ComplainController {

    @Autowired
    private ComplainService complainService;

    @GetMapping("/complain")
    public String complain(Model model) {
        model.addAttribute("complain", new Complain());
        model.addAttribute("title", "Send Complain");
        return "complain";
    }

    @PostMapping("/new-complain")
    public String sentComplain(@ModelAttribute("complain") Complain complain, Model model, RedirectAttributes attributes) {

        if (complain.getEmail() == null || complain.getName() == null || complain.getMessage() == null || complain.getSubject() == null || complain.getEmail().isEmpty() || complain.getName().isEmpty() || complain.getMessage().isEmpty() || complain.getSubject().isEmpty()) {
            attributes.addFlashAttribute("error", "Please make sure that you are fill up all the attributes!");
            model.addAttribute("complain", complain);
            return "complain";
        } else {
            attributes.addFlashAttribute("success", "Complain Send Successfully.");
            complainService.save(complain);
        }

        return "redirect:/complain";
    }
}
