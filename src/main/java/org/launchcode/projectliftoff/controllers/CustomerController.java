package org.launchcode.projectliftoff.controllers;

import org.launchcode.projectliftoff.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Customer> listCustomer = service.listAll();
        model.addAttribute("listCustomer", listCustomer);


                return "landing_page";
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
