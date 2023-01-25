package Kodlamaiohmrk.Languages.dataAccess.abstracts;

import Kodlamaiohmrk.Languages.entities.Language;

import java.util.List;

public interface LanguageRepository {
List<Language> getAll();
    void create(Language language);
    void delete(int id);
    void update(Language language);
    Language getById(int id);

}
