package com.example.RegisterEquipment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String homePageOpen(Model model) {
        model.addAttribute("title", "Главная страница");
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
