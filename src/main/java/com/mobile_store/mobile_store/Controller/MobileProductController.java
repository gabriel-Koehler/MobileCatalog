package com.mobile_store.mobile_store.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    @PostMapping("/update/{id}")
    public String postUpdateSmartphone(@PathVariable Long id,MobileProduct updaMobileProduct) {
        service.updateMobileProduct(id,updaMobileProduct);
        return "success";
    }
    
    @GetMapping("/update/{id}")
    public String getUpdateSmartphone(@PathVariable Long id, Model model) {
        model.addAttribute("findMobileProduct", service.findById(id));
        model.addAttribute("idProduct", id);
        model.addAttribute("pageTitle","Editar Smartphone");
        return "update";
    }
    @PostMapping("/register")
    public String postMethodName(MobileProduct newMobileProduct) {
        service.addMobileProduct(newMobileProduct);
        return "success";
    }
    @GetMapping("/register")
    public String getRegisterSmartphone(Model model) {
        model.addAttribute("newSmartphone", new MobileProduct());
        model.addAttribute("pageTitle","Registro de Smartphone");
        return "register";
    }
    @GetMapping("/delete/{id}")
    public String deleteSmartphone(@PathVariable Long id){
        service.deleteMobileProduct(id);
        return "success";
    }
    
}
