package matgor94.ahe.controller;

import matgor94.ahe.domain.model.KlasyfikacjaEntity;
import matgor94.ahe.domain.service.KlasyfikacjaService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@Controller
@Transactional
public class KlasyfikacjaController {
    public final KlasyfikacjaService klasyfikacjaService;

    public KlasyfikacjaController(KlasyfikacjaService klasyfikacjaService) {
        this.klasyfikacjaService = klasyfikacjaService;
    }

    @RequestMapping(value = "/dodajKlasyfikacje", method = RequestMethod.GET)
    public String KlasyfikacjaEntityPrzygotowanie(Model model){
        model.addAttribute("klasyfikacja", new KlasyfikacjaEntity());
        return "dodajKlasyfikacja";
    }

    @RequestMapping(value = "/dodajKlasyfikacje", method = RequestMethod.POST)
    private String KlasyfikacjaEntityZapis(@Valid KlasyfikacjaEntity klasyfikacjaEntity, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "dodajKlasyfikacja";
        }
        klasyfikacjaService.dodaj(klasyfikacjaEntity);
        return "redirect:/klasyfikacje";
    }

    @GetMapping("/klasyfikacje")
    public String pokazWszystkieKlasyfikacje(Model model){
        model.addAttribute("listaKlasyfikacji", klasyfikacjaService.wszytskieKlasyfikacje());
        return "klasyfikacje";
    }
}
