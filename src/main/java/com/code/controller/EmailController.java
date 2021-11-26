package com.code.controller;

import com.code.model.Email;
import com.code.service.EmailService;
import com.code.service.IEmailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/setting")
public class EmailController {

    private final IEmailService emailService = new EmailService();

    @GetMapping("")
    public String showAll(Model model) {
        Email email = emailService.showAll();
        model.addAttribute("email", email);
        return "/index";
    }

    @GetMapping("/edit")
    public String edit(Model model) {
        Email email = emailService.showAll();
        model.addAttribute("email", email);
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Email email, RedirectAttributes redirectAttributes) {
        emailService.update(email);
        redirectAttributes.addFlashAttribute("success","Update successfully!");
        return "redirect:/setting";
    }
}
