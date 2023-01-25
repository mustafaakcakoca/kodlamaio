package Kodlamaiohmrk.Languages.webApi.controllers;

import Kodlamaiohmrk.Languages.business.abstracts.LanguageService;
import Kodlamaiohmrk.Languages.entities.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController{
    private LanguageService languageService;

@Autowired
    public LanguageController (LanguageService languageService){
    this.languageService=languageService;
}
@GetMapping("/getall")
    public List<Language>getAll(){
    return languageService.getAll();
    }
    @PostMapping("/create")
    public void create(Language language)throws Exception{
    languageService.create(language);
    }
    @PostMapping("/delete")
    public void delete(int id)throws Exception{
    languageService.delete(id);
    }
    @PostMapping("/update")
    public void update(Language language)throws Exception{
    languageService.update(language);
    }
    @GetMapping("/getbyid")
    public Language getById(int id)throws Exception{
    return languageService.getById(id);
    }

}
