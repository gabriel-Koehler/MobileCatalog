package com.mobile_store.mobile_store.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.mobile_store.mobile_store.Model.MobileProduct;
import com.mobile_store.mobile_store.Service.MobileProductService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@AllArgsConstructor
public class MobileProductController {
    MobileProductService service;

    @GetMapping("/")
    public String getSmartMobiles(Model model) {
        model.addAttribute("smartphones",service.findAll());
        model.addAttribute("pageTitle","Estoque");
        return "stock";
    }
    @GetMapping("/register")
    public String getRegisterSmartphone(Model model) {
        model.addAttribute("newSmartphone", new MobileProduct());
        model.addAttribute("pageTitle","Registro");
        return "register";
    }
    @PostMapping("/register")
    public String postMethodName(@ModelAttribute MobileProduct newMobileProduct,Model model) {
        
        return "success";
    }
    
    
}
