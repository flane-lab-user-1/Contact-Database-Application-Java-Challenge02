package com.fastlane.contact.app.controller;


import com.fastlane.contact.app.model.Contact;
import com.fastlane.contact.app.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listContacts", contactService.getAllContacts());
        return "index";
    }

    @GetMapping("/showNewContactForm")
    public String showNewContactForm(Model model) {
        Contact contact = new Contact();
        model.addAttribute("contact", contact);
        return "new_contact";
    }


}
