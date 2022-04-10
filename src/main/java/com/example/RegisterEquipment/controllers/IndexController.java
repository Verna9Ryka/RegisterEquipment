package com.example.RegisterEquipment.controllers;

import com.example.RegisterEquipment.enums.ComputersAttributes;
import com.example.RegisterEquipment.enums.RegisterAttributes;
import com.example.RegisterEquipment.models.Register;
import com.example.RegisterEquipment.models.typesEquipment.Computers;
import com.example.RegisterEquipment.services.RegisterService;
import com.example.RegisterEquipment.services.typesEquipment.ComputersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    private String strValue;
    private Long intValue;
    //private List<Register> list;
    private List<Computers> list;

    /*@Autowired
    private RegisterService service;*/
    @Autowired
    private ComputersService service;

    @GetMapping("/")
    public String homePageOpen(Model model) {
        model.addAttribute("title", "Главная страница");

        service.save(new Computers("HP Bundle 310 G7 MT", "310G7MT", "Желтый", "160х360х380 мм", 58800, "да", "AMD Ryzen 7 9600X", "Игровой"));

        try {
            list = service.find();
        } catch (Exception ex) {

        }
        for (Computers el: list) {
            el.print();
        }

        /*System.out.println();
        strValue = "компьютер";
        try {
            list = service.find(RegisterAttributes.TYPE_EQUIPMENT, strValue);
        } catch (Exception ex) {

        }
        for (Register el: list) {
            el.print();
        }
        System.out.println();*/
        /*strValue = "Белый";
        try {
            list = service.find(ComputersAttributes.COLOR, strValue);
        } catch (Exception ex) {

        }
        for (Computers el: list) {
            el.print();
        }*/
        /*System.out.println();
        strValue = "рАбоЧИЙ";
        try {
            list = service.find(ComputersAttributes.CATEGORY, strValue);
        } catch (Exception ex) {

        }
        for (Computers el: list) {
            el.print();
        }*/
        /*System.out.println();
        intValue = Long.valueOf(40000);
        try {
            list = service.find(ComputersAttributes.COST, intValue);
        } catch (Exception ex) {

        }
        for (Computers el: list) {
            el.print();
        }*/
        /*System.out.println();
        try {
            list = service.sortSelection(ComputersAttributes.COST, SortDirection.ASC);
        } catch (Exception ex) {

        }
        for (Computers el: list) {
            el.print();
        }
        System.out.println();
        try {
            list = service.sortSelection(ComputersAttributes.COST, SortDirection.DESC);
        } catch (Exception ex) {

        }
        for (Computers el: list) {
            el.print();
        }*/
        /*System.out.println();
        try {
            list = service.sortSelection(ComputersAttributes.TYPE_PROCESSOR, Sort.Direction.ASC);
        } catch (Exception ex) {

        }
        for (Computers el: list) {
            el.print();
        }
        System.out.println();
        try {
            list = service.sortSelection(ComputersAttributes.TYPE_PROCESSOR, Sort.Direction.DESC);
        } catch (Exception ex) {

        }
        for (Computers el: list) {
            el.print();
        }*/

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
