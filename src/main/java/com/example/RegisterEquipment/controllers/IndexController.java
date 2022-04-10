package com.example.RegisterEquipment.controllers;

import com.example.RegisterEquipment.enums.ComputersAttributes;
import com.example.RegisterEquipment.models.typesEquipment.Computers;
import com.example.RegisterEquipment.services.typesEquipment.ComputersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    private String strValue;
    private Long intValue;

    /*@Autowired
    private BaseTypeService<Computers> baseTypeService;*/
    @Autowired
    private ComputersService computersService;

    @GetMapping("/")
    public String homePageOpen(Model model) {
        model.addAttribute("title", "Главная страница");
        List<Computers> list = null;
        /*str = "Холодильник";
        try {
            register = registerService.find(Register.Attribute.TYPE_EQUIPMENT, str);
        } catch (Exception ex) {

        }
        for (Register el: register) {
            el.print();
        }*/
        System.out.println();
        strValue = "Белый";
        try {
            list = computersService.find(ComputersAttributes.COLOR, strValue);
        } catch (Exception ex) {

        }
        for (Computers el: list) {
            el.print();
        }
        System.out.println();
        strValue = "Игровой";
        try {
            list = computersService.find(ComputersAttributes.CATEGORY, strValue);
        } catch (Exception ex) {

        }
        for (Computers el: list) {
            el.print();
        }
        System.out.println();
        intValue = Long.valueOf(40000);
        try {
            list = computersService.find(ComputersAttributes.COST, intValue);
        } catch (Exception ex) {

        }
        for (Computers el: list) {
            el.print();
        }
        return "index";
    }
    /*@Autowired
    public SiteUsersInterface siteUsersInterface;

    @RequestMapping(value="/accountPage/{id}", method= RequestMethod.POST, params="updateButton")
    public String addSiteUser(@RequestParam String login, @RequestParam String password, @RequestParam String nickname, Model model) {
        SiteUsers siteUser = new SiteUsers(login, password, nickname);
        siteUsersInterface.save(siteUser);
        WebsiteApplication.setSiteUserID(siteUsersInterface.save(siteUser).getId());
        WebsiteApplication.setSiteUserID(siteUser.getId());
        return "redirect:/accountPage/" + WebsiteApplication.getSiteUserID();
    }

    @RequestMapping(value="/accountPage/{id}", method= RequestMethod.POST, params="updateButton")
    public String updateSiteUser(@PathVariable(value = "id") Long id, @RequestParam String login, @RequestParam String password, @RequestParam String nickname, Model model) {
        SiteUsers siteUser = siteUsersInterface.findById(id).orElseThrow();
        siteUser.setLogin(login);
        siteUser.setPassword(password);
        siteUser.setNickname(nickname);
        siteUsersInterface.save(siteUser);
        return "redirect:/accountPage/" + WebsiteApplication.getSiteUserID();
    }

    @RequestMapping(value="/accountPage/{id}", method= RequestMethod.POST, params="deleteButton")
    public String deleteSiteUser(@PathVariable(value = "id") Long id, Model model) {
        SiteUsers siteUser = siteUsersInterface.findById(id).orElseThrow();
        siteUsersInterface.delete(siteUser);
        return "redirect:/";
    }*/
}
