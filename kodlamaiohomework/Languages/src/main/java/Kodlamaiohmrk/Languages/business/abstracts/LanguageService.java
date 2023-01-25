package Kodlamaiohmrk.Languages.business.abstracts;

import Kodlamaiohmrk.Languages.entities.Language;

import java.util.List;

public interface LanguageService {
    List<Language>getAll();
    void create(Language language)throws Exception;
    void delete(int id);
    void update(Language language)throws Exception;
    Language getById(int id);
}
