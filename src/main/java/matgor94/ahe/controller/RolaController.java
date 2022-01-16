package matgor94.ahe.controller;

import matgor94.ahe.domain.service.RolaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RolaController {

    private final RolaService rolaService;

    public RolaController(RolaService rolaService) {
        this.rolaService = rolaService;
    }

    @GetMapping("/role")
    public String pokazWszystkieRole(Model model){
        model.addAttribute("listaRol", rolaService.listaRol());
        return "role";
    }
}
