package org.launchcode.projectliftoff.controllers;

import org.launchcode.projectliftoff.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Customer> listCustomer = service.listAll();
        model.addAttribute("listCustomer", listCustomer);


                return "index";
    }

    @RequestMapping("/new")
    public String showNewCustomerForm(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "new_customer";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        service.save(customer);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditCustomerForm(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_customer");
        Customer customer = service.get(id);
        mav.addObject("customer", customer);

        return mav;

    }
    @RequestMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable (name = "id") int id) {
        service.delete(id);

        return "redirect:/";
    }

}
