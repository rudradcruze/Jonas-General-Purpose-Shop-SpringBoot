package bd.edu.diu.cis.admin.controller;

import bd.edu.diu.cis.library.model.Order;
import bd.edu.diu.cis.library.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;
import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public String adminOrders(Model model, Principal principal) {

        if (principal == null)
            return "redirect:/login";

        List<Order> orderList = orderService.listAll();
        model.addAttribute("orderList", orderList);
        model.addAttribute("title", "All Orders");
        model.addAttribute("size", orderList.size());

        return "orders";
    }

    @RequestMapping(value = "/accept-order/{id}", method = {RequestMethod.PUT , RequestMethod.GET})
    public String acceptOrder(@PathVariable("id")Long id, RedirectAttributes attributes){
        try {
            orderService.acceptOrder(id);
            attributes.addFlashAttribute("success", "Order Successfully Accepted!");
        }catch (Exception e){
            e.printStackTrace();
            attributes.addFlashAttribute("error", "Failed to Accept!");
        }
        return "redirect:/orders";
    }

}
