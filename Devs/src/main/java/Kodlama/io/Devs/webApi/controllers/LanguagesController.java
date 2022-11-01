package Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Devs.business.abstracts.ILanguageService;
import Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class LanguagesController
{
    private ILanguageService languageService;

    @Autowired
    public LanguagesController(ILanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/")
    public String homePage()
    {
        return "ANA SAYFA";
    }

    @GetMapping("/getall")
    public List<Language> getAll() {
        return languageService.getAll();

    }

    @PostMapping("/add")
    public void add(Language language) {
        languageService.add(language);
    }

    @PostMapping("/update")
    public void update(Language language) {
        languageService.update(language);
    }
    @DeleteMapping("/delete")
    public void delete(int id) {
        languageService.delete(id);
    }
    @GetMapping("/getbyid/")
    public Language getById(int id) {
        return this.languageService.getById(id);
    }
}
