package Kodlamaiohmrk.Languages.business.concretes;

import Kodlamaiohmrk.Languages.business.abstracts.LanguageService;
import Kodlamaiohmrk.Languages.dataAccess.abstracts.LanguageRepository;
import Kodlamaiohmrk.Languages.entities.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository){
        this.languageRepository=languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public void create(Language language) throws Exception {
        if(language.getName().isEmpty()){
            throw new Exception("İsim boş bırakılamaz");
    }
        for (Language languages:getAll()) {
            if(languages.getName().equals(language.getName())){
               throw new Exception("Bu isime ait bir programlama dili mevcut");
            }
        }
        languageRepository.create(language);
}

    @Override
    public void delete(int id) {
        languageRepository.delete(id);
    }

    @Override
    public void update(Language language) throws Exception {
        if(language.getName()==""){
            throw new Exception("Bu isim boş bırakılamaz");
        }
        languageRepository.update(language);
    }

    public Language getById(int id) {
        return languageRepository.getById(id);
    }
}
