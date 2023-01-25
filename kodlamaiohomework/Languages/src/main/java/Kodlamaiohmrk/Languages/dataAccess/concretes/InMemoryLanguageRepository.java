package Kodlamaiohmrk.Languages.dataAccess.concretes;

import Kodlamaiohmrk.Languages.dataAccess.abstracts.LanguageRepository;
import Kodlamaiohmrk.Languages.entities.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
List<Language> languages;
public InMemoryLanguageRepository(){
    languages=new ArrayList<Language>();
    languages.add(new Language(1,"Java"));
    languages.add(new Language(2,"C#"));
   languages.add(new Language(3,"Python"));

}

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public void create(Language language) {
    languages.add(language);
    }

    @Override
    public void delete(int id) {
    languages.remove(id);
    }

    @Override
    public void update(Language language) {
        for (Language languages:languages) {
            if(languages.getId()==language.getId()){
                languages.setName(language.getName());
            }
        }
    }

    @Override
    public Language getById(int id) {
        for (Language language:languages) {
            if(language.getId()==id){
                return language;
            }
        }
        return null;
    }
}
